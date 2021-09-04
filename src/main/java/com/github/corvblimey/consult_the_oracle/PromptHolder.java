package com.github.corvblimey.consult_the_oracle;

import net.minecraft.text.BaseText;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PromptHolder {
    private static final PromptList defaultBuildPrompts = new PromptList("item.consult_the_oracle.builder_oracle.prompt", 60, OracleItem.OracleType.BUILDER);
    private static final PromptList defaultCursedPrompts = new PromptList("item.consult_the_oracle.cursed_oracle.prompt", 49, OracleItem.OracleType.CURSED);
    private static final PromptList defaultDaredevilPrompts = new PromptList("item.consult_the_oracle.daredevil_oracle.prompt", 44, OracleItem.OracleType.DAREDEVIL);
    private static final PromptList defaultExplorerPrompts = new PromptList("item.consult_the_oracle.explorer_oracle.prompt", 54, OracleItem.OracleType.EXPLORER);
    private static ArrayList<PromptList> moddedPrompts = new ArrayList<>();

    static ConsultTheOracleConfig CONFIG;

    public PromptHolder(ConsultTheOracleConfig promptConfig){
        CONFIG = promptConfig;
    }

    public void registerPrompts(PromptList promptsToRegister){
        moddedPrompts.add(promptsToRegister);
    }

    private static ArrayList<LiteralText> stringsAsLiteralText(ArrayList<String> stringPrompts){
        ArrayList<LiteralText> literalPrompts = new ArrayList<>();
        for(String prompt: stringPrompts){
            literalPrompts.add(new LiteralText(prompt));
        }
        return literalPrompts;
    }

    // This kludgery is to avoid having to do TODO: AutoConfig reload shenanigans
    // right out of the gate. List of lists of valid prompts assembled on the fly.
    public static BaseText getPrompt(OracleItem.OracleType oracleType, Random random){
        List<ArrayList<? extends BaseText>> availablePrompts = new ArrayList<>();
        if(oracleType == OracleItem.OracleType.BUILDER || oracleType == OracleItem.OracleType.ALL) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultBuildPrompts.getPrompts());
            // Unfortunately, we do have to do this every single time (see comment at top of function)
            // My expectation is that most players won't be using thousands of bonus prompts, but this
            // is a big part of why figuring out the autoconfig reload needs to be a high priority once
            // the base mod's out.
            availablePrompts.add(stringsAsLiteralText(CONFIG.bonusBuilderPrompts));
        }
        if(oracleType == OracleItem.OracleType.CURSED || oracleType == OracleItem.OracleType.ALL && CONFIG.addCursed) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultCursedPrompts.getPrompts());
            availablePrompts.add(stringsAsLiteralText(CONFIG.bonusCursedPrompts));
        }
        if(oracleType == OracleItem.OracleType.DAREDEVIL || oracleType == OracleItem.OracleType.ALL) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultDaredevilPrompts.getPrompts());
            availablePrompts.add(stringsAsLiteralText(CONFIG.bonusDaredevilPrompts));
        }
        if(oracleType == OracleItem.OracleType.EXPLORER || oracleType == OracleItem.OracleType.ALL) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultExplorerPrompts.getPrompts());
            availablePrompts.add(stringsAsLiteralText(CONFIG.bonusExplorerPrompts));
        }
        for(PromptList prompts : moddedPrompts){
            if(prompts.getCategory() == oracleType || oracleType == OracleItem.OracleType.ALL){
                availablePrompts.add(prompts.getPrompts());
            }
        }

        int numPrompts = 0;
        for (List<? extends BaseText> sublist : availablePrompts) {
            numPrompts += sublist.size();
        }

        if(numPrompts == 0) {
            return new TranslatableText("text.consult_the_oracle.no_prompts_found");
        }

        int chosenPromptIndex = random.nextInt(numPrompts);

        int maxIndexReached = 0;
        for (List<? extends BaseText> sublist : availablePrompts) {
            if(maxIndexReached + sublist.size() - 1 >= chosenPromptIndex) {
                return sublist.get(chosenPromptIndex - maxIndexReached);
            }
            maxIndexReached += sublist.size();
        }
        return new TranslatableText("text.consult_the_oracle.prompt_count_error");
    }
}
