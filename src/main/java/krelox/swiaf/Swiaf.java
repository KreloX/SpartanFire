package krelox.swiaf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import krelox.swiaf.init.ItemRegistrySF;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Swiaf.MODID)
@Mod.EventBusSubscriber(modid = Swiaf.MODID)
public class Swiaf {
	public static final Logger LOGGER = LogManager.getLogger();

	public static final String MODID = "swiaf";

	public Swiaf() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MinecraftForge.EVENT_BUS.register(this);
		ItemRegistrySF.ITEMS.register(bus);
	}
}
