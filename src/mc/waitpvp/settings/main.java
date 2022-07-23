package mc.waitpvp.settings;

import mc.waitpvp.settings.color.ConsoleColors;
import mc.waitpvp.settings.event.fighendevent;
import mc.waitpvp.settings.event.pluginevent;
import mc.waitpvp.settings.event.tmt;
import mc.waitpvp.settings.menu.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class main extends JavaPlugin implements CommandExecutor {
    private static main plugin;
    private PluginDescriptionFile plugininfo;
    public String ShitPrefix;
    public final String DebugPrefix = ChatColor.AQUA + "[WaitCore] ";
    FileConfiguration configFile = this.getConfig();

    public main() {
        main.plugin = this;
        this.ShitPrefix = ChatColor.AQUA + "[WaitCore] ";;
    }

    public void onEnable() {
        if (!plugininfo.getName().equals("WaitCore")) {
            if(!plugininfo.getAuthors().equals("WaitNetwork")) {
                Bukkit.getPluginManager().disablePlugin(this);
            }
        }
            Bukkit.getConsoleSender().sendMessage(DebugPrefix  + ChatColor.GOLD  + plugininfo.getName() + " §A啟用成功!");
            Bukkit.getConsoleSender().sendMessage(DebugPrefix    + " §B版本: " + plugininfo.getVersion());
            Bukkit.getConsoleSender().sendMessage(DebugPrefix    + " §b作者: " + plugininfo.getAuthors() + " §l雨冬");
            this.registerCommands();
            this.getServer().getPluginManager().registerEvents(new tmt(), this);
            this.getServer().getPluginManager().registerEvents(new fighendevent(), this);
            this.getServer().getPluginManager().registerEvents(new pluginevent(), this);
            //上面註冊而已
            this.saveDefaultConfig();
            this.getConfig();
            configFile.addDefault("Wait Network only", true);
            configFile.options().copyDefaults(true);
            saveConfig();
            //load files config shit
    }
        @Override
        public void onDisable () {
            Bukkit.getConsoleSender().sendMessage(DebugPrefix + ChatColor.RED + "插件已關閉");
            Bukkit.getConsoleSender().sendMessage(DebugPrefix + ChatColor.RED + "版本 " + plugininfo.getVersion());
            saveConfig();
        }
    public void registerCommands() {
        this.getCommand("mus").setExecutor(new mus(this));
        this.getCommand("gg").setExecutor(new gg(this));
        this.getCommand("gma").setExecutor(new gma(this));
        this.getCommand("waitreport").setExecutor(new report(this));
        this.getCommand("eatgigi").setExecutor(new eatgigi(this));
        this.getCommand("gmc").setExecutor(new gmc(this));
        this.getCommand("gms").setExecutor(new gms(this));
        this.getCommand("howtoplay").setExecutor(new howtoplay(this));
        this.getCommand("plugins").setExecutor(new plugins(this));
        this.getCommand("waitpvp").setExecutor(new waitpvp(this));
        this.getCommand("resetname").setExecutor(new resetname(this));
    }
}


