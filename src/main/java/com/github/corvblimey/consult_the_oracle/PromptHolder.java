package com.github.corvblimey.consult_the_oracle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PromptHolder {
    // This holds all the prompts to keep the logic elsewhere terse.
    private static final ArrayList<String> defaultBuildPrompts = new ArrayList<>(Arrays.asList(
            "Add a kitchen",
            "Make something cozy",
            "Build a farm for livestock",
            "Add a new farm to a village",
            "Build a \"vacation home\" in a village",
            "Build an outpost in your mine for restocking",
            "Do something with a minecart and tracks",
            "Automate something. Maybe a farm?",
            "Use glazed terracotta",
            "Try out a patterned floor",
            "Design a custom banner",
            "Try out a floating base",
            "Build a habitable underwater structure",
            "Collect at least six music discs",
            "Fortify a village against pillagers",
            "Make a bell ring when day breaks",
            "Stock a moat with axolotls",
            "Add a trashcan (such as lava with a trapdoor)",
            "Get a full set of enchanted armor",
            "Build a minecart launch track and a track to land on",
            "Build in a lush cave, working with the existing terrain shape",
            "Build a snow golem defensive bunker",
            "Refurbish a preexisting structure",
            "Cook something complicated",
            "Add a base defense that involves lava",
            "Add a tasteful falling water feature",
            "Try a different style of build than your usual. Gothic? Modern? Colorful?",
            "Create a greenhouse full of flowers to house bees",
            "Organize your storage",
            "Terraform part of the nether. For example, import grass",
            "Have at least three floors in your base",
            "Add an outbuilding to your base",
            "Build a road (dirt path does count)",
            "Customize your shield",
            "Farm at least four kinds of fruit",
            "Build a market place including at least one villager",
            "Obtain a shulker box",
            "Get a mending enchantment",
            "Do something with the fact that observer blocks look like faces",
            "Build a luxurious room for your pet(s)",
            "Carve a Nether highway"
    ));
    private static final ArrayList<String> defaultCursedPrompts = new ArrayList<>(Arrays.asList(
            "Take a villager on a date",
            "Perform a ritual to appease the RNG",
            "Smack talk",
            "Disappoint your parents",
            "Build a glorious nerd pole",
            "Cleanse sins with fire",
            "Out-dance a parrot",
            "Demonstrate food-based structural integrity",
            "Set a timer for a few minutes. Build a shrine to whatever you're looking at when it goes off",
            "Taking the role of OSHA inspector, analyze your base",
            "Reach an outer end island without using an end gateway portal",
            "Exploit a glitch of your choosing",
            "Try to survive without leaving a boat",
            "Take a bath, stinky",
            "Vent into a book and throw it into the ocean",
            "Make a serious fire hazard",
            "Do what you have to do",
            "Perform a sacrifice to avert catastrophe",
            "Succumb to hubris",
            "Build an Aether portal",
            "Experience tranquility",
            "Mob cosplay",
            "Get Real Anime With It",
            "Build something cursed",
            "Use hoppers/droppers/etc. to build an eternal item shower",
            "Play chicken with a goat on a cliffside",
            "Build a Sparta pit and survive by knocking mobs into it",
            "Scam villagers",
            "Praise the sun",
            "Use a fishing rod, minecart, boat, etc. to take a mob on a journey",
            "Set a name tag to \"Dinnerbone\" and give it a few tries",
            "Get a pet zoglin",
            "Give some axolotls suitably violent names",
            "Shoot yourself with an arrow",
            "Travel via ender pearl tnt cannon",
            "Give your base some  c o l o r",
            "Detroit: Become Shrek",
            "Singleplayer can have a little griefing, as a treat",
            "Teach pillagers the meaning of fear",
            "Treat yo self",
            "Go to the mod site of your choosing and install the most recently-added compatible mod"
    ));
    private static final ArrayList<String> defaultDaredevilPrompts = new ArrayList<>(Arrays.asList(
            "Kill a hostile mob using only sand blocks",
            "Go on a rampage",
            "Anger the zombie piglins",
            "Speedrun touching bedrock",
            "Kill a ghast with a punch",
            "Use an enderpearl to ravine-dive \"safely\"",
            "Reach max build height with a rocket-boosted elytra",
            "Build a minecart track somewhere hostile mobs spawn, then kill something while riding",
            "Jump off a cliff and activate elytra as near the ground as you can (without dying)",
            "On the surface at night, see how many skeletons you can get shooting at you",
            "Get from surface to lava via caves without fighting any mobs (invisibility may help)",
            "Kill a hostile mob using fall damage",
            "Kill at least three hostiles at the same time",
            "Get a music disc via mob drop",
            "Reach the End if you haven't",
            "Kill a mob while you're in mid-air",
            "Use a fishing rod on a mob while you're flying",
            "Kill as many mobs in a night as you can (without wearing armor)",
            "Die gloriously while holding a Totem of Undying",
            "Kill a blaze with snowballs",
            "Skydive onto slime blocks",
            "Add a parkour-based entrance to your base",
            "Fight from a narrow catwalk (such as a network of suspended fences)",
            "From the surface, explore to gold level using a bucket of lava as your only weapon",
            "Kill with a fishing rod (consider dragging something into lava)",
            "Kill something with a firework fired from a crossbow",
            "Damage or kill a phantom with a splash potion",
            "Survive a night unarmored using only a trident",
            "Fight the Wither in fair combat",
            "Successfully complete an mlg water bucket jump",
            "Store your gear and re-equip yourself with what you loot from mobs. Stop when you die or get a full kit"
    ));
    private static final ArrayList<String> defaultExplorePrompts = new ArrayList<>(Arrays.asList(
            "Visit a mesa before you die",
            "Get onto the roof of the Nether",
            "Elytra-jump off a mountain and go as far as you can",
            "Check the biome you're currently in. Explore until you find another instance of it",
            "Swim with dolphins",
            "Find a woodland mansion if you haven't yet",
            "Reach and trade with a new village",
            "See a sunrise or sunset from a mountain peak",
            "Explore a coral reef",
            "Befriend a cat",
            "Grab a compass in case of emergency, then get lost and try to find your way back using landmarks",
            "Find all four types of giant fungi in their natural habitat",
            "Try tree-to-tree parkour in the jungle",
            "Repair a destroyed portal in the Nether and see where you end up",
            "Make friends with some wolves",
            "Get an axolotl buddy in a bucket",
            "Witness the void",
            "Find a rare biome variant",
            "Use chorus fruit in cave exploration",
            "Trade a fox some food for whatever it has in its mouth",
            "Walk in as straight a line as you can until you reach the ocean",
            "Find an unusual rock formation",
            "Take a ride on a strider",
            "Adopt a wolf pack",
            "Reach quintuple-digit coordinates (such as x:10,000)",
            "Fill out an entire map",
            "Go on a ride downriver at night",
            "Boat on natural ice",
            "Discover a village hidden in a swamp, jungle, forest, or similarly dense biome",
            "Find a stronghold",
            "(Partially) repair and ride an abandoned minecart track",
            "Cure a zombie villager",
            "Follow a dolphin to treasure (feed it raw cod/salmon)",
            "Collect flowers for a flower garden",
            "Go on a multi-day hike",
            "Get some fish in buckets and build them an appropriate habitat",
            "Replicate your favorite biome as a landscaping project",
            "Improve the land around your base",
            "Start a horse-breeding project, if you haven't",
            "Gallop through the plains on an animal of your choosing",
            "Witness a goat performing a high jump",
            "Follow a treasure map",
            "Make an underwater shelter (with air/bubble supply) so you can watch the fish",
            "With a flower in hand, hold an audience with at least three bees",
            "Listen to a music disc in a \"thematic\" location (like \"13\" underground in the dark)",
            "Detonate TNT on a mob. Whatever direction the corpse flies is your new heading. Onwards!",
            "Get a gift from a cat (70% chance when you sleep and they're nearby + not ordered to sit)"
    ));

    static ConsultTheOracleConfig CONFIG;

    public PromptHolder(ConsultTheOracleConfig promptConfig){
        // Not sure how I'm allowing mod compat yet. Prolly premature to think about.
        CONFIG = promptConfig;
    }

    // This kludgery is to avoid having to do cursed AutoConfig reload shenanigans
    public static String getPrompt(OracleItem.OracleType oracleType, Random random){
        List<ArrayList<String>> availablePrompts = new ArrayList<>();
        if(oracleType == OracleItem.OracleType.BUILDER || oracleType == OracleItem.OracleType.ALL) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultBuildPrompts);
            availablePrompts.add(CONFIG.bonusBuildPrompts);
        }
        if(oracleType == OracleItem.OracleType.CURSED || oracleType == OracleItem.OracleType.ALL && CONFIG.addCursed) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultCursedPrompts);
            availablePrompts.add(CONFIG.bonusCursedPrompts);
        }
        if(oracleType == OracleItem.OracleType.DAREDEVIL || oracleType == OracleItem.OracleType.ALL) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultDaredevilPrompts);
            availablePrompts.add(CONFIG.bonusDaredevilPrompts);
        }
        if(oracleType == OracleItem.OracleType.EXPLORER || oracleType == OracleItem.OracleType.ALL) {
            if (CONFIG.useDefaultPrompts) availablePrompts.add(defaultExplorePrompts);
            availablePrompts.add(CONFIG.bonusExplorePrompts);
        }

        int numPrompts = 0;
        for (List<String> sublist : availablePrompts) {
            numPrompts += sublist.size();
        }

        if(numPrompts == 0) {
            return "The oracle falls silent; it has nothing to say. Check your configs!";
        }

        int chosenPromptIndex = random.nextInt(numPrompts);

        int maxIndexReached = 0;
        for (List<String> sublist : availablePrompts) {
            if(maxIndexReached + sublist.size() - 1 >= chosenPromptIndex) {
                return sublist.get(chosenPromptIndex - maxIndexReached);
            }
            maxIndexReached += sublist.size();
        }
        return "Prompt list length exceeded while searching from prompt. Report this to the maintainer!";
    }
}
