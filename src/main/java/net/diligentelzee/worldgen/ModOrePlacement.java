package net.diligentelzee.worldgen;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    public static final ResourceKey<PlacedFeature> HD_ORE_CLUMPS = PlacementUtils.createKey("hd_ore_clumps");
    public static final ResourceKey<PlacedFeature> HD_LARGE_ORE_CLUMPS = PlacementUtils.createKey("hd_large_ore_clumps");
    public static final ResourceKey<PlacedFeature> HD_BURIED_ORE_CLUMPS = PlacementUtils.createKey("hd_buried_ore_clumps");

    public static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRange) {
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRange, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRange) {
        return orePlacement(CountPlacement.of(pCount), pHeightRange);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), pHeightRange);
    }
}
