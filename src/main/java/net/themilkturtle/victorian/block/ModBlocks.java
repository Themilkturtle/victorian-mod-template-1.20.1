package net.themilkturtle.victorian.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
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


    // HADUS WOOD TYPE GROUP
    public static final Block HADUS_LOG = registerBlock("hadus_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block HADUS_WOOD = registerBlock("hadus_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_HADUS_WOOD = registerBlock("stripped_hadus_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD).sounds(BlockSoundGroup.NETHER_WART)));
    public static final Block STRIPPED_HADUS_LOG = registerBlock("stripped_hadus_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG).sounds(BlockSoundGroup.NETHER_WART)));


    public static final Block HADUS_LEAVES = registerBlock("hadus_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).nonOpaque()));


    // SPIRALIS WOOD TYPE GROUP
    public static final Block SPIRALIS_LOG = registerBlock("spiralis_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG)));
    public static final Block SPIRALIS_WOOD = registerBlock("spiralis_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_WOOD)));
    public static final Block STRIPPED_SPIRALIS_WOOD = registerBlock("stripped_spiralis_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_WOOD)));
    public static final Block STRIPPED_SPIRALIS_LOG = registerBlock("stripped_spiralis_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG)));

    public static final Block SPIRALIS_PLANKS = registerBlock("spiralis_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));

    public static final Block SPIRALIS_LEAVES = registerBlock("spiralis_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LEAVES).nonOpaque()));

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
