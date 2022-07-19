package mc.waitpvp.settings.event;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class tmt implements Listener {
    @EventHandler
    public void tnt(BlockPlaceEvent e) {
        Block block = e.getBlock();
        if(!block.getType().equals(Material.TNT))
            return;
        block.getLocation().getWorld().createExplosion(block.getLocation(), 2F, true);
    }
}
