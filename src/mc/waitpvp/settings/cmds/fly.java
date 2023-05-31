package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
    private Core core;

    public void setCore(Core core) {
        this.core = core;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command!");
            return true;
        }

        Player player = (Player) sender;

        if (player.hasPermission("waitcore.fly")) { // 檢查玩家是否有飛行權限
            if (player.getAllowFlight()) {
                player.setAllowFlight(false);
                player.setFlying(false);
                player.sendMessage("§cFlight disabled.");
            } else {
                player.setAllowFlight(true);
                player.sendMessage("§aFlight enabled.");
            }
        } else {
            player.sendMessage(ChatColor.RED + core.getConfig().getString("message.noperm"));
        }

        return true;
    }
}
