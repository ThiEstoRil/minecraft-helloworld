package thiestoril.helloworld.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import thiestoril.helloworld.HelloWorld;

public class MainCommand implements CommandExecutor {
	
	private HelloWorld accesToHelloWorld;
	
	public MainCommand(HelloWorld plugin) {
		this.accesToHelloWorld = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage(accesToHelloWorld.name+ChatColor.RED+" You cannot execute this command in the console");
			return false;
		} else {
			Player jugador = (Player) sender;
			if (args.length > 0) {
				if(args[0].equalsIgnoreCase("version")) {
					jugador.sendMessage(accesToHelloWorld.name+ChatColor.WHITE+" Version of the plugin: "+accesToHelloWorld.version);
					return true;
				} else {
					jugador.sendMessage(accesToHelloWorld.name+ChatColor.RED+" That command doesn't exist");
					return true;
				}
			} else {
				jugador.sendMessage(accesToHelloWorld.name+ChatColor.WHITE+" Use "+ChatColor.AQUA+"/helloworld version"+ChatColor.WHITE+" to see the version of the plugin");
				return true;
			}
		}
	}
}
