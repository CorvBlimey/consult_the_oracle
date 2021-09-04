package com.github.corvblimey.consult_the_oracle;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.*;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.sound.SoundEvents;

public class OracleItem extends Item {

    public enum OracleType { ALL, BUILDER, CURSED, DAREDEVIL, EXPLORER};
    private final OracleType thisOracleType;

    public OracleItem(final Settings settings, OracleType oracleType) {
        super(settings);
        thisOracleType = oracleType;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (world.isClient) {
            return TypedActionResult.success(itemStack);
        } else {
            if (user.isInSneakingPose()){
                Item nextOracle = ConsultTheOracle.getNextOracle(itemStack.getItem());
                user.setStackInHand(hand, new ItemStack(nextOracle));
                user.world.playSoundFromEntity(null, user, SoundEvents.BLOCK_NOTE_BLOCK_CHIME, user.getSoundCategory(), 1F, 0.2F);
            } else {
                Text msg = PromptHolder.getPrompt(thisOracleType, world.random);
                user.world.playSoundFromEntity(null, user, SoundEvents.BLOCK_NOTE_BLOCK_CHIME, user.getSoundCategory(), 0.5F, world.random.nextFloat() + 0.5F);
                user.sendMessage(msg, true);
            }
        }
        return TypedActionResult.success(itemStack);
    }
}