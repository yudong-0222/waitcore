package mc.waitpvp.settings.menu;

import mc.waitpvp.settings.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class waitpvp implements CommandExecutor {
    public waitpvp(main main) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(args.length ==0) {
            sender.sendMessage("§l───────§l[§dWAIT §bNetwork§f§l]§l───────");
            sender.sendMessage("§r                                                                                                            ");
            sender.sendMessage("§eAuthor: WAIT NETWORK Development > YuDong");
            sender.sendMessage("§cversion: 1.838.89");
            sender.sendMessage("§dLast Update: 22/7/22");
            sender.sendMessage("§B描述: 專屬於WAIT NETWORK 核心，修補Practice插件不足, 添加自定義選單, ");
            sender.sendMessage("§c使用/waitcore help  §a獲取指令列表");
            sender.sendMessage("§r                                                                                                            ");
            sender.sendMessage("§l───────§l[§dWAIT §bNETWORK§f§l]§l───────");
            return true;
        }
        if(args[0].equalsIgnoreCase("help")) {
            sender.sendMessage("§l───────§l[§dWAIT §bCore§f§l]§l───────");
            sender.sendMessage("§r");
            sender.sendMessage("§d指令列表:");
            sender.sendMessage(" §b藍色-§f可以使用(沒有意外的話不會更動)");
            sender.sendMessage(" §4深紅色-§f可以使用，但是大機率不會有作用:P 列為下一次更新項目!");
            sender.sendMessage("  §c/waitcore:gmc §b創造");
            sender.sendMessage("  §c/waitcore:gms §b生存");
            sender.sendMessage("  §c/waitcore:gma §b冒險");
            sender.sendMessage("  §c/waitcore:eatgigi §bJust a meme eatgigi");
            sender.sendMessage("  §c/waitcore:howtoplay §b顯示如何遊玩");
            sender.sendMessage("  §c/waitcore:plugins §4目前還在開發 主要是用來替代原先spigot /plugin");
            sender.sendMessage("  §c/waitcore:report §4狗屎檢舉");
            sender.sendMessage("  §c/waitcore:resetname §4狗屎重製名字");
            sender.sendMessage("§l───────§l[§dWAIT §bCore§f§l]§l───────");
            return true;
        }
        return false;
        }
    }