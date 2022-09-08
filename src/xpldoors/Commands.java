package xpldoors;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import net.md_5.bungee.api.ChatColor;

@SuppressWarnings("unused")
public class Commands implements CommandExecutor{

	@SuppressWarnings("static-access")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args) {
		
		Player player = (Player) sender;
		
		if(sender instanceof Player){
			if(cmd.getName().equalsIgnoreCase("xpld")) {
				if(args.length == 0) {
					sender.sendMessage("/xpld | placedoorwithlevel <int> | givetntwithlevel <int>| help");
				} else {
					if(args[0].equalsIgnoreCase("placedoorwithlevel")) {
						int level = Integer.parseInt(args[1]);
						if(args[1].valueOf(level) != null) {
							
							//loc
							Location loc = player.getLocation();
							
							if(level == 1) {
								loc.getBlock().setType(Material.IRON_DOOR);
								
								//armorstand
								ArmorStand armorstandtitle = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
								armorstandtitle.setCustomName(ChatColor.BOLD + "Level 1");
								armorstandtitle.setCustomNameVisible(true);
								armorstandtitle.setVisible(false);
								armorstandtitle.setCollidable(false);
								
								
							}else if  (level == 2){
								loc.getBlock().setType(Material.IRON_DOOR);
								
								//armorstand
								ArmorStand armorstandtitle = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
								armorstandtitle.setCustomName(ChatColor.BOLD + "Level 2");
								armorstandtitle.setCustomNameVisible(true);
								armorstandtitle.setVisible(false);
								armorstandtitle.setCollidable(false);
								
							} else if (level == 3) {
								loc.getBlock().setType(Material.IRON_DOOR);
								
								//armorstand
								ArmorStand armorstandtitle = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
								armorstandtitle.setCustomName(ChatColor.BOLD + "Level 3");
								armorstandtitle.setCustomNameVisible(true);
								armorstandtitle.setVisible(false);
								armorstandtitle.setCollidable(false);
							} else if (level == 4) {
								loc.getBlock().setType(Material.IRON_DOOR);
								
								//armorstand
								ArmorStand armorstandtitle = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
								armorstandtitle.setCustomName(ChatColor.BOLD + "Level 4");
								armorstandtitle.setCustomNameVisible(true);
								armorstandtitle.setVisible(false);
								armorstandtitle.setCollidable(false);
							} else if (level == 5) {
								loc.getBlock().setType(Material.IRON_DOOR);
								
								//armorstand
								ArmorStand armorstandtitle = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
								armorstandtitle.setCustomName(ChatColor.BOLD + "Level 5");
								armorstandtitle.setCustomNameVisible(true);
								armorstandtitle.setVisible(false);
								armorstandtitle.setCollidable(false);
							} else {
								sender.sendMessage("This level can't be accepted");
							}
							
						}
						
						
						
					//help
					} else if(args[0].equalsIgnoreCase("help")) {
							sender.sendMessage("/xpld | placedoorwithlevel <int> | givetntwithlevel <int>| help");
							
							
							
					//TNT
					} else if(args[0].equalsIgnoreCase("givetntwithlevel")) {
						
						int leveltnt = Integer.parseInt(args[1]);
						if(args[1].valueOf(leveltnt) != null) {
							if(leveltnt == 1) {
								ItemStack is = new ItemStack(Material.TNT);
								ItemMeta meta = is.getItemMeta();
								meta.setDisplayName(ChatColor.BOLD + "Level 1 Explosive");
								is.setItemMeta(meta);
								player.getInventory().addItem(is);
							} else if (leveltnt == 2) {
								ItemStack is = new ItemStack(Material.TNT);
								ItemMeta meta = is.getItemMeta();
								meta.setDisplayName(ChatColor.BOLD + "Level 2 Explosive");
								is.setItemMeta(meta);
								player.getInventory().addItem(is);
							} else if (leveltnt == 3) {
								ItemStack is = new ItemStack(Material.TNT);
								ItemMeta meta = is.getItemMeta();
								meta.setDisplayName(ChatColor.BOLD + "Level 3 Explosive");
								is.setItemMeta(meta);
								player.getInventory().addItem(is);
							} else if (leveltnt == 4) {
								ItemStack is = new ItemStack(Material.TNT);
								ItemMeta meta = is.getItemMeta();
								meta.setDisplayName(ChatColor.BOLD + "Level 4 Explosive");
								is.setItemMeta(meta);
								player.getInventory().addItem(is);
							}  else if (leveltnt == 5) {
								ItemStack is = new ItemStack(Material.TNT);
								ItemMeta meta = is.getItemMeta();
								meta.setDisplayName(ChatColor.BOLD + "Level 5 Explosive");
								is.setItemMeta(meta);
								player.getInventory().addItem(is);
							}
						}
						
					}
				}
				
				
			}
		} else {
			sender.sendMessage("You can't execute this command from console");
		}
		
		
		
		
		
		
		return false;
	}
	
}