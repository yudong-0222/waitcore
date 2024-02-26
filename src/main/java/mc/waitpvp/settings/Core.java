package mc.waitpvp.settings;

import mc.waitpvp.settings.cmds.*;

import mc.waitpvp.settings.jumppad.JumpPad;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;




public class Core extends JavaPlugin implements CommandExecutor {
    public final String DebugPrefix = ChatColor.GRAY + "[§c§lWAIT§7]§r ";

    @Override
    public void onEnable() {
        if (!getDescription().getName().equals("WaitCore")) {
            if(!getDescription().getAuthors().contains("YuDong")) {
                Bukkit.getPluginManager().disablePlugin(this);
            }
        }
//        this.getConfig().options().copyDefaults();
//        this.saveDefaultConfig();
        this.sendEnable();
        this.registerCommands();

        Bukkit.getPluginManager().registerEvents(new JumpPad(),this);

    }
    @Override
    public void onDisable () {
        Bukkit.getConsoleSender().sendMessage(DebugPrefix + ChatColor.RED + "插件已關閉");
        Bukkit.getConsoleSender().sendMessage(DebugPrefix + ChatColor.RED + "版本 " + getDescription().getVersion());
    }
    public void registerCommands() {
        getCommand("gg").setExecutor(new gg(this));
        getCommand("gma").setExecutor(new gma(this));
        getCommand("eatgigi").setExecutor(new eatgigi(this));
        getCommand("gmc").setExecutor(new gmc(this));
        getCommand("gms").setExecutor(new gms(this));
        getCommand("howtoplay").setExecutor(new howtoplay());
        getCommand("waitpvp").setExecutor(new waitpvp(this));
    }
    public void sendEnable(){
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + ChatColor.GOLD  + " ───────────────────────────");
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + ChatColor.GOLD  + getDescription().getName() + " §A啟用成功!");
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + " §B版本: " + getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + " §b作者: " + getDescription().getAuthors());
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + ChatColor.GOLD  + " ───────────────────────────");
    }
}


