package net.themilkturtle.victorian;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.themilkturtle.victorian.block.ModBlocks;

public class VictorianModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HADUS_LEAVES, RenderLayer.getCutout());


    }
}
