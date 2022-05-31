package com.peruibeloko.oilandstuff.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab OILANDSTUFF_TAB = new CreativeModeTab("oilandstufftab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ASSEMBLER.get());
        }
    };
}
