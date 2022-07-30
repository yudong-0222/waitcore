package mc.waitpvp.settings.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class death implements Listener {
    @EventHandler
    public void PlayerD(PlayerDeathEvent e) {
            e.setDeathMessage(null); /* 設置死亡訊息， 將來請getConfig PATH 抓取自定義*/
    }
}
