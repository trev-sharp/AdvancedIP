package com.orange.plump.AdvancedIP.lookup;

public class PlayerIPLog {
	public String 
	name,
	date,
	ip,
	continent,
	country,
	state,
	city,
	postal_code,
	isp;
	
	/*
	 * Object Constructor
	 * 
	 */
	public PlayerIPLog(
			String name, String date, String ip, 
			String continent, String country, String state, 
			String city, String postal_code, String isp) {
		
		this.name = name;
		this.date = date;
		this.ip = ip;
		this.continent = continent;
		this.country = country;
		this.state = state;
		this.city = city;
		this.postal_code = postal_code;
		this.isp = isp;
	}
}
