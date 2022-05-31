package com.peruibeloko.oilandstuff.item;

import com.peruibeloko.oilandstuff.OilAndStuffMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                                                                               OilAndStuffMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> ASSEMBLER = ITEMS.register("assembler", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));
}
