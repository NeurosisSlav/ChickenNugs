package com.neurosisslav.chickennugs.init;

import java.util.ArrayList;
import java.util.List;

import com.neurosisslav.chickennugs.items.ItemBase;
import com.neurosisslav.chickennugs.items.food.FoodBase;
import com.neurosisslav.chickennugs.items.food.FoodEffectBase;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item RAW_CHICKEN_NUGGET = new ItemBase("raw_chicken_nugget");
	public static final Item COOKED_CHICKEN_NUGGET = new ItemBase("cooked_chicken_nugget");
	
	//Foods
	public static final Item TEST_CHICKEN_NUGGET = new FoodBase("test_chicken_nugget", 4, 3.6f, false);
	public static final Item TEST2_CHICKEN_NUGGET = new FoodEffectBase("test2_chicken_nugget", 1, 2.0f, false, new PotionEffect(MobEffects.HUNGER, (20*20), 0, false, true));
	
}
