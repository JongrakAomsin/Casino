package me.Nomad.Casino;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class DorNMenu {
	
	public Inventory inv;
	
	
	public DorNMenu(String name, int size) {	
		inv = Bukkit.createInventory(null, size, name);
		RegisterItems();
		
	}
	
	public DorNMenu(String name, InventoryType type) {
		inv = Bukkit.createInventory(null, type, name);
		RegisterItems();
	}
	
	public abstract void RegisterItems();
	
	
	public abstract void click(ItemStack paramItemStack, Player paramPlayer);
	
	
}
