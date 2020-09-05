package nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.containers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.MaterialType;

public class MoonStoneSword extends SwordItem {

    public MoonStoneSword() {
        super(MaterialType.SWORD_MOONSTONE, 3, 1.5F, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
