package thiestoril.helloworld.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import thiestoril.helloworld.HelloWorld;

public class GitHubCommand implements CommandExecutor{
	
	private HelloWorld accesToHelloWorld;
	
	public GitHubCommand(HelloWorld plugin) {
		this.accesToHelloWorld = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) {
			Bukkit.getConsoleSender().sendMessage(accesToHelloWorld.name+ChatColor.RED+"You cannot execute this command in the console");
			return false;
		} else {
			Player jugador = (Player) sender;
			jugador.sendMessage("My GitHub account: "+ChatColor.AQUA+"https://github.com/ThiEstoRil");
			return true;
		}
	}
}
