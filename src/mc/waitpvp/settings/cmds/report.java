package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class report implements CommandExecutor {


    public report(Core Core) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (args.length == 0) {
            p.sendMessage("§7[§c!§7] §c用法: /waitreport <玩家名稱> <原因>");
            return true;
        } else if (args.length == 1) {
            p.sendMessage("§7[§c!§7] §c用法: /waitreport <玩家名稱> <原因>");
            return true;
        }
            p.sendMessage("§7[§c!§7] §c該功能仍在開發中! 遇到外掛使用/report 或者 在Discord通知管理層人員!");
            return true;
        }
    }
