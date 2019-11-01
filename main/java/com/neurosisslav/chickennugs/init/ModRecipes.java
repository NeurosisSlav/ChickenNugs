package com.neurosisslav.chickennugs.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.TEST2_CHICKEN_NUGGET, new ItemStack(ModItems.TEST_CHICKEN_NUGGET, 1), 1.5f);
	}
}
