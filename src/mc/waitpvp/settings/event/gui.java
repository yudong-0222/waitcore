package mc.waitpvp.settings.event;

import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import ga.strikepractice.api.a;
import ga.strikepractice.battlekit.BattleKit;
import ga.strikepractice.events.DuelStartEvent;
import ga.strikepractice.events.FightStartEvent;
import ga.strikepractice.fights.Fight;
import ga.strikepractice.fights.queue.QueueRunnable;
import mc.waitpvp.settings.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.net.http.WebSocket;

public class gui implements Listener {
public Core core;
public int count = 4;
public  int Task;
public gui (Core core) {
    this.core = core;
}

    StrikePracticeAPI api = StrikePractice.getAPI();
    @EventHandler
    public void gui(DuelStartEvent d) {
        Player p1 = d.getPlayer1();
        Player p2 = d.getPlayer2();
        String kit = d.getKit().getName();
        if (count != -1) {
            Task = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(core, () -> {
                switch (count) {
                    case 4:
                        break;
                    case 3:
                        p1.sendTitle("§d§l" + count, "" );
                        p2.sendTitle("§d§l" + count, "" );
                        break;
                    case 2:
                        p1.sendTitle("§d§l" + count, null );
                        p2.sendTitle("§d§l" + count, null );
                        break;
                    case 1:
                        p1.sendTitle("§d§l" + count, "§b模式: §a" + kit);
                        p2.sendTitle("§d§l" + count, "§b模式: §a" + kit);
                        break;
                }
                count--;
                if(count == -1) {
                    Bukkit.getServer().getScheduler().cancelTask(Task);
                    p1.sendTitle("§d§l戰鬥開始了!", "§fGood Luck!");
                    p2.sendTitle("§d§l戰鬥開始了!", "§fGood Luck!");
                    this.count = 4;
                }
            }, 0, 20L);
        }
    }
}
