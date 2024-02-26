package mc.waitpvp.settings.cmds;

import mc.waitpvp.settings.Core;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
 public class gmc implements CommandExecutor {
    private Core core;
     public gmc(Core Core) {
         this.core = Core;
     }

     @Override
     public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
         Player p = (Player) sender;
         if (!sender.hasPermission("waitcore.gm")) {
             p.sendMessage(ChatColor.RED + core.getConfig().getString("message.noperm"));
             return true;
         }
         if (cmd.getName().equalsIgnoreCase("gmc")) {
             p.setGameMode(GameMode.CREATIVE);
             p.sendMessage("§a創造模式!");
         }
         return true;
     }
 }
