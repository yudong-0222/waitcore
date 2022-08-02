package mc.waitpvp.settings.event;

import ga.strikepractice.utils.B;
import mc.waitpvp.settings.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class tmt implements Listener {
    private final Core plugin;
    public static BukkitTask Task;

    public tmt (Core plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void tnt(BlockPlaceEvent e) {
        Block block = e.getBlock();
        if (!block.getType().equals(Material.TNT)){
            return;
    }
        e.getBlock().setType(Material.AIR , true);//在玩家放下TNT的地方 設置成空氣
        TNTPrimed tntPrimed = e.getBlock().getWorld().spawn(e.getBlock().getLocation(), TNTPrimed.class); //接著產生點燃的TNT
        tntPrimed.setFuseTicks(10); //設置爆炸時間 (10 TICKS) 每20TICKS 是 1秒 這邊是0.5

        }
    }
