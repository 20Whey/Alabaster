package com.stoneshapers.albrgw.setup;


import com.stoneshapers.albrgw.Alabaster;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;



public class ModSetup {
    public static final String TAB_NAME = "Alabaster";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab() {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registration.MYSTERIOUS_INGOT.get());
        }
    };
    public static void init(final FMLCommonSetupEvent event) {

    }
}


