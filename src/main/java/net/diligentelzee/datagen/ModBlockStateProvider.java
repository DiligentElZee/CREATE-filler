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

        blockWithItem(ModBlocks.HYPERDENSE_COPPER_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_DIAMOND_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_EMERALD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_IRON_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_LAPIS_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_REDSTONE_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE);

        blockWithItem(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE);
        blockWithItem(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
