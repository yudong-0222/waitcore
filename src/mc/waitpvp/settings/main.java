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
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class main extends JavaPlugin implements CommandExecutor {
    public main() {
    }
    FileConfiguration configFile = this.getConfig();
    public void onEnable() {
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

        if(configFile.getBoolean("Wait Network only")) {
            getLogger().info( ConsoleColors.GREEN + "操" + ConsoleColors.YELLOW_BOLD + " WAITCORE" + ConsoleColors.RESET);
    }
        //FALSE
        getLogger().warning(ConsoleColors.RED + "WAIT NETWORK ONLY!! " + ConsoleColors.RESET);
        getLogger().info( ConsoleColors.RED_BOLD + "取消讀取" + ConsoleColors.CYAN + " WAITCORE" + ConsoleColors.RESET);
        Plugin core = Bukkit.getPluginManager().getPlugin("WaitCore");
        Bukkit.getPluginManager().disablePlugin(core);
    }


    public void onDisable() {
        getLogger().warning(ConsoleColors.RED_BOLD + "WAIT CORE 已關閉! 感謝您的使用" + ConsoleColors.RESET);
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
    int time;
    int taskID;
    public void setTimer(int amount) {
        time = amount;

    }
    public void startTimer() {
        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        taskID = scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
            @Override
            public void run() {
                if(time == 0) {
                    Bukkit.broadcastMessage(ChatColor.RED + "Time is up!");
                    stopTimer();
                    return;
                }
            }
        }, 0L, 20L);
        time = time - 1;
    }
    public void stopTimer() {
        Bukkit.getScheduler().cancelTask(taskID);
    }


    }


