package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gg implements  CommandExecutor {

    private Core core;
    public gg(Core core) {
        this.core = core;
    }
    private int time = 0;
    private int ct;
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player p = (Player) sender;
        if(args.length == 0) {
            p.sendMessage("§c用法： /gg <玩家名稱> §f- §a向該玩家發送一個 §6gg §a來表達敬意！");
            return true;
        } else if (args.length == 1) {
            String name = args[0];
            Player pa = Bukkit.getPlayer(name);
            if(time == 0) {
                ct = Bukkit.getScheduler().scheduleSyncRepeatingTask(core, () -> {
                    if (time == 15) {
                        time = 0;
                        Bukkit.getScheduler().cancelTask(ct);
                        return;
                    }
                    time++;
                }, 20, 20);
                if (pa != null) {
                    pa.sendMessage(core.DebugPrefix + "§6§lGG! §f來自 " + ChatColor.GREEN + p.getName());
                    pa.playSound(pa.getLocation(), Sound.NOTE_PLING, 1f, 1f);
                } else {
                    p.sendMessage("§c該玩家不存在或不在線上QQ");
                }
            } else {
                int x = 15- time;
                p.sendMessage(core.DebugPrefix + "§c冷卻中，請再等待 §f" + x + " §c秒"); return true;
            }
        } else {
            p.sendMessage("§c用法: /gg <玩家名稱> §a 向該玩家發送 gg");
            return true;
        }
        return false;
    }
}
