package me.Nomad.Casino;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.economy.Economy;

public class JoinDorNMenu extends DorNMenu {
	
	Economy economy = Casino.economy;
	
	public JoinDorNMenu(String name, InventoryType type) {
		super(name, type);
	}
	
	@Override
	public void RegisterItems() {
		
		ItemStack x = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta meta = x.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN + "⛃⛁" + ChatColor.WHITE + " 1x" + ChatColor.GREEN + " ⛃⛁");
		x.setItemMeta(meta);
		
		ItemStack x2 = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta meta2 = x2.getItemMeta();
		meta2.setDisplayName(ChatColor.GREEN + "⛃⛁" + ChatColor.WHITE + " 2x" + ChatColor.GREEN + " ⛃⛁");
		x2.setItemMeta(meta2);
		
		ItemStack x3 = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta meta3 = x3.getItemMeta();
		meta3.setDisplayName(ChatColor.GREEN + "⛃⛁" + ChatColor.WHITE + " 3x" + ChatColor.GREEN + " ⛃⛁");
		meta3.setLore(Arrays.asList(ChatColor.GREEN + "⛁ " + ChatColor.WHITE + "ใช้เงินจำนวน 3,000 ในการลงเล่น"));
		x3.setItemMeta(meta3);
		
		inv.setItem(1, x);
		inv.setItem(2, x2);
		inv.setItem(3, x3);
	
	}
	
	@Override
	public void click(ItemStack item, Player p) {
		if (item.hasItemMeta()) {
			if (item.getItemMeta().hasDisplayName()) {
				String m = item.getItemMeta().getDisplayName();
				if (m.equals(ChatColor.GREEN + "⛃⛁" + ChatColor.WHITE + " 1x" + ChatColor.GREEN + " ⛃⛁")) {
					economy.depositPlayer(p, 100.0);
					p.sendMessage("1x");
				}
				if (m.equals(ChatColor.GREEN + "⛃⛁" + ChatColor.WHITE + " 1x" + ChatColor.GREEN + " ⛃⛁")) {
					economy.depositPlayer(p, 200.0);
					p.sendMessage("2x");
				}
				if (m.equals(ChatColor.GREEN + "⛃⛁" + ChatColor.WHITE + " 1x" + ChatColor.GREEN + " ⛃⛁")) {
					economy.depositPlayer(p, 300.0);
					p.sendMessage("3x");
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
