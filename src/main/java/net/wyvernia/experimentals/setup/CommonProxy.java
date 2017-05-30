package net.wyvernia.experimentals.setup;

import net.minecraft.entity.player.EntityPlayer;
import net.wyvernia.experimentals.modules.testblock.CommonSetup;


public abstract class CommonProxy {

    public void preInit(){
        net.wyvernia.experimentals.modules.testblock.CommonSetup.preInit();
    }

    public void init(){
        net.wyvernia.experimentals.modules.testblock.CommonSetup.init();
    }

    public void postInit(){
        net.wyvernia.experimentals.modules.testblock.CommonSetup.postInit();
    }

    /**
     * is this a dedicated server?
     * @return true if this is a dedicated server, false otherwise
     */
    abstract public boolean isDedicatedServer();

}
