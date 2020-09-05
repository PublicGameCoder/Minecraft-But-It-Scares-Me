package nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.containers;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import nl.mdgportfolio.minecraft.spiffey.minecraftbutitscaresme.items.ItemType;

public class MoonToolMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 480;
    }

    @Override
    public float getMiningSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemType.ITEM_RESOURCE_MOONSTONE.getItem());
    }
}
