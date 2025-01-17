package net.themilkturtle.victorian.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.themilkturtle.victorian.VictorianMod;

public class ModBlocks {


//    public static final Block CHARGED_AMETHYST_BLOCK = registerBlock("charged_amethyst_block",
//            new Block(AbstractBlock.Settings.create()
//                    .strength(2f)
//                    .requiresTool()
//                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
//            ));

    public static final Block CHARGED_AMETHYST_BLOCK = registerBlock("charged_amethyst_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block CLAY_BOULDER = registerBlock("clay_boulder",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS).sounds(BlockSoundGroup.PACKED_MUD)));

    public static final Block HADUS_LEAVES = registerBlock("hadus_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)));







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VictorianMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VictorianMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    //This is for fireproof Block Items
    private static Block registerFireBlock(String name, Block block) {
        registerFireproofBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VictorianMod.MOD_ID, name), block);
    }
    private static void registerFireproofBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VictorianMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().fireproof()));
    }


    public static void registerModBlocks() {
        VictorianMod.LOGGER.info("Registering Mod Blocks for" + VictorianMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}
