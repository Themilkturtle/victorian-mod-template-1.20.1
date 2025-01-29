package net.themilkturtle.victorian.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.themilkturtle.victorian.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.SPIRALIS_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.SPIRALIS_LOG.asItem())
                .add(ModBlocks.SPIRALIS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SPIRALIS_LOG.asItem())
                .add(ModBlocks.STRIPPED_SPIRALIS_WOOD.asItem())
                .add(ModBlocks.HADUS_LOG.asItem())
                .add(ModBlocks.HADUS_WOOD.asItem())

                .add(ModBlocks.STRIPPED_HADUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_HADUS_WOOD.asItem());

    }
}
