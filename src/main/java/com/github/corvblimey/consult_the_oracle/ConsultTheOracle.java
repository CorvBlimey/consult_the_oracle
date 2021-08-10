package com.github.corvblimey.consult_the_oracle;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsultTheOracle implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "consult_the_oracle";
    public static final String MOD_NAME = "Consult the Oracle";
    public static ConsultTheOracleConfig CONFIG;
    public static PromptHolder PROMPTS;
    private static ArrayList<OracleItem> oracleOrder;
    private static final ItemGroup group = ItemGroup.MISC;

    public static final OracleItem ALL_ORACLE = new OracleItem(new Item.Settings().group(group).maxCount(1), OracleItem.OracleType.ALL);
    public static final OracleItem BUILD_ORACLE = new OracleItem(new Item.Settings().group(group).maxCount(1), OracleItem.OracleType.BUILDER);
    public static final OracleItem CURSED_ORACLE = new OracleItem(new Item.Settings().group(group).maxCount(1), OracleItem.OracleType.CURSED);
    public static final OracleItem DAREDEVIL_ORACLE = new OracleItem(new Item.Settings().group(group).maxCount(1), OracleItem.OracleType.DAREDEVIL);
    public static final OracleItem EXPLORER_ORACLE = new OracleItem(new Item.Settings().group(group).maxCount(1), OracleItem.OracleType.EXPLORER);

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        AutoConfig.register(ConsultTheOracleConfig.class, GsonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(ConsultTheOracleConfig.class).getConfig();
        PROMPTS = new PromptHolder(CONFIG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "all_oracle"), ALL_ORACLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "builder_oracle"), BUILD_ORACLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cursed_oracle"), CURSED_ORACLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "daredevil_oracle"), DAREDEVIL_ORACLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "explorer_oracle"), EXPLORER_ORACLE);
        oracleOrder = new ArrayList<>(Arrays.asList(ALL_ORACLE, BUILD_ORACLE, DAREDEVIL_ORACLE, EXPLORER_ORACLE, CURSED_ORACLE, ALL_ORACLE));
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

    public static OracleItem getNextOracle(Item currentOracle){
        for (int index=0; index < oracleOrder.size() - 1; index++) {
            Item potentialOracle = oracleOrder.get(index);
            if (currentOracle == potentialOracle) {
                return oracleOrder.get(index+1);
            }
        }
        return ALL_ORACLE;
    }
}