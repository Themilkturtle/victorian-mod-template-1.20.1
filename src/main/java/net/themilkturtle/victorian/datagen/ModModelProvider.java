package net.themilkturtle.victorian.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.themilkturtle.victorian.block.ModBlocks;
import net.themilkturtle.victorian.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHARGED_AMETHYST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CLAY_BOULDER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HADUS_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HADUS_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPIRALIS_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPIRALIS_PLANKS);


        blockStateModelGenerator.registerLog(ModBlocks.SPIRALIS_LOG).log(ModBlocks.SPIRALIS_LOG).wood(ModBlocks.SPIRALIS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SPIRALIS_LOG).log(ModBlocks.STRIPPED_SPIRALIS_LOG).wood(ModBlocks.STRIPPED_SPIRALIS_WOOD);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHARGED_AMETHYST, Models.GENERATED);





    }



}
