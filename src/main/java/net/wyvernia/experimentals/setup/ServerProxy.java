package net.wyvernia.experimentals.setup;


public class ServerProxy extends CommonProxy {

    public void preInit() {
        super.preInit();
    }

    public void init() {
        super.init();
    }

    public void postInit() {
        super.postInit();
    }

    @Override
    public boolean isDedicatedServer() {return true;}
}
