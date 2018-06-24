package com.orange.plump.AdvancedIP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.orange.plump.AdvancedIP.events.JoinEvent;
import com.orange.plump.AdvancedIP.lookup.IPInfoThread;
import com.orange.plump.AdvancedIP.lookup.PlayerIPLog;

import net.md_5.bungee.api.ChatColor;

public class Application extends JavaPlugin {
	
	public static final String PluginName = "AdvancedIP";
	public static final double PluginVersion = 0.2;
	public static final String PluginAuthor = "PlumpOrange";
	public static File LogFile, LoginMessageFile, ProxyWarningFile;
	
	
	/*
	 * onEnable
	 * 
	 */
	public void onEnable() {
		events();
		logs();
	}
	
	/*
	 * onDisable
	 * 
	 */
	public void onDisable() {
		
	}
	
	
	/*
	 * Setup Event Listeners And All Sub Classes
	 * 
	 */
	private void events() {
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new JoinEvent(), this);
	}
	/*
	 * Setup Config And Log Files
	 * 
	 */
	private void logs() {
		File projectFolder = new File("plugins/" + Application.PluginName);
		if (!projectFolder.exists()) projectFolder.mkdir();
		
		
		File logFolder = new File("plugins/" + Application.PluginName + "/Logs");
		if (!logFolder.exists()) logFolder.mkdir();
		
		
		File logFile = new File("plugins/" + Application.PluginName + "/Logs/logs.txt");
		if (!logFile.exists())
			try {
				logFile.createNewFile();
			} catch (IOException e) {
		
			}
		
		Application.LogFile = logFile;

		File loginMessageConfig = new File("plugins/" + Application.PluginName + "/LoginMessage.txt");
		if (!loginMessageConfig.exists())
			try {
				loginMessageConfig.createNewFile();
			} catch (IOException e) {
				
			}
		
		Application.LoginMessageFile = loginMessageConfig;
		
		File proxyWarningConfig = new File("plugins/" + Application.PluginName + "/ProxyWarning.txt");
		if (!proxyWarningConfig.exists())
			try {
				proxyWarningConfig.createNewFile();
			} catch (IOException e) {
				
			}
		
		Application.ProxyWarningFile = proxyWarningConfig;
	}
	
	
	/*
	 * Writes String To Log File
	 * 
	 */
	public static void log(String s) {
		FileWriter fw;
		try {
			fw = new FileWriter(Application.LogFile, true);
			fw.write(s + "\n");
			fw.close();
		} catch (IOException e) {
			
		}
	}
	
	
	/*
	 * onCommand
	 * 
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String name, String[] args) {
		if (cmd.getName().equalsIgnoreCase("advip")) {
			if (!sender.hasPermission("AdvancedIP.use") && !sender.isOp()) {
				//Returns
			}
			
			if (args.length >= 3) {
				//Returns
			}
			
			if (args.length == 0) {
				//Prints Plugin Info
			}
			
			if (args.length == 1) {
				
				if (args[0].equalsIgnoreCase("help")) {
					//Prints Help
				} else if (args[0].equalsIgnoreCase("logs")) {
					//Do Stuff
				}
				
				
				Player target = null;
				boolean isOnline = false;
				for (Player p : Bukkit.getServer().getOnlinePlayers()) {
					//Finds Online Player
				}
				if (!isOnline) {
					//Do Stuff
				}

				IPInfoThread ipinfo = new IPInfoThread(target, sender);
				ipinfo.DO();
			} else if (args.length == 2) {
				if (!args[0].equalsIgnoreCase("logs")) {
					//Do Stuff
				}
				
				String player = args[1];
				List<PlayerIPLog> logs = new ArrayList<PlayerIPLog>();
				List<String> fileContents = null;
				try {
					fileContents = Files.readAllLines(Paths.get(Application.LogFile.getPath()));
				} catch (IOException e) {
					
				}
				boolean isPlayer = false;
				boolean hasFound = false;
				String date = "",ip = "",continent = "",country = "",state = "",city = "",postal_code = "",isp = "";
				for (String current : fileContents) {
					if (current.equalsIgnoreCase(case)) {
						isPlayer = true;
						hasFound = true;
					}
					if(isPlayer) {
						//Grabs Variables
						logs.add(new PlayerIPLog(player, date, ip, continent, country, state, city, postal_code, isp));
						isPlayer = false;
					}
				}
				
				if(!hasFound) {
					//Do Stuff
				}
				
				//Do Stuff
				sayPlayerLogArray(sender, logs, player);
				return false;
			}
		}
		return false;
	}
	
	/*
	 * Says Given PlayerIPLog ArrayList To Given Sender
	 * 
	 */
	private void sayPlayerLogArray(CommandSender sender, List<PlayerIPLog> logs, String player) {
		//Say Stuff
		for (PlayerIPLog log : logs); //Print Current Log
		//Say Stuff
	}
	
}
