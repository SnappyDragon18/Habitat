package mod.schnappdragon.habitat.core.registry;

import mod.schnappdragon.habitat.common.world.gen.features.BigFairyRingMushroomFeature;
import mod.schnappdragon.habitat.common.world.gen.features.FairyRingFeature;
import mod.schnappdragon.habitat.common.world.gen.features.SlimeFernFeature;
import mod.schnappdragon.habitat.core.Habitat;
import net.minecraft.world.gen.feature.BigMushroomFeatureConfig;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class HabitatFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Habitat.MOD_ID);

    public final static RegistryObject<Feature<BlockClusterFeatureConfig>> SLIME_FERN_FEATURE = FEATURES.register("slime_fern",
            () -> new SlimeFernFeature(BlockClusterFeatureConfig.field_236587_a_));

    public final static RegistryObject<Feature<NoFeatureConfig>> FAIRY_RING_FEATURE = FEATURES.register("fairy_ring",
            () -> new FairyRingFeature(NoFeatureConfig.field_236558_a_));

    public final static RegistryObject<Feature<BigMushroomFeatureConfig>> HUGE_FAIRY_RING_MUSHROOM_FEATURE = FEATURES.register("huge_fairy_ring_mushroom",
            () -> new BigFairyRingMushroomFeature(BigMushroomFeatureConfig.CODEC));
}
