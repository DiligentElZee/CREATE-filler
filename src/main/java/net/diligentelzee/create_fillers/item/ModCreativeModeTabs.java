package net.diligentelzee.create_fillers.item;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateFillers.MOD_ID);

    public static final Supplier<CreativeModeTab> CREATE_FILLERS_TAB = CREATIVE_MODE_TAB.register("create_fillers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HYPERDENSE_DIAMOND_ORE.get()))
                    .title(Component.translatable("createivetab.createfillers.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HYPERDENSE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE);

                        output.accept(ModBlocks.HYPERDENSE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE);

                        output.accept(ModBlocks.HYPERDENSE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE);

                        output.accept(ModBlocks.HYPERDENSE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE);

                        output.accept(ModBlocks.HYPERDENSE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_GOLD_ORE);

                        output.accept(ModBlocks.HYPERDENSE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE);

                        output.accept(ModBlocks.HYPERDENSE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE);

                        output.accept(ModBlocks.HYPERDENSE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE);

                        output.accept(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE);

                        output.accept(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE);
                        output.accept(ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE);
                    }).build());
    
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);

        CreateFillers.LOGGER.info("[Module] CREATIVE MODE TABS Registered!");
    }


}
