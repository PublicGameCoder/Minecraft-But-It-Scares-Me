package nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.Main;

public class ItemRegistry {

    private final Main plugin;

    public ItemRegistry(Main plugin) {
        this.plugin = plugin;

        for (ItemType itemType : ItemType.values()) {
            registerItem(itemType);
        }
    }

    private void registerItem(ItemType itemType) {
        Item item = itemType.getItem();
        Registry.register(Registry.ITEM, new Identifier(plugin.getModId(), itemType.getPath()), item);
    }
}
