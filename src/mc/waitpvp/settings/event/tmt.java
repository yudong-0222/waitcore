package mc.waitpvp.settings.event;

import mc.waitpvp.settings.Core;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
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
        ItemStack im = e.getPlayer().getItemInHand();
        if (!block.getType().equals(Material.TNT) && !im.getItemMeta().getDisplayName().equalsIgnoreCase("a")){
            return;
    }
            e.getBlock().setType(Material.AIR , true);//在玩家放下TNT的地方 設置成空氣
            TNTPrimed tntPrimed = e.getBlock().getWorld().spawn(e.getBlock().getLocation(), TNTPrimed.class);//接著產生點燃的TNT - >自動爆炸
            tntPrimed.setFuseTicks(10);
    }
    @EventHandler
    public void ttt(ExplosionPrimeEvent e) {
        if(e.getEntity().getType().equals(EntityType.PRIMED_TNT)) {
            e.setRadius((float) plugin.getConfig().getDouble("radius"));
        }
    }
}
