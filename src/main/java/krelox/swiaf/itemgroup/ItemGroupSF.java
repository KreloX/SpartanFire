package krelox.swiaf.itemgroup;

import krelox.swiaf.init.ItemRegistrySF;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupSF extends ItemGroup
{
	public static final ItemGroupSF ITEM_GROUP_SF = new ItemGroupSF(ItemGroup.TABS.length, "sw_iaf");

	public ItemGroupSF(int index, String label) 
	{
		super(index, label);
	}

	@Override
	public ItemStack makeIcon() 
	{
		return new ItemStack(ItemRegistrySF.GREATSWORD_LIGHTNING_DRAGONSTEEL.get());
	}
	
}
