package mc.waitpvp.settings.menu;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gg implements  CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(args.length == 0) {
            p.sendMessage("§c用法:/gg <ign> §a 向<ign> 發起gg <3");
            return true;
            }
        if (!(args.length == 1 )) {
            return false;
        }
        p.sendMessage("只是開個玩笑 joke command");
            return false;
    }
        }
