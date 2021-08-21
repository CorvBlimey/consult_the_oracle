package com.github.corvblimey.consult_the_oracle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PromptHolder {
    // This holds all the prompts to keep the logic elsewhere terse.
    private static final ArrayList<String> defaultBuildPrompts = new ArrayList<>(Arrays.asList(
            "Build a habitable underwater structure",
            "Collect at least six different music discs",
            "Fortify a village against pillagers",
            "Refurbish a preexisting structure",
            "Make a bell ring when day breaks",
            "Stock a moat with axolotls",
            "Add a decorative path or road leading to your base, like a tree-lined boulevard",
            "Incorporate fire our soul fire into a design",
            "Evaluate your lighting. Consider upgrading from torches",
            "Add some indoor planter boxes or a mini tree",
            "Add a trashcan (such as lava with a trapdoor)",
            "Get a full set of enchanted armor",
            "Build a minecart launch track and a track to land on",
            "Build in a lush cave, working with the existing terrain shape",
            "Build a snow golem defensive bunker",
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
            "Prepare a full-course meal",
            "Automate ingredients for a baked good",
            "Build an aquarium, complete with corals",
            "Create a containment cell for a mob styled after their environment",
            "Set up your enchanting room",
            "Write a to-do list",
            "Create a beacon or conduit and activate it",
            "Incorporate more vertical space",
            "Automate a simple convenience, like doors opening",
            "Upgrade the most neglected part of your base",
            "Add some skylights",
            "Dig a basement (or sub-basement)",
            "Add a base defense that involves lava",
            "Add a tasteful flowing water feature",
            "Try a different style of build than your usual. Gothic? Modern? Colorful?",
            "Create a greenhouse full of flowers to house bees",
            "Organize your storage",
            "Terraform part of the nether. For example, import grass",
            "Have at least three floors in your base",
            "Add an outbuilding to your base",
            "Add a fishing pond",
            "Build a road somewhere (dirt paths count)",
            "Customize your shield",
            "Build a bridge",
            "Farm at least four kinds of fruit",
            "Get a silk touch tool",
            "Build a market place including at least one villager",
            "Obtain a shulker box",
            "Get a tool with three different enchantments",
            "Get a mending enchantment",
            "Do something with the fact that observer blocks look like faces",
            "Build a luxurious room for your pet(s)",
            "Carve a Nether highway"
    ));
    private static final ArrayList<String> defaultCursedPrompts = new ArrayList<>(Arrays.asList(
            "Taking the role of OSHA inspector, critique your base",
            "Succumb to hubris",
            "Perform a ritual to appease the RNG",
            "Disappoint your parents",
            "Cleanse sins with fire",
            "Switch between the other oracle forms and get one prompt from each. Do each one. No skips",
            "Demonstrate food-based structural integrity",
            "Set a timer for a few minutes. Enshrine whatever you're looking at when it goes off",
            "Reach an outer end island without using an end gateway portal",
            "Exploit a glitch of your choosing",
            "Try to survive without leaving a boat",
            "Take a bath, stinky",
            "Vent into a book and throw it into the ocean",
            "Make a serious fire hazard",
            "Attach bees on leads to fence posts. Guard bees",
            "Do what you have to do",
            "Perform a sacrifice to avert catastrophe",
            "Take a villager on a date",
            "Build an Aether portal",
            "Rube Goldberg machine",
            "uwu",
            "Send something on a slimeblock-powered adventure",
            "Use a chicken, pressure plates, and noteblocks to create a \"music\" machine",
            "Pander to an audience",
            "Invoke nostalgia",
            "Arrange a deathmatch (ex: golem vs. undead)",
            "Narrate what you're doing like you're a golf commentator",
            "Experience tranquility",
            "Mob cosplay",
            "Do something you'll regret later",
            "Get Real Anime With It",
            "Build something cursed",
            "Build a trap in your own base. See how long it takes you to forget about it",
            "Use hoppers/droppers/etc. to build an eternal item shower",
            "Play chicken with a goat on a cliffside",
            "Build a Sparta pit and survive by knocking mobs into it",
            "Scam villagers",
            "Throw a netherite ingot in lava and reclaim it without placing blocks or using fire resistance",
            "Praise the sun",
            "Use a fishing rod, minecart, boat, etc. to take a mob on a journey",
            "Set a name tag to \"Dinnerbone\" and give it a few tries",
            "Get a pet zoglin",
            "Give some axolotls suitably violent names",
            "Shoot yourself with an arrow",
            "Travel via ender pearl TNT cannon",
            "Give your base some  c o l o r",
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
            "360 noscope a target with a bow or crossbow",
            "Shoot down a shulker bullet",
            "Use an enderpearl to ravine-dive \"safely\"",
            "Reach max build height with a rocket-boosted elytra",
            "Build a minecart track somewhere hostile mobs spawn, then kill something while riding",
            "Jump off a cliff and activate elytra as near the ground as you can (without dying)",
            "On the surface at night, see how many skeletons you can get shooting at you at once",
            "Get from surface to lava via caves without fighting any mobs (invisibility may help)",
            "Kill a hostile mob with fall damage",
            "Kill at least three hostiles simultaneously",
            "Get a TNT or creeper explosion kill",
            "The next mob you kill becomes your target. For a night, kill all mobs of that type in sight before harming others",
            "Sprint to your next destination without switching to walking (you'll need to dodge blocks)",
            "Maximize your long jump (consider potions)",
            "Try a parkour course",
            "Kill a mob that's poisoned, withered, and on fire",
            "Perform a damage boost jump",
            "Get a music disc via mob drop",
            "Using skeleton friendly fire as your weapon, make it through a night",
            "Do a SICK RAMP while riding something (animal or vehicle)",
            "Reach the End if you haven't",
            "Kill a mob while you're in mid-air",
            "Use a fishing rod on a mob while you're flying",
            "Kill as many mobs in a night as you can without wearing armor",
            "Die gloriously while holding a Totem of Undying",
            "Take out a pillager raid without dealing direct damage",
            "Kill something with snowballs",
            "Skydive onto a slime block",
            "Stay in combat for as long as you can without getting hit. Consider poisoning yourself to 1/2 heart",
            "Add a parkour-based entrance to your base",
            "Fight from a narrow catwalk (such as a network of suspended fences)",
            "From the surface, explore to lapis ore using a bucket of lava as your only weapon",
            "Kill with a fishing rod (consider dragging something into lava)",
            "Kill something with a firework fired from a crossbow",
            "Damage or kill a phantom with a splash potion",
            "Survive a night unarmored using only a trident",
            "Fight the Wither in fair combat",
            "Successfully complete an mlg water bucket jump",
            "Store your gear and re-equip yourself with what you loot from mobs. Stop when you die or get a full kit"
    ));
    private static final ArrayList<String> defaultExplorePrompts = new ArrayList<>(Arrays.asList(
            "See a mesa before you die",
            "Get onto the roof of the Nether",
            "Elytra-jump off a mountain and go as far as you can",
            "Check the biome you're currently in. Explore until you find another instance of it",
            "Swim with dolphins",
            "Find a woodland mansion if you haven't yet",
            "Reach and trade with a new village",
            "See a sunrise or sunset from a mountain peak",
            "Explore a coral reef",
            "Befriend a cat",
            "Sketch a physical map of your base and nearby landmarks",
            "Barter with piglins",
            "Find a temple and leave an offering",
            "Discover a structure in the Nether",
            "Grab a compass in case of emergency, then get lost and try to find your way back using landmarks",
            "Find all four types of giant fungi in their natural habitat",
            "Try tree-to-tree parkour in the jungle",
            "Repair a destroyed portal in the Nether and see where you end up",
            "Restore two overworld Nether portals and try to find the route between them in the Nether",
            "Get an axolotl buddy in a bucket",
            "Witness the void",
            "Find a rare biome variant",
            "Use chorus fruit in cave exploration",
            "Trade a fox some food for whatever it has in its mouth",
            "Walk in as straight a line as you can until you reach the ocean",
            "Find an unusual rock formation, such as a floating island",
            "Take a ride on a strider",
            "Adopt a wolf pack",
            "Reach quintuple-digit coordinates (such as x:10,000)",
            "Fill out an entire map",
            "Go on a ride downriver at night",
            "Boat on natural ice",
            "Discover a village hidden in a swamp, jungle, forest, or similarly dense biome",
            "Find a stronghold",
            "Salvage an abandoned minecart track",
            "Cure a zombie villager",
            "Find a natural waterfall",
            "Follow a dolphin to treasure (feed it raw cod/salmon)",
            "Collect flowers for a multi-biome flower garden. Get both short and tall ones",
            "Go on a multi-day hike",
            "Get some fish in buckets and build them an appropriate habitat",
            "Replicate your favorite biome as a landscaping project",
            "Improve the land around your base",
            "Start a horse-breeding project, if you haven't",
            "Gallop through the plains on an animal of your choosing",
            "Witness a goat performing a high jump",
            "Follow a treasure map",
            "Meet a mooshroom",
            "Go on a hike to collect seven different flower species",
            "Make an underwater shelter (with air/bubble supply, and optionally nightvision) so you can watch the fish",
            "With a flower in hand, hold an audience with at least three bees",
            "Listen to a music disc in a \"thematic\" location (like \"13\" underground in the dark)",
            "Next time an enemy dies, whatever direction the corpse flies is your new heading. Onwards!",
            "Get a gift from a cat (70% chance when you sleep and they're nearby + not ordered to sit)",
            "Follow a river until it ends"
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
