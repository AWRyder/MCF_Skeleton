package net.wyvernia.experimentals.setup;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExperimentalsMod.MODID, version = ExperimentalsMod.VERSION)
public class ExperimentalsMod
{
    public static final String MODID = "Experimentals";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide="net.wyvernia.experimentals.setup.ClientProxy", serverSide="net.wyvernia.experimentals.setup.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }

}
