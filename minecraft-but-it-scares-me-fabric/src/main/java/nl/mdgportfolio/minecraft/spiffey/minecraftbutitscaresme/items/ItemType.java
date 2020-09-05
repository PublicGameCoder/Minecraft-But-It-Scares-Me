package nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.containers.*;

public enum ItemType {
    ITEM_RESOURCE_MOONSTONE("moonstone_item", new Item(new Item.Settings().group(ItemGroup.MATERIALS))),
    ITEM_MOONSTONE_SWORD("moonstone_sword", new MoonStoneSword()),
    ARMOR_MOONSTONE_HELMET("moonstone_helmet", new MoonHelmet()),
    ARMOR_MOONSTONE_CHESTPLATE("moonstone_chestplate", new MoonChestplate()),
    ARMOR_MOONSTONE_LEGGINGS("moonstone_leggings", new MoonLeggings()),
    ARMOR_MOONSTONE_BOOTS("moonstone_boots", new MoonBoots())
    ;

    private String path;
    private Item item;

    ItemType(String path, Item item) {
        this.path = path;
        this.item = item;
    }

    public String getPath() {
        return path;
    }

    public Item getItem() {
        return item;
    }
}
