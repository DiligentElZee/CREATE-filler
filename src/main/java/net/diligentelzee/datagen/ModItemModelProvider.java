package net.diligentelzee.datagen;

import net.diligentelzee.create_fillers.CreateFillers;
import net.diligentelzee.create_fillers.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateFillers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    basicItem(ModItems.KILLER_RABBIT_SPAWNEGG.get());
    }
}
