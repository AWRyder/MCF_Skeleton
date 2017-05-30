package net.wyvernia.experimentals.modules.testblock;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.wyvernia.experimentals.common.RegistrySingleton;

/**
 * Created by EU on 21-05-2017.
 */
public class ClientSetup {
    public static void preInit(){
        final int DEFAULT_ITEM_SUBTYPE = 0;

        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("experimentals:experimental_block", "inventory");
        ModelLoader.setCustomModelResourceLocation(RegistrySingleton.getInstance().getExperimentalItemBlock(), DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);

        ModelResourceLocation pixieDustResourceLocation = new ModelResourceLocation("experimentals:pixie_dust", "inventory");
        ModelLoader.setCustomModelResourceLocation(RegistrySingleton.getInstance().getItemDust(), DEFAULT_ITEM_SUBTYPE, pixieDustResourceLocation);

    }

    public static void init(){

    }

    public static void postInit(){

    }
}
