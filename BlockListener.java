package me.flash1213;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {

	public BlockListener(AntiBlock plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

@EventHandler
public void onBlockPlace(BlockPlaceEvent e) {
	
	Player player = e.getPlayer();
	
	if (e.getBlock().getType() == Material.BEDROCK) {
		if(!player.hasPermission("playerAbilities.allowed")) {
				player.sendMessage(ChatColor.RED + "You do not have permission to place " + e.getBlock().getType().toString() + "down!"
				e.setCancelled(true);
			else player.sendMessage(ChatColor.GREEN + "You do have permission to place " + e.getBlock().getType().toString() + "down!"
	}
		
		if (e.getBlock().getType() == Material.GLOWSTONE) {
			
			Location location = e.getBlock().getLocation();
			
			if(new Location(location.getWorld(), location.getX(), location.getY() -1, location.getZ())e.getBlock().getType() == Material.GRASS) {
				player.sendMessage(ChatColor.GREEN + "You do have permission to place " + e.getBlock().getType().toString() + "down!"
			} else {
				player.sendMessage(ChatColor.RED + "You do not have permission to place " + e.getBlock().getType().toString() + "down!"
						e.setCancelled(true);
			}
		}
	
				
}
			
			
		
