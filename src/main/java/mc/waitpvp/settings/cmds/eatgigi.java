package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.UUID;

public class eatgigi implements Listener, CommandExecutor {
    private Core core;
    private int cc = 0;
    private int asos;

    public eatgigi(Core core) {
        this.core = core;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {sender.sendMessage(core.DebugPrefix + "§c你必須是一名玩家，傻逼。"); return true;}
        Player p = (Player) sender;

        if(cc == 0) {
            for (Player pp : Bukkit.getOnlinePlayers()) pp.sendMessage(core.DebugPrefix + "§d" + p.getName() + " §f剛剛吃了一根ㄐㄐ！");
            p.playSound(p.getLocation(), Sound.FIREWORK_LARGE_BLAST2, 5f, 1f);

            asos = Bukkit.getScheduler().scheduleSyncRepeatingTask(core, () -> {
                if (cc == 15) {
                    cc = 0;
                    Bukkit.getScheduler().cancelTask(asos);
                    return;
                }
                cc++;
            }, 20, 20);
        } else {
            int x = 15 - cc;
            p.sendMessage(core.DebugPrefix + "§c冷卻中，請再等待 §f" + x + " §c秒"); return true;
        }
        return true;
    }
}