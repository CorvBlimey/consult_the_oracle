package com.github.corvblimey.consult_the_oracle;

import net.minecraft.text.TranslatableText;

import java.util.ArrayList;

public class PromptList{
    private final ArrayList<TranslatableText> prompts;
    private final OracleItem.OracleType category;

    public PromptList(String langString, int numToRegister, OracleItem.OracleType category){
        prompts = new ArrayList<>();
        for(int i=0; i<numToRegister; i++){
            System.out.println(langString+"."+i);
            System.out.println(new TranslatableText(langString+"."+i));
            prompts.add(new TranslatableText(langString+"."+i));
        }
        this.category = category;
    }

    public ArrayList<TranslatableText> getPrompts(){return prompts;}
    public OracleItem.OracleType getCategory(){return category;}
}
