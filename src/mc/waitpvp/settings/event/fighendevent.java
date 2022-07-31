package mc.waitpvp.settings.event;

import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import ga.strikepractice.events.DuelEndEvent;
import mc.waitpvp.settings.Core;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class fighendevent implements Listener {
    private Core core;
        public fighendevent(Core cc) {
            this.core= cc;


    }
    @EventHandler
    public void End(DuelEndEvent e) {
        StrikePracticeAPI api = StrikePractice.getAPI();
        Player p = e.getWinner();
        Player pl = e.getLoser();
        p.sendTitle(ChatColor.GOLD + "" + ChatColor.BOLD + "勝利！", ChatColor.GREEN + p.getName() + ChatColor.WHITE + " 贏得這場勝利"); ///贏家TITLES
        pl.sendTitle(ChatColor.RED + "" + ChatColor.BOLD + "你死了！" , ChatColor.RED + p.getName() + ChatColor.WHITE + " 贏得這場勝利"); ///輸家Titles
        p.sendMessage(ChatColor.RED + pl.getName() + " §f被 " + ChatColor.AQUA + p.getName() + " §f" + core.getConfig().getString("message.winner-kill"));
        pl.sendMessage(ChatColor.RED + pl.getName() + " §f被 " + ChatColor.AQUA + p.getName() + "§f");
    }
    @EventHandler
    public void DeathMessage(PlayerDeathEvent e) {
        e.setDeathMessage(null);
    }
}
