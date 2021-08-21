package com.github.corvblimey.consult_the_oracle;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import java.util.ArrayList;

@Config(name = "consult_the_oracle")
public class ConsultTheOracleConfig implements ConfigData {
    public boolean addCursed = false;
    public boolean giveOracleOnFirstJoin = true;
    public boolean useDefaultPrompts = true;
    public ArrayList<String> bonusBuilderPrompts = new ArrayList<>();
    public ArrayList<String> bonusCursedPrompts = new ArrayList<>();
    public ArrayList<String> bonusDaredevilPrompts = new ArrayList<>();
    public ArrayList<String> bonusExplorerPrompts = new ArrayList<>();
}