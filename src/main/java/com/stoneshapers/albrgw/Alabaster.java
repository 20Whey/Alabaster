package com.stoneshapers.albrgw;
import com.stoneshapers.albrgw.setup.ModSetup;
import com.stoneshapers.albrgw.setup.ClientSetup;
import com.stoneshapers.albrgw.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Alabaster.MOD_ID)
public class Alabaster
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "albrgw";

    public Alabaster() {

        Registration.init();

        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeCallWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}
