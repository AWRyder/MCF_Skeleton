package net.wyvernia.experimentals.modules.testblock;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wyvernia.experimentals.common.RegistrySingleton;
import net.wyvernia.experimentals.setup.ExperimentalsMod;

/**
 * Created by EU on 21-05-2017.
 */
public class CommonSetup {

    public static void preInit(){
        ExperimentalBlock experimentalBlock = new ExperimentalBlock();
        experimentalBlock
                .setRegistryName(ExperimentalsMod.MODID,"experimental_block")
                .setUnlocalizedName("experimental")
        ;

        ItemBlock iExp = (ItemBlock)new ItemBlock(experimentalBlock).setRegistryName(experimentalBlock.getRegistryName());

        RegistrySingleton.getInstance().setExperimentalBlock(experimentalBlock);
        RegistrySingleton.getInstance().setExperimentalItemBlock(iExp);

        GameRegistry.register(experimentalBlock);
        GameRegistry.register(iExp);

        ItemDust pixieDust = new ItemDust();
        pixieDust.setUnlocalizedName("pixieDust");
        pixieDust.setRegistryName("pixieDust");
        GameRegistry.register(pixieDust);
        RegistrySingleton.getInstance().setItemDust(pixieDust);

    }

    public static void init(){
        System.out.println("COAL BLOCK >> "+ Blocks.COAL_BLOCK.getUnlocalizedName());
    }

    public static void postInit(){

    }

}
