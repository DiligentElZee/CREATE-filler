package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.diligentelzee.create_fillers.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateFillers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.HYPERDENSE_COAL_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get())
                .add(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get())
                .add(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get())
                .add(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get())
                .add(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_IRON_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get())
                .add(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get())
                .add(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get())
                .add(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get())
                ;

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.HYPERDENSE_IRON_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get())
                .add(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get())
                .add(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get())
                ;

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get())
                .add(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get())
                ;

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get())
                ;

        tag(ModTags.Blocks.HYPERDENSE_ORES)
                .add(ModBlocks.HYPERDENSE_COAL_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get())
                .add(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get())
                .add(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get())
                .add(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get())
                .add(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_IRON_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get())
                .add(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get())
                .add(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get())
                .add(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get())
                ;

        tag(BlockTags.COAL_ORES)
                .add(ModBlocks.HYPERDENSE_COAL_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get())
                ;
        tag(BlockTags.COPPER_ORES)
                .add(ModBlocks.HYPERDENSE_COPPER_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get())
                ;
        tag(BlockTags.DIAMOND_ORES)
                .add(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get())
                ;
        tag(BlockTags.EMERALD_ORES)
                .add(ModBlocks.HYPERDENSE_EMERALD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get())
                ;
        tag(BlockTags.GOLD_ORES)
                .add(ModBlocks.HYPERDENSE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get())
                .add(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get())
                ;
        tag(BlockTags.IRON_ORES)
                .add(ModBlocks.HYPERDENSE_IRON_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get())
                ;
        tag(BlockTags.LAPIS_ORES)
                .add(ModBlocks.HYPERDENSE_LAPIS_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get())
                ;
        tag(BlockTags.REDSTONE_ORES)
                .add(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())
                .add(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get())
                ;

    }
}
