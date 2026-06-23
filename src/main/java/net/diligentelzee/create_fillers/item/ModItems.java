package net.diligentelzee.create_fillers.item;

import net.diligentelzee.create_fillers.CreateFillers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateFillers.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

        CreateFillers.LOGGER.info("[Module] ITEMS Registered!");
    }
}
