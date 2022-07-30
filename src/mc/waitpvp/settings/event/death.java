package mc.waitpvp.settings.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class death implements Listener {
    @EventHandler
    public void PlayerD(PlayerDeathEvent e) {
            e.setDeathMessage(null);
    }
}
