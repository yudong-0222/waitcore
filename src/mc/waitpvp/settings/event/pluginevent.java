package mc.waitpvp.settings.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class pluginevent implements Listener {

    @EventHandler
        public void oncommand ( PlayerCommandPreprocessEvent e ) {
        String a = ("/plugins" +  "pl");
        if (e.getMessage ( ).toLowerCase().startsWith("/plugins" )) {
            e. setCancelled(true);

        if (e.getMessage ( ).toLowerCase().startsWith("/pl" )) {
            e. setCancelled(true);
        }
    }
    }
}


