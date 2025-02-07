package net.themilkturtle.victorian.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.themilkturtle.victorian.block.ModBlocks;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHARGED_AMETHYST_BLOCK);
        addDrop(ModBlocks.CLAY_BOULDER);

        addDrop(ModBlocks.HADUS_LEAVES, leavesDrops(ModBlocks.HADUS_LEAVES, ModBlocks.CHARGED_AMETHYST_BLOCK, 0.0025f)); //TODO Change drop to Sapling

        addDrop(ModBlocks.SPIRALIS_LEAVES, leavesDrops(ModBlocks.SPIRALIS_LEAVES, ModBlocks.CHARGED_AMETHYST_BLOCK, 0.0025f)); //TODO Change drop to Sapling




        addDrop(ModBlocks.SPIRALIS_WOOD);
        addDrop(ModBlocks.SPIRALIS_LOG);
        addDrop(ModBlocks.STRIPPED_SPIRALIS_LOG);
        addDrop(ModBlocks.STRIPPED_SPIRALIS_WOOD);
        addDrop(ModBlocks.SPIRALIS_PLANKS);
        addDrop(ModBlocks.HADUS_WOOD);

        addDrop(ModBlocks.HADUS_LOG);
        addDrop(ModBlocks.STRIPPED_HADUS_LOG);
        addDrop(ModBlocks.STRIPPED_HADUS_WOOD);



        //ore Drops
//        addDrop(ModBlocks.KEVIN_ORE, oreDrops(ModBlocks.KEVIN_ORE, ModItems.KEVIN_SHARD));

        //Copper like ore drops
//        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));
    }


    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
