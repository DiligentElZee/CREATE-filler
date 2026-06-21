package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.diligentelzee.create_fillers.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.HYPERDENSE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get(),

                ModBlocks.HYPERDENSE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get(),

                ModBlocks.HYPERDENSE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get(),

                ModBlocks.HYPERDENSE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get(),

                ModBlocks.HYPERDENSE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get(),

                ModBlocks.HYPERDENSE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get(),

                ModBlocks.HYPERDENSE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get(),

                ModBlocks.HYPERDENSE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get(),

                ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get(),

                ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get()
        );

        tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.HYPERDENSE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get(),

                ModBlocks.HYPERDENSE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get(),

                ModBlocks.HYPERDENSE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get()
        );

        tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.HYPERDENSE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get(),

                ModBlocks.HYPERDENSE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get(),

                ModBlocks.HYPERDENSE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get()
        );

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                ModBlocks.HYPERDENSE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get()
        );

        tag(ModTags.Blocks.HYPERDENSE_ORES).add(
                ModBlocks.HYPERDENSE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get(),

                ModBlocks.HYPERDENSE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get(),

                ModBlocks.HYPERDENSE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get(),

                ModBlocks.HYPERDENSE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get(),

                ModBlocks.HYPERDENSE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get(),

                ModBlocks.HYPERDENSE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get(),

                ModBlocks.HYPERDENSE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get(),

                ModBlocks.HYPERDENSE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get(),

                ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get(),

                ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get()
        );

        tag(BlockTags.COAL_ORES).add(
                ModBlocks.HYPERDENSE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get()
        );
        tag(BlockTags.COPPER_ORES).add(
                ModBlocks.HYPERDENSE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get()
        );
        tag(BlockTags.DIAMOND_ORES).add(
                ModBlocks.HYPERDENSE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get()
        );
        tag(BlockTags.EMERALD_ORES).add(
                ModBlocks.HYPERDENSE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get()
        );
        tag(BlockTags.GOLD_ORES).add(
                ModBlocks.HYPERDENSE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get()
        );
        tag(BlockTags.IRON_ORES).add(
                ModBlocks.HYPERDENSE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get()
        );
        tag(BlockTags.LAPIS_ORES).add(
                ModBlocks.HYPERDENSE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get()
        );
        tag(BlockTags.REDSTONE_ORES).add(
                ModBlocks.HYPERDENSE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get(),
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get()
        );
    }
}
