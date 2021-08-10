package com.github.corvblimey.consult_the_oracle;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Hand;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Util;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Formatting;

public class OracleItem extends Item {

    // Empty array list will provide a helpful warning to players/pack makers

    public static enum OracleType { ALL, BUILDER, CURSED, DAREDEVIL, EXPLORER};
    private OracleType thisOracleType = OracleType.ALL;  // The "default"

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
                user.world.playSoundFromEntity((PlayerEntity) null, user, SoundEvents.BLOCK_NOTE_BLOCK_CHIME, user.getSoundCategory(), 1F, 0.2F);
            } else {
                String msg = PromptHolder.getPrompt(thisOracleType, world.random);
                user.world.playSoundFromEntity((PlayerEntity) null, user, SoundEvents.BLOCK_NOTE_BLOCK_CHIME, user.getSoundCategory(), 0.5F, world.random.nextFloat() + 0.5F);
                user.sendSystemMessage(new LiteralText(msg).formatted(Formatting.ITALIC), Util.NIL_UUID);
            }
        }
        return TypedActionResult.success(itemStack);
    }
}