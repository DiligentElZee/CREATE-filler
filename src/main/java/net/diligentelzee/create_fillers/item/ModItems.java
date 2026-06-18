package net.diligentelzee.create_fillers.item;

import net.diligentelzee.create_fillers.CreateFillers;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateFillers.MOD_ID);

    // Killer Rabbit Spawn Egg
    public static final DeferredItem<Item> KILLER_RABBIT_SPAWNEGG = ITEMS.register("killer_rabbit_spawnegg", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
