package mc.waitpvp.settings.event;

import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import ga.strikepractice.events.DuelEndEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class fighendevent implements Listener {
    @EventHandler
    public void End(DuelEndEvent e) {
        StrikePracticeAPI api = StrikePractice.getAPI();
        Player p = e.getWinner();
        Player pl = e.getLoser();
        p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "勝利！", ChatColor.AQUA + "恭喜，你在這場戰鬥中獲勝了！"); ///贏家TITLES
        pl.sendTitle(ChatColor.RED + "" + ChatColor.BOLD + "你死了！" , ChatColor.WHITE + "正在將你傳送至大廳..."); ///輸家Titles
    }
}
