package mc.waitpvp.settings.menu;

import mc.waitpvp.settings.main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class howtoplay implements CommandExecutor {


    public howtoplay(main main) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            sender.sendMessage("§e§m-------------§9[§DWAIT NETWORK§9]§e§m-------------");
            sender.sendMessage("§e你好 ！ §b" + sender.getName());
            sender.sendMessage(ChatColor.YELLOW + "可以使用" + ChatColor.GREEN + "/party create 來創建隊伍並邀請朋友加入喔~");
            sender.sendMessage(ChatColor.RED + "加入Discord！" + "§ddsc.gg/waitpvp" );
            sender.sendMessage("§e§m-------------§9[§DWAIT NETWORK§9]§e§m-------------");
            return true;
        }

}
