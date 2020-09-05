package nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme;

import net.fabricmc.api.ModInitializer;
import nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.ItemRegistry;

public class Main implements ModInitializer {

    private ItemRegistry itemRegistry;

    @Override
    public void onInitialize() {

        registerManagers();
        registerListeners();
        registerCommands();
    }

    private void registerManagers() {
        itemRegistry = new ItemRegistry(this);
    }

    private void registerListeners() {

    }

    private void registerCommands() {

    }

    public String getModId() {
        return "mbism";
    }
}
