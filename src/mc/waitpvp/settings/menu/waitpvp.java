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
            sender.sendMessage("§4§l試驗階段已過，請更新憑證已繼續使用!  ");
            sender.sendMessage("§4§l否則您的試用資格將取消，聯繫Mojang 來獲得新憑證!");
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