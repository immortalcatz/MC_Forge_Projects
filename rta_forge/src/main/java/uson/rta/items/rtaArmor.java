package uson.rta.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class rtaArmor extends ItemArmor {

	public rtaArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName("rta_" + name);
		setTextureName("rta:" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == rtaItems.carbonHelm || stack.getItem() == rtaItems.carbonArmor || stack.getItem() == rtaItems.carbonBoots) {
			return "rta:models/armor/carbon_layer_1.png";
		}
		else if(stack.getItem() == rtaItems.carbonPants) {
			return "rta:models/armor/carbon_layer_2.png";
		}
		else if(stack.getItem() == rtaItems.blazeHelm || stack.getItem() == rtaItems.blazeArmor || stack.getItem() == rtaItems.blazeBoots) {
			return "rta:models/armor/blaze_layer_1.png";
		}
		else if(stack.getItem() == rtaItems.blazePants) {
			return "rta:models/armor/blaze_layer_2.png";
		}
		else if(stack.getItem() == rtaItems.ironRefinedHelm || stack.getItem() == rtaItems.ironRefinedArmor || stack.getItem() == rtaItems.ironRefinedBoots) {
			return "rta:models/armor/ironrefined_layer_1.png";
		}
		else if(stack.getItem() == rtaItems.ironRefinedPants) {
			return "rta:models/armor/ironrefined_layer_2.png";
		}
		else if(stack.getItem() == rtaItems.goldRefinedHelm || stack.getItem() == rtaItems.goldRefinedArmor || stack.getItem() == rtaItems.goldRefinedBoots) {
			return "rta:models/armor/goldrefined_layer_1.png";
		}
		else if(stack.getItem() == rtaItems.goldRefinedPants) {
			return "rta:models/armor/goldrefined_layer_2.png";
		}
		else if(stack.getItem() == rtaItems.diamondRefinedHelm || stack.getItem() == rtaItems.diamondRefinedArmor || stack.getItem() == rtaItems.diamondRefinedBoots) {
			return "rta:models/armor/diamondrefined_layer_1.png";
		}
		else if(stack.getItem() == rtaItems.diamondRefinedPants) {
			return "rta:models/armor/diamondrefined_layer_2.png";
		}
		else if(stack.getItem() == rtaItems.powerHelm || stack.getItem() == rtaItems.powerArmor || stack.getItem() == rtaItems.powerBoots) {
			return "rta:models/armor/power_layer_1.png";
		}
		else if(stack.getItem() == rtaItems.powerPants) {
			return "rta:models/armor/power_layer_2.png";
		}
		return null;
	}
}
