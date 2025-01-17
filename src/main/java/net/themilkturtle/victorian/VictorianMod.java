package net.themilkturtle.victorian;

import net.fabricmc.api.ModInitializer;

import net.themilkturtle.victorian.block.ModBlocks;
import net.themilkturtle.victorian.item.ModItemGroups;
import net.themilkturtle.victorian.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VictorianMod implements ModInitializer {
	public static final String MOD_ID = "victorian-mod";
//if your reading this you're a stinky head :)
// IM NOT A STINKY HEAD :(

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
//		ModWorldGeneration.generateModWordGen();
//		ModOreGeneration.generateOres();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
//		ModLootTableModifiers.modifyLootTables();


	}
}