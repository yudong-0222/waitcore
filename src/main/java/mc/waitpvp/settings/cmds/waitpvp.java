package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class waitpvp implements CommandExecutor {

    private Core core;
    public waitpvp(Core cc) {
        this.core = cc;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(args.length ==0) {
            sender.sendMessage("§l───────§l[§dWAIT §bNetwork§f§l]§l───────");
            sender.sendMessage("§eAuthor: YuDong");
            sender.sendMessage("§cVersion: " + core.getDescription().getVersion());
            sender.sendMessage("§dLast Update: 4/9/23");
            sender.sendMessage("§f使用 /waitcore help  §a獲取指令列表");
            sender.sendMessage("§l───────§l[§dWAIT §bNETWORK§f§l]§l───────");
            return true;
        }
        if(args[0].equalsIgnoreCase("help")) {
            sender.sendMessage("§l───────§l[§dWAIT §bCore§f§l]§l───────");
            sender.sendMessage("§d指令列表:");
            sender.sendMessage(" §b藍色-§f可以使用(沒有意外的話不會更動)");
            sender.sendMessage(" §4深紅色-§f可以使用，但是大機率不會有作用:P 列為下一次更新項目!");
            sender.sendMessage("  §c/waitcore:gmc §b創造");
            sender.sendMessage("  §c/waitcore:gms §b生存");
            sender.sendMessage("  §c/waitcore:gma §b冒險");
            sender.sendMessage("  §c/waitcore:eatgigi §b宣告吃ㄐㄐ是什麼");
            sender.sendMessage("  §c/waitcore:howtoplay §b顯示如何遊玩");
            sender.sendMessage("  §r");
            sender.sendMessage("  §c/waitcore:plugins §4目前還在開發 主要是用來替代原先spigot /plugin");
            sender.sendMessage("  §c/waitcore:report §4狗屎檢舉");
            sender.sendMessage("  §c/waitcore:resetname §4狗屎重製名字");
            sender.sendMessage("§l───────§l[§dWAIT §bCore§f§l]§l───────");
            return true;
        }
        if(args[0].equalsIgnoreCase("reload") || args[0].equalsIgnoreCase("rl")) {
            if(sender.hasPermission("waitpvp.reload")){
                //有權限 執行這
                core.reloadConfig();
                sender.sendMessage(core.DebugPrefix + "§a插件已經重啟完畢");
                sender.sendMessage(core.DebugPrefix + "§c不推薦使用/waitcore reload 可能導致部分資料受損。");
                return true;
            }
            sender.sendMessage(core.DebugPrefix + "§cNOOOOOO haha");
                return true;
        }
        return false;
        }
    }