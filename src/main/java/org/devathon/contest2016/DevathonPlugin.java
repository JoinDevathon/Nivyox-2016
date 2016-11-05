package org.devathon.contest2016;

import org.bukkit.plugin.java.JavaPlugin;

public class DevathonPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabled");
        this.getCommand("calculator").setExecutor(new CommandCalculator(this));
        this.getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
    }

    @Override
    public void onDisable() {
        // put your disable code here
    }
}

