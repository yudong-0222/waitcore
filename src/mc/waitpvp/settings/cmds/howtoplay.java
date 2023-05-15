package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class howtoplay implements CommandExecutor {


    public howtoplay(Core Core) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            sender.sendMessage("§e§m-------------§9[§DWAIT NETWORK§9]§e§m-------------");
            sender.sendMessage("§e你好 ！ §b" + sender.getName());
            sender.sendMessage(ChatColor.YELLOW + "可以使用" + ChatColor.GREEN + "/party create 來創建隊伍並邀請朋友加入");
            sender.sendMessage(ChatColor.YELLOW + "或者使用" + ChatColor.GREEN + "§f鐵劍 §a選擇模式加佇列!");
            sender.sendMessage(ChatColor.RED + "加入Discord - " + "§ddsc.gg/waitpvp" );
            sender.sendMessage(ChatColor.RED + "官方網站 - " + "§dhttps://wait2.weebly.com/" );
            sender.sendMessage("§e§m-------------§9[§DWAIT NETWORK§9]§e§m-------------");
            return true;
        }

}
