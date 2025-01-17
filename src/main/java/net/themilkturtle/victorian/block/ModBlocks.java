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
    public static final Block HADUS_WOOD = registerBlock("hadus_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.NETHER_WART)));
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

        // Texture
        public static final Identifier SPIRALIS_SIGN_TEXTURE = new Identifier(VictorianMod.MOD_ID, "entity/signs/spiralis");
    public static final Identifier SPIRALIS_HANGING_SIGN_TEXTURE = new Identifier(VictorianMod.MOD_ID, "entity/signs/hanging/spiralis");
    public static final Identifier SPIRALIS_HANGING_GUI_SIGN_TEXTURE = new Identifier(VictorianMod.MOD_ID, "textures/gui/hanging_signs/spiralis");

    public static final Block SPIRALIS_STANDING_SIGN = Registry.register(Registries.BLOCK, new Identifier(VictorianMod.MOD_ID, "spiralis_standing_sign"),
            new TerraformSignBlock(SPIRALIS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_SPIRALIS_STANDING_SIGN = Registry.register(Registries.BLOCK, new Identifier(VictorianMod.MOD_ID, "spiralis_wall_sign"),
            new TerraformWallSignBlock(SPIRALIS_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_SPIRALIS_SIGN = Registry.register(Registries.BLOCK, new Identifier(VictorianMod.MOD_ID, "spiralis_hanging_sign"),
            new TerraformHangingSignBlock(SPIRALIS_HANGING_SIGN_TEXTURE,SPIRALIS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_SPIRALIS_SIGN = Registry.register(Registries.BLOCK, new Identifier(VictorianMod.MOD_ID, "spiralis_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SPIRALIS_HANGING_SIGN_TEXTURE,SPIRALIS_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily SPIRALIS_FAMILY = BlockFamilies.register(ModBlocks.SPIRALIS_PLANKS)
            .sign(ModBlocks.SPIRALIS_STANDING_SIGN,ModBlocks.WALL_SPIRALIS_STANDING_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

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
