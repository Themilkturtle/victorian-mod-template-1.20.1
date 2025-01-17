package net.themilkturtle.victorian;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
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
		StrippableBlockRegistry.register(ModBlocks.SPIRALIS_LOG, ModBlocks.STRIPPED_SPIRALIS_LOG);
		StrippableBlockRegistry.register(ModBlocks.SPIRALIS_WOOD, ModBlocks.STRIPPED_SPIRALIS_WOOD);


//		ModLootTableModifiers.modifyLootTables();


	}
}