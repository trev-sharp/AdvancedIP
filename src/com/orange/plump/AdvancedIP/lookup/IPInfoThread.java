package com.orange.plump.AdvancedIP.lookup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.orange.plump.AdvancedIP.Application;

import net.md_5.bungee.api.ChatColor;

public class IPInfoThread extends Thread {
	
	private String ip, continent, country, state, city, postal_code, isp;
	private CommandSender p;
	private Player target;
	private boolean doLoginMessage = false;
	
	/*
	 * Object Constructor
	 * 
	 */
	public IPInfoThread(Player target, CommandSender p) {
		this.target = target;
		this.ip = target.getAddress().getAddress().getHostAddress().replaceAll("-", ".");
		this.p = p;
		start();
	}
	/*
	 * Object Constructor
	 * 
	 */
	public IPInfoThread(String ip, Player target) {
		this.target = null;
		this.ip = ip;
		this.target = target;
		this.doLoginMessage = true;
		start();
	}
	
	/*
	 * Object Constructor
	 * 
	 */
	public IPInfoThread(CommandSender target, String ip) {
		this.target = null;
		this.ip = ip;
		this.p = target;
		start();
	}
	
	/*
	 * 
	 *
	 */
	public void run() {
		try {
			
			//Grabs Variables From IP
			
			if (this.doLoginMessage) {
				List<String> fileContents = null;
				try {
					fileContents = Files.readAllLines(Paths.get(Application.LoginMessageFile.getPath()));
				} catch (IOException e) {
					System.out.println("[AdvancedIP] AdvancedIP (By PlumpOrange) Has Occured An Error. For Any Support, Please Head To Offical Postings On Spigot & Bukkit.\nError: Couldn't Read LoginMessage File, IOException");
					return;
				}
				
				//Broadcasts The Login Message
			}
			
			if (p != null) tellPlayer();
			else doLog();
			
		} catch (MalformedURLException e) {
			
		} catch (IOException e) {
			
		} catch (Exception e) {
			
		}
	}
	
	/*
	 * Tells The Player
	 * 
	 */
	private void tellPlayer() {
		//Tells The Player
	}
	
	/*
	 * Logs IP
	 * 
	 */
	private void doLog() {
		//Logs
	}

	public void DO() {
		//Do Stuff
	}
	
	
}
