package com.jcrail.jcrec.core.handler;

import com.jcrail.jcrec.JCRec;
import com.jcrail.jcrec.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

    public static void initItemRegister(){

        ItemIDs.disc_aaa.item = new disc_aaa("disc_aaa");

        for (ItemIDs items : ItemIDs.values()) {
            items.item.setCreativeTab(JCRec.jcrecCreativeTab);

            items.item.setUnlocalizedName(JCRec.MODID + ":" + items.itemName);
            GameRegistry.registerItem(items.item, items.name());

        }
    }
}