package mod.schnappdragon.habitat.client.renderer;

import mod.schnappdragon.habitat.core.registry.HabitatBlocks;
import mod.schnappdragon.habitat.core.util.CompatHelper;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class HabitatRenderLayers {
    public static void registerRenderLayers() {
        RenderTypeLookup.setRenderLayer(HabitatBlocks.RAFFLESIA.get(), RenderType.getCutout());
        CompatHelper.registerCompat("quark", () -> RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_RAFFLESIA.get(), RenderType.getCutout()));

        RenderTypeLookup.setRenderLayer(HabitatBlocks.KABLOOM_BUSH.get(), RenderType.getCutout());
        CompatHelper.registerCompat("quark", () -> RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_KABLOOM_BUSH.get(), RenderType.getCutout()));

        RenderTypeLookup.setRenderLayer(HabitatBlocks.SLIME_FERN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.WALL_SLIME_FERN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_SLIME_FERN.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(HabitatBlocks.ORANGE_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.PINK_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.RED_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.YELLOW_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.FLOWERING_ORANGE_BALL_CACTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.FLOWERING_PINK_BALL_CACTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.FLOWERING_RED_BALL_CACTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.FLOWERING_YELLOW_BALL_CACTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_ORANGE_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_PINK_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_RED_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_YELLOW_BALL_CACTUS_FLOWER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_ORANGE_BALL_CACTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_PINK_BALL_CACTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_RED_BALL_CACTUS.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_YELLOW_BALL_CACTUS.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(HabitatBlocks.FAIRY_RING_MUSHROOM.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(HabitatBlocks.POTTED_FAIRY_RING_MUSHROOM.get(), RenderType.getCutout());
    }
}