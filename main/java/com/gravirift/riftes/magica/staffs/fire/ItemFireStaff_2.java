package com.gravirift.riftes.magica.staffs.fire;

import java.util.List;

import com.gravirift.riftes.magica.Wand;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemFireStaff_2 extends Wand{
	
	@Override
	public int getCooldown() {
		return 30;
	}
	
	@Override
	public int getTier(){
		return 2;
	}
	
	@Override
	public ItemStack getConsumptionCost() {
		return new ItemStack(Items.apple, 1);
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("magica:fire_staff_2");
	}
	@Override
	public void castSpell(EntityPlayer player) {
		World world = player.worldObj;
		Vec3 look = player.getLookVec();
		if(!world.isRemote){
			EntityLargeFireball fireball = new EntityLargeFireball(world, player, 1, 1, 1);
			fireball.setPosition(
			player.posX + look.xCoord * 2,
			player.posY + look.yCoord * 2,
			player.posZ + look.zCoord * 2);
			fireball.accelerationX = look.xCoord * 0.15;
			fireball.accelerationY = look.yCoord * 0.15;
			fireball.accelerationZ = look.zCoord * 0.15;
			world.spawnEntityInWorld(fireball);
		}
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Tier 2");
		par3List.add("1.5 second cooldown");
	}
}
