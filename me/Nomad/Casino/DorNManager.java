package me.Nomad.Casino;


import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class DorNManager implements Listener {
	
	
	private static Map<String, DorNMenu> menus = new HashMap();
	
	public DorNManager() {
		registerMenu("doubleornothing", new JoinDorNMenu(ChatColor.DARK_GRAY + "⛃ " + ChatColor.BLACK + "Double or Nothing " + ChatColor.DARK_GRAY + "⛃", InventoryType.HOPPER));
		
	}
	
	public void registerMenu(String id, DorNMenu menu) {
		menus.put(id, menu);
	}
	
	public static DorNMenu getMenu(String id) {
		return (DorNMenu)menus.get(id);
	}
	
	
	
	@EventHandler
	public void onPlayerClick(InventoryClickEvent e) {
		if (((e.getWhoClicked() instanceof Player)) &&
		(e.getInventory().getName() != null) && (e.getCurrentItem() != null)) {
		for (DorNMenu m : menus.values()) {
			if (e.getInventory().getName().equals(e.getInventory().getName())) {
				m.click(e.getCurrentItem(), (Player)e.getWhoClicked());
				e.setCancelled(true);
				
				}
			}		
		}
	}
}
