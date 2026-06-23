package net.diligentelzee.create_fillers;

import net.diligentelzee.create_fillers.block.ModBlocks;
import net.diligentelzee.create_fillers.item.ModCreativeModeTabs;
import net.diligentelzee.create_fillers.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateFillers.MOD_ID)
public class CreateFillers {
    public static final String MOD_ID = "createfillers";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateFillers(IEventBus modEventBus, ModContainer modContainer) {

        LOGGER.info("=======================================");
        LOGGER.info("      INITIALIZING CREATE FILLERS");
        LOGGER.info("=======================================");

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        ModItems.register(modEventBus);
        LOGGER.info("[OK] Items Loaded");

        ModBlocks.register(modEventBus);
        LOGGER.info("[OK] Blocks Loaded");

        ModCreativeModeTabs.register(modEventBus);
        LOGGER.info("[OK] Creative Mode Tabs Loaded");

        modEventBus.addListener(this::addCreative);

        LOGGER.info("Hyperdense ore deposits detected...");
        LOGGER.info("Fluffy threat detected...");
        LOGGER.info("Happy Mining! :3");
        LOGGER.info("========================================");
        LOGGER.info("       CREATE FILLERS INITIALIZED");
        LOGGER.info("========================================");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.HYPERDENSE_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_COAL_ORE);

            event.accept(ModBlocks.HYPERDENSE_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_COPPER_ORE);

            event.accept(ModBlocks.HYPERDENSE_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_DIAMOND_ORE);

            event.accept(ModBlocks.HYPERDENSE_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_EMERALD_ORE);

            event.accept(ModBlocks.HYPERDENSE_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_GOLD_ORE);

            event.accept(ModBlocks.HYPERDENSE_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_IRON_ORE);

            event.accept(ModBlocks.HYPERDENSE_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_LAPIS_ORE);

            event.accept(ModBlocks.HYPERDENSE_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_ANDESITE_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIORITE_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_GRANITE_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_TUFF_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_REDSTONE_ORE);

            event.accept(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_GOLD_ORE);

            event.accept(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE);
            event.accept(ModBlocks.HYPERDENSE_BLACKSTONE_QUARTZ_ORE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = CreateFillers.MOD_ID, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
