package com.gravirift.riftes.magica.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class FireRune extends Item{
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon("magica:fire_rune");
	}
}
