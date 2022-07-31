package mc.waitpvp.settings.menu;

import mc.waitpvp.settings.Core;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gms implements CommandExecutor {


    public gms(Core Core) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage("NO you aren't PLAYER");
        }
        Player p = (Player) sender;
        if (!p.hasPermission("rp.gms")) {
            p.sendMessage("§c你沒有權限，若你為管理層人員，通報插件作者!");
            return true;
        }
            p.setGameMode(GameMode.SURVIVAL);
            p.getGameMode().equals(GameMode.SURVIVAL);
            p.sendMessage("§b生存模式!!");
        return true;
    }
}

