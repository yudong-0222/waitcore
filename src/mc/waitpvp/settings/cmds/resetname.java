package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class resetname implements CommandExecutor {

    public resetname(Core Core) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        p.sendMessage("§c沒有此指令！  不過是作者懶得寫");
        return true;
    }
}
