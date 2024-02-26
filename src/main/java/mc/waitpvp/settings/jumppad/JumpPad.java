package mc.waitpvp.settings.jumppad;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;


public class JumpPad implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location playerLocation = player.getLocation();
        Location blockLocation = playerLocation.subtract(0, 1, 0);

        if (blockLocation.getBlock().getType() == Material.STONE_PLATE) {
            Vector direction = player.getLocation().getDirection();
            double speedMultiplier = 2.0;
            direction.multiply(new Vector(speedMultiplier, 0, speedMultiplier));
            player.setVelocity(direction);
        }
    }
}
