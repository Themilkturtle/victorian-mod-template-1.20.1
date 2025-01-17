package net.themilkturtle.victorian.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.themilkturtle.victorian.VictorianMod;
import net.themilkturtle.victorian.block.ModBlocks;
import net.themilkturtle.victorian.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //3x3 recipe

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CHARGED_AMETHYST, RecipeCategory.DECORATIONS, ModBlocks.CHARGED_AMETHYST_BLOCK);


        //Shaped Crafting Recipes

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.CHARGED_AMETHYST,1).
                pattern("SSS").
                pattern("SRS").
                pattern("SSS").
                input('S',Items.AMETHYST_SHARD).
                input('R',Items.REDSTONE_BLOCK).
                criterion(hasItem(Items.AMETHYST_SHARD),conditionsFromItem(Items.AMETHYST_SHARD)).
                criterion(hasItem(ModItems.CHARGED_AMETHYST),conditionsFromItem(ModItems.CHARGED_AMETHYST)).
                offerTo(exporter, new Identifier(VictorianMod.MOD_ID, "shaped_charged_amethyst"));

      //Shapeless Crafting Recipes

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHARGED_AMETHYST, 4)
                .input(Items.AMETHYST_SHARD, 8)
                .input(Items.REDSTONE_BLOCK, 1)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, Identifier.of(VictorianMod.MOD_ID, "shapeless_charged_amethyst"));




    }
}

