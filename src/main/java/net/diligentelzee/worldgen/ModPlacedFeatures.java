package net.diligentelzee.worldgen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> HYPERDENSE_UPPER_COAL_ORES_PLACED = registerKey("hyperdense_upper_coal_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_LOWER_COAL_ORES_PLACED = registerKey("hyperdense_lower_coal_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_COPPER_ORES_PLACED = registerKey("hyperdense_copper_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_LARGE_COPPER_ORES_PLACED = registerKey("hyperdense_large_copper_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_UPPER_IRON_ORES_PLACED = registerKey("hyperdense_upper_iron_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_MIDDLE_IRON_ORES_PLACED = registerKey("hyperdense_middle_iron_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_SMALL_IRON_ORES_PLACED = registerKey("hyperdense_small_iron_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_EXTRA_GOLD_ORES_PLACED = registerKey("hyperdense_extra_gold_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_GOLD_ORES_PLACED = registerKey("hyperdense_gold_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_LOWER_GOLD_ORES_PLACED = registerKey("hyperdense_lower_gold_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_NETHER_GOLD_ORES_PLACED = registerKey("hyperdense_nether_gold_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_QUARTZ_ORES_PLACED = registerKey("hyperdense_quartz_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_LAPIS_ORES_PLACED = registerKey("hyperdense_lapis_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_LAPIS_BURIED_ORES_PLACED = registerKey("hyperdense_lapis_buried_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_REDSTONE_ORES_PLACED = registerKey("hyperdense_redstone_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_LOWER_REDSTONE_ORES_PLACED = registerKey("hyperdense_lower_redstone_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_EMERALD_ORES_PLACED = registerKey("hyperdense_emerald_ores_placed");

    public static final ResourceKey<PlacedFeature> HYPERDENSE_DIAMOND_ORES_PLACED = registerKey("hyperdense_diamond_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_LARGE_DIAMOND_ORES_PLACED = registerKey("hyperdense_large_diamond_ores_placed");
    public static final ResourceKey<PlacedFeature> HYPERDENSE_BURIED_DIAMOND_ORES_PLACED = registerKey("hyperdense_buried_diamond_ores_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        //Coal
        register(context, HYPERDENSE_UPPER_COAL_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COAL_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(30,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(136), VerticalAnchor.top())));
        register(context, HYPERDENSE_LOWER_COAL_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COAL_ORES_BURIED_FEATURE),
                ModOrePlacement.commonOrePlacement(20,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(192))));

        //Copper
        register(context, HYPERDENSE_COPPER_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COPPER_ORES_SMALL_FEATURE),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112))));
        register(context, HYPERDENSE_LARGE_COPPER_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COPPER_ORES_LARGE_FEATURE),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112))));

        //Iron
        register(context, HYPERDENSE_UPPER_IRON_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRON_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(90,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(80), VerticalAnchor.absolute(384))));
        register(context, HYPERDENSE_MIDDLE_IRON_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRON_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(56))));
        register(context, HYPERDENSE_SMALL_IRON_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRON_ORES_SMALL_FEATURE),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(72))));

        //Gold
        register(context, HYPERDENSE_EXTRA_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLD_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(50,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(32), VerticalAnchor.absolute(256))));
        register(context, HYPERDENSE_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLD_ORES_BURIED_FEATURE),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, HYPERDENSE_LOWER_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLD_ORES_BURIED_FEATURE),
                ModOrePlacement.orePlacement(CountPlacement.of(UniformInt.of(0, 1)),
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-48))));
        register(context, HYPERDENSE_NETHER_GOLD_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_GOLD_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));

        register(context, HYPERDENSE_QUARTZ_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.QUARTZ_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));

        //Lapis
        register(context, HYPERDENSE_LAPIS_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAPIS_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
        register(context, HYPERDENSE_LAPIS_BURIED_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAPIS_ORES_BURIED_FEATURE),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))));

        //Redstone
        register(context, HYPERDENSE_REDSTONE_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.REDSTONE_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(15))));
        register(context, HYPERDENSE_LOWER_REDSTONE_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.REDSTONE_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(8,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(32))));

        //Emerald
        register(context, HYPERDENSE_EMERALD_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.EMERALD_ORES_FEATURE),
                ModOrePlacement.commonOrePlacement(100,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(480))));

        //Diamond
        register(context, HYPERDENSE_DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DIAMOND_ORES_SMALL_FEATURE),
                ModOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, HYPERDENSE_LARGE_DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DIAMOND_ORES_LARGE_FEATURE),
                ModOrePlacement.rareOrePlacement(9,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
        register(context, HYPERDENSE_BURIED_DIAMOND_ORES_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DIAMOND_ORES_BURIED_FEATURE),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    }


    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(CreateFillers.MOD_ID, name));
    }

    private static void register (BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                  Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
