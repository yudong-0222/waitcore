package mc.waitpvp.settings.menu;

import mc.waitpvp.settings.main;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
 public class gmc implements CommandExecutor {

     public gmc(main main) {
     }

     @Override
     public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
         Player p = (Player) sender;
         if (!sender.hasPermission("rp.gmc")) {
             p.sendMessage("§c你沒有權限！若你為管理層人員，通報插件作者！");
             return true;
         }
         if (cmd.getName().equalsIgnoreCase("gmc")) {
             p.setGameMode(GameMode.CREATIVE);
             p.getGameMode().equals(GameMode.CREATIVE);
             p.sendMessage("§a創造模式!");
         }
         return true;
     }
 }

