package com.orange.plump.AdvancedIP.events;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.orange.plump.AdvancedIP.Application;
import com.orange.plump.AdvancedIP.lookup.IPInfoThread;

public class JoinEvent implements Listener {
	
	/*
	 * onPlayerJoinEvent
	 * 
	 */
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
		String uuid = event.getPlayer().getUniqueId().toString();
		List<String> fileContents = null;
		try {
			fileContents = Files.readAllLines(Paths.get(Application.LogFile.getPath()));
		} catch (IOException e) {
			
		}
		
		boolean isThere = false;
		String loggedIP = " ";
		for (String s : fileContents) {
			if (s.startsWith(case)) {
				//Do Stuff
			} else if (s.startsWith(case) && isThere) {
				//Do Stuff
				break;
			}
		}
		String ip = event.getPlayer().getAddress().getAddress().getHostAddress().replaceAll("-", ".");
		
		
		if (ip.startsWith(loggedIP)) {
			return;
		}
		
		try {
			if (hasProxy(ip)) {
				List<String> proxyWarning = null;
				try {
					proxyWarning = Files.readAllLines(Paths.get(Application.LogFile.getPath()));
				} catch (IOException e) {
					
				}
				
				//Prints Warning
			}
		} catch (IOException e) {
			
		}
		
		IPInfoThread ipinfo = new IPInfoThread(ip, event.getPlayer());
		ipinfo.DO();
		
	}
	
	/*
	 * Checks If IP Is A Proxy
	 * 
	 */
	private boolean hasProxy(String ip) throws IOException {
		//Do Stuff
	}

}
