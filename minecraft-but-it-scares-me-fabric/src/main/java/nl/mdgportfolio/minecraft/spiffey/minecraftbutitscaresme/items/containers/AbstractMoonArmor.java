package nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.containers;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.MaterialType;

public abstract class AbstractMoonArmor extends ArmorItem {

    public AbstractMoonArmor(EquipmentSlot equipmentSlot) {
        super(MaterialType.ARMOR_MOONSTONE, equipmentSlot, new Settings().group(ItemGroup.COMBAT));
    }

}
