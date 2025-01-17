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


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHARGED_AMETHYST, Models.GENERATED);



    }



}
