package net.wyvernia.experimentals.modules.testblock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class ItemDust extends Item {
    private final int MAX_STACK_SIZE = 24;

    public ItemDust (){
        this.setMaxStackSize(MAX_STACK_SIZE);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

}
