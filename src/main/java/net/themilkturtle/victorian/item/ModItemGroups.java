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

                    })).build());
    public static void registerItemGroups() {
        VictorianMod.LOGGER.info("Registering Item Groups for " + VictorianMod.MOD_ID);
    }
}
