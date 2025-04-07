package net.tshark9.betterfishing.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tshark9.betterfishing.BetterFishing;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, BetterFishing.MOD_ID);

    public static final RegistryObject<Item> RAWBLUEGILL = ITEMS.register("raw_bluegill",
            () -> new Item(new Item.Properties()));



    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
