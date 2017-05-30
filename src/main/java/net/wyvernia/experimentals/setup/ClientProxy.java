package net.wyvernia.experimentals.setup;


public class ClientProxy extends CommonProxy {

    public void preInit(){
        super.preInit();
        net.wyvernia.experimentals.modules.testblock.ClientSetup.preInit();
    }

    public void init(){
        super.init();
        net.wyvernia.experimentals.modules.testblock.ClientSetup.init();
    }

    public void postInit(){
        super.postInit();
        net.wyvernia.experimentals.modules.testblock.ClientSetup.postInit();
    }

    @Override
    public boolean isDedicatedServer() {return false;}
}
