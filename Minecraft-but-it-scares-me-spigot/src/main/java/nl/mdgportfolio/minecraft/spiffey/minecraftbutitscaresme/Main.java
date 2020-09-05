package nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;

        registerManagers();
        registerListeners();
        registerCommands();
    }

    private void registerManagers() {

    }

    private void registerListeners() {

    }

    private void registerCommands() {

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getInstance() {
        return instance;
    }
}
