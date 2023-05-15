package mc.waitpvp.settings;

import mc.waitpvp.settings.event.fighendevent;
import mc.waitpvp.settings.event.fightstartevent;
import mc.waitpvp.settings.event.tmt;
import mc.waitpvp.settings.cmds.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;


public class Core extends JavaPlugin implements CommandExecutor {
    public final String DebugPrefix = ChatColor.AQUA + "[WaitCore] ";
    private  Core plugin;

    public void onEnable() {
        if (!getDescription().getName().equals("WaitCore")) {
            if(!getDescription().getAuthors().equals("WaitNetwork")) {
                Bukkit.getPluginManager().disablePlugin(this);
            }
        }
        this.getConfig().options().copyDefaults();
        this.saveDefaultConfig();
        this.sendEnable();
        this.plugin = plugin;
        this.registerCommands();
        //上面註冊而已
        this.regEvents();
        /* 註冊事件 ouo*/
            //load files config shit
    }
        @Override
        public void onDisable () {
            Bukkit.getConsoleSender().sendMessage(DebugPrefix + ChatColor.RED + "插件已關閉");
            Bukkit.getConsoleSender().sendMessage(DebugPrefix + ChatColor.RED + "版本 " + getDescription().getVersion());
        }
    public void registerCommands() {
        getCommand("mus").setExecutor(new mus(this));
        getCommand("gg").setExecutor(new gg());
        getCommand("gma").setExecutor(new gma(this));
        getCommand("waitreport").setExecutor(new report(this));
        getCommand("eatgigi").setExecutor(new eatgigi(this));
        getCommand("gmc").setExecutor(new gmc(this));
        getCommand("gms").setExecutor(new gms(this));
        getCommand("howtoplay").setExecutor(new howtoplay(this));
        getCommand("waitpvp").setExecutor(new waitpvp(this));
        getCommand("resetname").setExecutor(new resetname(this));
    }
    public void regEvents(){
        if ((getServer().getPluginManager().getPlugin("StrikePractice")) != null) {
            this.getServer().getPluginManager().registerEvents(new tmt(this), this);
            this.getServer().getPluginManager().registerEvents(new fighendevent(this), this);
            this.getServer().getPluginManager().registerEvents(new fightstartevent(this), this);
            Bukkit.getConsoleSender().sendMessage(DebugPrefix + ChatColor.GREEN + "已載入" + ChatColor.YELLOW + "StrikePractice "+ ChatColor.GREEN + "擴充功能");
        } else {
            Bukkit.getConsoleSender().sendMessage((DebugPrefix + ChatColor.RED + "已經將" + ChatColor.GREEN + "StrikePractice"+ ChatColor.RED + "擴充關閉"));
        }

    }
    public void sendEnable(){
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + ChatColor.GOLD  + " ───────────────────────────");
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + ChatColor.GOLD  + getDescription().getName() + " §A啟用成功!");
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + " §B版本: " + getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + " §b作者: " + getDescription().getAuthors());
        Bukkit.getConsoleSender().sendMessage(DebugPrefix  + ChatColor.GOLD  + " ───────────────────────────");
    }
}


