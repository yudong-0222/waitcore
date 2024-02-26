package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms implements CommandExecutor {

    private Core core;
    public gms(Core Core) {
        this.core = Core;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("NO you aren't PLAYER");
        }
        Player p = (Player) sender;
        if (!p.hasPermission("waitcore.gm")) {
            return true;
        }
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage("§b生存模式!!");
        return true;
    }
}

