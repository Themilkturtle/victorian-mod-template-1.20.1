package net.themilkturtle.victorian.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.themilkturtle.victorian.VictorianMod;
import net.themilkturtle.victorian.block.ModBlocks;

public class ModItems {


    //signs
    public static final Item SPIRALIS_SIGN  = registerItem("spiralis_sign",
            new SignItem(new FabricItemSettings().maxCount(16),ModBlocks.SPIRALIS_STANDING_SIGN,ModBlocks.WALL_SPIRALIS_STANDING_SIGN));


    public static final Item HANGING_SPIRALIS_SIGN = registerItem("spiralis_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_SPIRALIS_SIGN, ModBlocks.WALL_HANGING_SPIRALIS_SIGN, new FabricItemSettings().maxCount(16)));



    //Raw items
    public static final Item CHARGED_AMETHYST = registerItem("charged_amethyst", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VictorianMod.MOD_ID, name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(CHARGED_AMETHYST);
    }

    public static void registerModItems() {
        VictorianMod.LOGGER.info("Registering Mod Items for " + VictorianMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
