package net.wyvernia.experimentals.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.wyvernia.experimentals.modules.testblock.ItemDust;

/**
 * Created by EU on 21-05-2017.
 */
public class RegistrySingleton {
    private static RegistrySingleton instance;

    private Block experimentalBlock;
    private ItemBlock experimentalItemBlock;
    private ItemDust itemDust;

    private RegistrySingleton(){

    }

    public static RegistrySingleton getInstance(){
        if ( instance == null ){
            instance = new RegistrySingleton();
        }
        return instance;
    }

    public Block getExperimentalBlock() {
        return experimentalBlock;
    }

    public void setExperimentalBlock(Block experimentalBlock) {
        this.experimentalBlock = experimentalBlock;
    }

    public ItemBlock getExperimentalItemBlock() {
        return experimentalItemBlock;
    }

    public void setExperimentalItemBlock(ItemBlock experimentalItemBlock) {
        this.experimentalItemBlock = experimentalItemBlock;
    }
    public ItemDust getItemDust() {
        return itemDust;
    }
    public void setItemDust(ItemDust itemDust) {
        this.itemDust = itemDust;
    }
}
