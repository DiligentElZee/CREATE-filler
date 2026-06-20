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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KILLER_RABBIT_SPAWNEGG.get()))
                    .title(Component.translatable("createivetab.createfillers.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KILLER_RABBIT_SPAWNEGG);

                        output.accept(ModBlocks.HYPERDENSE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE);
                        output.accept(ModBlocks.HYPERDENSE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE);
                        output.accept(ModBlocks.HYPERDENSE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE);
                        output.accept(ModBlocks.HYPERDENSE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE);
                        output.accept(ModBlocks.HYPERDENSE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE);
                        output.accept(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE);
                        output.accept(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE);
                    }).build());
    
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
