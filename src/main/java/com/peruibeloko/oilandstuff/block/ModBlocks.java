package com.peruibeloko.oilandstuff.block;

import com.peruibeloko.oilandstuff.OilAndStuffMod;
import com.peruibeloko.oilandstuff.item.ModCreativeModeTab;
import com.peruibeloko.oilandstuff.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                                                                                 OilAndStuffMod.MOD_ID);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(
            String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(
            String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static final RegistryObject<Block> BOILER_FRAME = registerBlock("boiler_frame", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);

    public static final RegistryObject<Block> BOILER_HEATER = registerBlock("boiler_heater", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);

    public static final RegistryObject<Block> BOILER_VALVE = registerBlock("boiler_valve", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);

    public static final RegistryObject<Block> PRESSURE_PIPE = registerBlock("pressure_pipe", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);

    public static final RegistryObject<Block> REFINERY_FILTER = registerBlock("refinery_filter", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);

    public static final RegistryObject<Block> REFINERY_FRAME = registerBlock("refinery_frame", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);

    public static final RegistryObject<Block> REFINERY_GAUGE = registerBlock("refinery_gauge", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);

    public static final RegistryObject<Block> REFINERY_VALVE = registerBlock("refinery_valve", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL)
                                     .strength(3f)
                                     .requiresCorrectToolForDrops()), ModCreativeModeTab.OILANDSTUFF_TAB);


}
