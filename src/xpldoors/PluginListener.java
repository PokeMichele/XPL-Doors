package xpldoors;

import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

@SuppressWarnings("unused")

public class PluginListener implements Listener {
	
	@EventHandler
    public void onTNTDrop(PlayerDropItemEvent e){
        
		Player player = e.getPlayer();
		
		Location loc = e.getItemDrop().getLocation();
		
		if(e.getItemDrop().getItemStack().getType() == Material.TNT) {
			if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "Level 1 Explosive") ) {
	        		for (Entity entity : player.getNearbyEntities(3, 3, 3)) {
	            		if (entity instanceof ArmorStand) {
	            			if(entity.getName().equalsIgnoreCase(ChatColor.BOLD + "Level 1")) {
	            				entity.remove();
		            			World w = e.getItemDrop().getWorld();
		            			w.createExplosion(loc, 3);
	            			} else {
	            				return;
	            			}
	            		} 
	            	}
	        } else if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "Level 2 Explosive")) {
	        	for (Entity entity : player.getNearbyEntities(3, 3, 3)) {
            		if (entity instanceof ArmorStand) {
            			if(entity.getName().equalsIgnoreCase(ChatColor.BOLD + "Level 2")) {
            				entity.remove();
	            			World w = e.getItemDrop().getWorld();
	            			w.createExplosion(loc, 3);
            			} else {
            				return;
            			}
            		} 
            	}
	        	
	        } else if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "Level 3 Explosive")) {
	        	for (Entity entity : player.getNearbyEntities(3, 3, 3)) {
            		if (entity instanceof ArmorStand) {
            			if(entity.getName().equalsIgnoreCase(ChatColor.BOLD + "Level 3")) {
            				entity.remove();
	            			World w = e.getItemDrop().getWorld();
	            			w.createExplosion(loc, 3);
            			} else {
            				return;
            			}
            		} 
            	}
	        	
	        } else if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "Level 4 Explosive")) {
	        	for (Entity entity : player.getNearbyEntities(3, 3, 3)) {
            		if (entity instanceof ArmorStand) {
            			if(entity.getName().equalsIgnoreCase(ChatColor.BOLD + "Level 4")) {
            				entity.remove();
	            			World w = e.getItemDrop().getWorld();
	            			w.createExplosion(loc, 3);
            			} else {
            				return;
            			}
            		} 
            	}
	        	
	        } else if(e.getItemDrop().getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BOLD + "Level 5 Explosive")) {
	        	for (Entity entity : player.getNearbyEntities(3, 3, 3)) {
            		if (entity instanceof ArmorStand) {
            			if(entity.getName().equalsIgnoreCase(ChatColor.BOLD + "Level 5")) {
            				entity.remove();
	            			World w = e.getItemDrop().getWorld();
	            			w.createExplosion(loc, 3);
            			} else {
            				return;
            			}
            		} 
            	}
	        	
	        }
		}
		
        
    }
	
	 
}
