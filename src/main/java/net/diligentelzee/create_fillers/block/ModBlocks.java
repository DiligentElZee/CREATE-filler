package net.diligentelzee.create_fillers.block;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.item.ModItems;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreateFillers.MOD_ID);


    // COAL //
    public static final DeferredBlock<Block> HYPERDENSE_COAL_ORE = registerBlock("hyperdense_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_COAL_ORE = registerBlock("hyperdense_deepslate_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 4), BlockBehaviour.Properties.of()
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_COAL_ORE = registerBlock("hyperdense_andesite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_COAL_ORE = registerBlock("hyperdense_diorite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_COAL_ORE = registerBlock("hyperdense_granite_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_COAL_ORE = registerBlock("hyperdense_tuff_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_COAL_ORE = registerBlock("hyperdense_blackstone_coal_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 4), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COAL_ORE.get())));


    // COPPER //
    public static final DeferredBlock<Block> HYPERDENSE_COPPER_ORE = registerBlock("hyperdense_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_COPPER_ORE = registerBlock("hyperdense_deepslate_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_COPPER_ORE = registerBlock("hyperdense_andesite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_COPPER_ORE = registerBlock("hyperdense_diorite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_COPPER_ORE = registerBlock("hyperdense_granite_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_COPPER_ORE = registerBlock("hyperdense_tuff_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_COPPER_ORE = registerBlock("hyperdense_blackstone_copper_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_COPPER_ORE.get())));


    // DIAMOND //
    public static final DeferredBlock<Block> HYPERDENSE_DIAMOND_ORE = registerBlock("hyperdense_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_DIAMOND_ORE = registerBlock("hyperdense_deepslate_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.of()
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_DIAMOND_ORE = registerBlock("hyperdense_andesite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_DIAMOND_ORE = registerBlock("hyperdense_diorite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_DIAMOND_ORE = registerBlock("hyperdense_granite_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_DIAMOND_ORE = registerBlock("hyperdense_tuff_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_DIAMOND_ORE = registerBlock("hyperdense_blackstone_diamond_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_DIAMOND_ORE.get())));


    // EMERALD //
    public static final DeferredBlock<Block> HYPERDENSE_EMERALD_ORE = registerBlock("hyperdense_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_EMERALD_ORE = registerBlock("hyperdense_deepslate_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.of()
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_EMERALD_ORE = registerBlock("hyperdense_andesite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_EMERALD_ORE = registerBlock("hyperdense_diorite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_EMERALD_ORE = registerBlock("hyperdense_granite_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_EMERALD_ORE = registerBlock("hyperdense_tuff_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_EMERALD_ORE = registerBlock("hyperdense_blackstone_emerald_ore",
            () -> new DropExperienceBlock(UniformInt.of(4, 9), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_EMERALD_ORE.get())));


    // GOLD //
    public static final DeferredBlock<Block> HYPERDENSE_GOLD_ORE = registerBlock("hyperdense_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_GOLD_ORE = registerBlock("hyperdense_deepslate_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_NETHER_GOLD_ORE = registerBlock("hyperdense_nether_gold_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 2), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.NETHER_GOLD_ORE)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_GOLD_ORE = registerBlock("hyperdense_andesite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_GOLD_ORE = registerBlock("hyperdense_diorite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_GOLD_ORE = registerBlock("hyperdense_granite_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_GOLD_ORE = registerBlock("hyperdense_tuff_gold_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_GOLD_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_GOLD_ORE = registerBlock("hyperdense_blackstone_gold_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 3), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE.get())
                    .sound(SoundType.STONE)));


    // IRON //
    public static final DeferredBlock<Block> HYPERDENSE_IRON_ORE = registerBlock("hyperdense_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_IRON_ORE = registerBlock("hyperdense_deepslate_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_IRON_ORE = registerBlock("hyperdense_andesite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_IRON_ORE = registerBlock("hyperdense_diorite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_IRON_ORE = registerBlock("hyperdense_granite_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_IRON_ORE = registerBlock("hyperdense_tuff_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_IRON_ORE = registerBlock("hyperdense_blackstone_iron_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_IRON_ORE.get())));


    // LAPIS //
    public static final DeferredBlock<Block> HYPERDENSE_LAPIS_ORE = registerBlock("hyperdense_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_LAPIS_ORE = registerBlock("hyperdense_deepslate_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 8), BlockBehaviour.Properties.of()
                    .strength(6.0F, 4.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_LAPIS_ORE = registerBlock("hyperdense_andesite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_LAPIS_ORE = registerBlock("hyperdense_diorite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_LAPIS_ORE = registerBlock("hyperdense_granite_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_LAPIS_ORE = registerBlock("hyperdense_tuff_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_LAPIS_ORE = registerBlock("hyperdense_blackstone_lapis_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 8), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_LAPIS_ORE.get())));


    // REDSTONE //
    public static final DeferredBlock<Block> HYPERDENSE_REDSTONE_ORE = registerBlock("hyperdense_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .randomTicks().lightLevel(litBlockEmission(10))));
    public static final DeferredBlock<Block> HYPERDENSE_DEEPSLATE_REDSTONE_ORE = registerBlock("hyperdense_deepslate_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)
                    .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM)
                    .randomTicks().lightLevel(litBlockEmission(11))));

    public static final DeferredBlock<Block> HYPERDENSE_ANDESITE_REDSTONE_ORE = registerBlock("hyperdense_andesite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_DIORITE_REDSTONE_ORE = registerBlock("hyperdense_diorite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_GRANITE_REDSTONE_ORE = registerBlock("hyperdense_granite_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_TUFF_REDSTONE_ORE = registerBlock("hyperdense_tuff_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())));
    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_REDSTONE_ORE = registerBlock("hyperdense_blackstone_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_REDSTONE_ORE.get())));


    // QUARTZ //
    public static final DeferredBlock<Block> HYPERDENSE_NETHER_QUARTZ_ORE = registerBlock("hyperdense_nether_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE)
                    .mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final DeferredBlock<Block> HYPERDENSE_BLACKSTONE_QUARTZ_ORE = registerBlock("hyperdense_blackstone_quartz_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6), BlockBehaviour.Properties.ofFullCopy(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE.get())
                    .sound(SoundType.STONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return p_50763_ -> p_50763_.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

        CreateFillers.LOGGER.info("[Module] BLOCKS Registered!");
    }
}
