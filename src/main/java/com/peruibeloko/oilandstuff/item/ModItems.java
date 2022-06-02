package com.peruibeloko.oilandstuff.item;

import com.peruibeloko.oilandstuff.OilAndStuffMod;
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

    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));

    public static final RegistryObject<Item> FILTER = ITEMS.register("filter", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));

    public static final RegistryObject<Item> STEEL_MESH = ITEMS.register("steel_mesh", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));

    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));

    public static final RegistryObject<Item> STEEL_STRAND = ITEMS.register("steel_strand", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));

    public static final RegistryObject<Item> VALVE = ITEMS.register("valve", () -> new Item(
            new Item.Properties().tab(ModCreativeModeTab.OILANDSTUFF_TAB)));

}
