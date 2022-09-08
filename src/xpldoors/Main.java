package xpldoors;


import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;
@SuppressWarnings("unused")

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	
	//get plugin instance
	public static Main getInstance() {
		return plugin;
		
	}
	
	//OnEnable
	public void onEnable() {
		plugin = this;
		System.out.println("XPL-Doors is now Enabled");
		
		getCommand("xpld").setExecutor(new Commands());
		
		Bukkit.getPluginManager().registerEvents(new PluginListener(), this);
	}
	
	//OnDisable
	public void onDisable() {
		System.out.println("XPL-Doors is now Disabled");
	}

	
}
