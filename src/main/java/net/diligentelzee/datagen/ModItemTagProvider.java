package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.diligentelzee.create_fillers.util.ModTags;
import net.marmar.enhanced_ore_variety.data.tag.EOVTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, CreateFillers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ModTags.Items.HYPERDENSE_ORE_ITEMS).add(
                ModBlocks.HYPERDENSE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get().asItem(),

                ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get().asItem()
        );

        tag(ItemTags.COAL_ORES).add(
                ModBlocks.HYPERDENSE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_COAL_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE.get().asItem()
        );
        tag(ItemTags.COPPER_ORES).add(
                ModBlocks.HYPERDENSE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_COPPER_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE.get().asItem()
        );
        tag(ItemTags.DIAMOND_ORES).add(
                ModBlocks.HYPERDENSE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE.get().asItem()
        );
        tag(ItemTags.EMERALD_ORES).add(
                ModBlocks.HYPERDENSE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE.get().asItem()
        );
        tag(ItemTags.GOLD_ORES).add(
                ModBlocks.HYPERDENSE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_GOLD_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE.get().asItem()
        );
        tag(ItemTags.IRON_ORES).add(
                ModBlocks.HYPERDENSE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_IRON_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE.get().asItem()
        );
        tag(ItemTags.LAPIS_ORES).add(
                ModBlocks.HYPERDENSE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE.get().asItem()
        );
        tag(ItemTags.REDSTONE_ORES).add(
                ModBlocks.HYPERDENSE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE.get().asItem()
        );
        tag(EOVTags.Items.QUARTZ_ORES).add(
                ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE.get().asItem(),
                ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get().asItem()
        );
    }
}
