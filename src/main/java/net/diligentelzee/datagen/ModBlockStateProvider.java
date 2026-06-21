package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CreateFillers.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.HYPERDENSE_COAL_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_COAL_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_COAL_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_COAL_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_COPPER_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_COPPER_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_DIAMOND_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_EMERALD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_GOLD_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_IRON_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_IRON_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_IRON_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_IRON_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_LAPIS_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_REDSTONE_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
