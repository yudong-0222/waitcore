package mc.waitpvp.settings.menu;

import mc.waitpvp.settings.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class waitpvp implements CommandExecutor {
    public waitpvp(main main) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            sender.sendMessage("§l§m----------§l[§dWAIT §bNETWORK§f§l]§l§m----------");
            sender.sendMessage("§r                                                                                                            ");
            sender.sendMessage("§eAuthor: WAIT NETWORK Development > YuDong");
            sender.sendMessage("§cversion: 69AC");
            sender.sendMessage("§dLast Update: 17/7/22");
            sender.sendMessage("§B描述: 專屬於WAIT NETWORK 核心，修補Practice插件不足, 添加自定義選單, ");
            sender.sendMessage("§r                                                                                                            ");
            sender.sendMessage("§l§m----------§l[§dWAIT §bNETWORK§f§l]§l§m----------");
            return true;
        }
    }