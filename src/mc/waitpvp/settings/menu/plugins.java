package mc.waitpvp.settings.menu;

import mc.waitpvp.settings.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class plugins implements CommandExecutor {

    public plugins(main main) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("waitpvp.plugins")) {
            sender.sendMessage("§fPlugins (1): §aWaitNetwork");
            return true;
        }
        sender.sendMessage("You dont have dick");
        return true;
}
}
