package thiestoril.helloworld;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin{
	PluginDescriptionFile pluginYML = getDescription();
	public String version = ChatColor.BOLD+pluginYML.getVersion();
	public String name = ChatColor.DARK_GREEN+"["+ChatColor.YELLOW+pluginYML.getName()+ChatColor.DARK_GREEN+"]";
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(name+" The plugin has been activated (version: "+version+")");
	}
}
