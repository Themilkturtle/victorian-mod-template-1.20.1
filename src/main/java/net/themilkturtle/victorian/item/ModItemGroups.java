package net.themilkturtle.victorian.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.themilkturtle.victorian.VictorianMod;
import net.themilkturtle.victorian.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup VIC_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VictorianMod.MOD_ID, "vic_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vic_items"))
                    .icon(() -> new ItemStack(ModItems.CHARGED_AMETHYST)).entries(((displayContext, entries) -> {
                       entries.add(ModItems.CHARGED_AMETHYST);

                    })).build());

    public static final ItemGroup VIC_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VictorianMod.MOD_ID, "vic_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vic_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.CHARGED_AMETHYST_BLOCK)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.CHARGED_AMETHYST_BLOCK);
                        entries.add(ModBlocks.CLAY_BOULDER);
                        entries.add(ModBlocks.HADUS_LEAVES);
                        entries.add(ModBlocks.SPIRALIS_LEAVES);
                        entries.add(ModBlocks.SPIRALIS_LOG);
                        entries.add(ModBlocks.SPIRALIS_WOOD);
                        entries.add(ModBlocks.SPIRALIS_PLANKS);
                        entries.add(ModBlocks.STRIPPED_SPIRALIS_LOG);
                        entries.add(ModBlocks.STRIPPED_SPIRALIS_WOOD);
                        entries.add(ModBlocks.HADUS_LOG);
                        entries.add(ModBlocks.HADUS_WOOD);

                        entries.add(ModBlocks.STRIPPED_HADUS_LOG);
                        entries.add(ModBlocks.STRIPPED_HADUS_WOOD);


                    })).build());
    public static void registerItemGroups() {
        VictorianMod.LOGGER.info("Registering Item Groups for " + VictorianMod.MOD_ID);
    }
}
