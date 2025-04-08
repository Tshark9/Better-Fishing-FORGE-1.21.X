package net.tshark9.betterfishing.item.custom;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tshark9.betterfishing.BetterFishing;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, BetterFishing.MOD_ID);

    public static final RegistryObject<Item> RAW_BLUEGILL = ITEMS.register("raw_bluegill",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BLUEGILL)));
    public static final RegistryObject<Item> COOKED_BLUEGILL = ITEMS.register("cooked_bluegill",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BLUEGILL)));
    public static final RegistryObject<Item> RAW_COMMON_CARP = ITEMS.register("raw_common_carp",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_COMMON_CARP)));
    public static final RegistryObject<Item> COOKED_COMMON_CARP = ITEMS.register("cooked_common_carp",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_COMMON_CARP)));
    public static final RegistryObject<Item> RAW_BLACK_CRAPPIE = ITEMS.register("raw_black_crappie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BLACK_CRAPPIE)));
    public static final RegistryObject<Item> COOKED_BLACK_CRAPPIE = ITEMS.register("cooked_black_crappie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BLACK_CRAPPIE)));


    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
