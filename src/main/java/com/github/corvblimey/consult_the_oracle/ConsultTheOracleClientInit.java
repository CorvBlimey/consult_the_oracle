package com.github.corvblimey.consult_the_oracle;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class ConsultTheOracleClientInit implements ClientModInitializer {
    public static ConsultTheOracleConfig CONFIG;

    @Override
    public void onInitializeClient() {

    }
}
