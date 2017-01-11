package net.Snickzz.main.utils;

import net.Snickzz.main.Main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Packets implements Listener{
	
	private static Main plugin;
	public Packets(Main listener) {
		Packets.plugin = listener;	
		startTimer();
	}
	
	public void startTimer(){
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){
    		public void run() {
    			Bukkit.getServer().broadcastMessage(Utils.color("&6&lHourItem &b&l> &aYour hourly item has been added to your inventory!"));
    			int i = Utils.randomNum(1, 7);
    			for(Player p : Bukkit.getOnlinePlayers()){
    				if(i == 1){
    					p.getInventory().addItem(Utils.createItem(Material.DIAMOND_SWORD, 1, 0, Utils.color("&c&lHourItem"), null));
    				}else if(i == 2){
    					p.getInventory().addItem(Utils.createItem(Material.DIAMOND_SPADE, 1, 0, Utils.color("&c&lHourItem"), null));
    				}else if(i == 3){
    					p.getInventory().addItem(Utils.createItem(Material.DIAMOND, 1, 0, Utils.color("&c&lHourItem"), null));
    				}else if(i == 4){
    					p.getInventory().addItem(Utils.createItem(Material.EMERALD, 1, 0, Utils.color("&c&lHourItem"), null));
    				}else if(i == 5){
    					p.getInventory().addItem(Utils.createItem(Material.COOKED_BEEF, 32, 0, Utils.color("&c&lHourItem"), null));
    				}else if(i == 6){
    					p.getInventory().addItem(Utils.createItem(Material.CARROT, 15, 0, Utils.color("&c&lHourItem"), null));
    				}else if(i == 7){
    					p.getInventory().addItem(Utils.createItem(Material.COBBLESTONE, 64, 0, Utils.color("&c&lHourItem"), null));
    				}
    			}
    			
    		}
		}, 0, 3600 * 20);
	}

}
