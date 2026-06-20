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
import net.minecraft.client.Minecraft;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateFillers.MOD_ID)
public class CreateFillers {
    public static final String MOD_ID = "createfillers";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public CreateFillers(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.KILLER_RABBIT_SPAWNEGG);
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.HYPERDENSE_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COAL_ORE);
            event.accept(ModBlocks.HYPERDENSE_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_COPPER_ORE);
            event.accept(ModBlocks.HYPERDENSE_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_DIAMOND_ORE);
            event.accept(ModBlocks.HYPERDENSE_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_EMERALD_ORE);
            event.accept(ModBlocks.HYPERDENSE_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_IRON_ORE);
            event.accept(ModBlocks.HYPERDENSE_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_LAPIS_ORE);
            event.accept(ModBlocks.HYPERDENSE_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_DEEPSLATE_REDSTONE_ORE);
            event.accept(ModBlocks.HYPERDENSE_NETHER_GOLD_ORE);
            event.accept(ModBlocks.HYPERDENSE_NETHER_QUARTZ_ORE);
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
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
