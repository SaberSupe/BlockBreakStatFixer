package saber.blockbreakstatfixer;

import org.bukkit.plugin.java.JavaPlugin;
import saber.blockbreakstatfixer.events.BlockBreakStatFixEvent;

import java.util.logging.Level;

public final class BlockBreakStatFixer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic


        // Register listener
        getServer().getPluginManager().registerEvents(new BlockBreakStatFixEvent(), this);

        // Log successful launch
        this.getLogger().log(Level.INFO, "Block Break Stat Fixer loaded Successfully");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
