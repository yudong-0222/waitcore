package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class eatgigi implements Listener, CommandExecutor {
    public eatgigi(Core Core) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender.hasPermission("waitpvp.eatgigi"))) {
            sender.sendMessage("§c§l沒有權限吃ㄐㄐ！ 再嘗試一次?？");
            return false;
        }
        Player p = (Player) sender;
        p.sendMessage("§c吃 ㄐ ㄐ 吃 ㄐ ㄐ");
        p.sendTitle("§4雞雞天王已上線", "§7§l久候多時...");
        return true;
    }
}