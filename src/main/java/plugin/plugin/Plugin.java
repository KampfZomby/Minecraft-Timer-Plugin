package plugin.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.plugin.challenges.Challenges;
import plugin.plugin.challenges.ChallengesCommand;
import plugin.plugin.listener.DeathListener;
import plugin.plugin.listener.JoinListener;
import plugin.plugin.listener.QuitListener;
import plugin.plugin.timer.Timer;
import plugin.plugin.timer.TimerCommand;
import plugin.plugin.timer.TimerMenuHandler;
import plugin.plugin.utils.Config;

import java.util.Objects;

public final class Plugin extends JavaPlugin {

    private static Plugin instance;

    private Timer timer;
    private Challenges challenges;
    private Config config;

    @Override
    public void onLoad() {
        instance = this;
        config = new Config();
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Plugin enabled");

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new JoinListener(), this);
        manager.registerEvents(new QuitListener(), this);
        manager.registerEvents(new DeathListener(), this);
        manager.registerEvents(new TimerMenuHandler(), this);

        Objects.requireNonNull(getCommand("timer")).setExecutor(new TimerCommand());
        Objects.requireNonNull(getCommand("challenges")).setExecutor(new ChallengesCommand());

        timer = new Timer(false, 0, true, false);
        challenges = new Challenges(true, false);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Plugin disabled");
        timer.save();
        config.save();
    }

    public static Plugin getInstance() {
        return instance;
    }

    public Config getConfiguration() {
        return config;
    }

    public Timer getTimer() {
        return timer;
    }

    public Challenges getChallenges() {
        return challenges;
    }

}
