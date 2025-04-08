package net.tshark9.betterfishing.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RAW_BLUEGILL = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f)
            .effect(new MobEffectInstance(MobEffects.POISON, 200), 0.20f).build();
    public static final FoodProperties COOKED_BLUEGILL = new FoodProperties.Builder().nutrition(5).saturationModifier(0.6f).build();
    public static final FoodProperties RAW_COMMON_CARP = new FoodProperties.Builder().nutrition(3).saturationModifier(0.1f)
            .effect(new MobEffectInstance(MobEffects.POISON, 200), 0.20f).build();
    public static final FoodProperties COOKED_COMMON_CARP = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6f).build();

}
