package net.tshark9.betterfishing.item.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tshark9.betterfishing.BetterFishing;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterFishing.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_FISHING_FISH = CREATIVE_MODE_TABS.register("betterfishing_fish",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_BLUEGILL.get()))
                    .title(Component.translatable("creativetab.betterfishing.betterfishingfish"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_BLUEGILL.get());
                        output.accept(ModItems.COOKED_BLUEGILL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> BETTER_FISHING_RODS = CREATIVE_MODE_TABS.register("betterfishing_rods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COOKED_BLUEGILL.get()))
                    .withTabsBefore(BETTER_FISHING_FISH.getId())
                    .title(Component.translatable("creativetab.betterfishing.betterfishingrods"))
                    .displayItems((itemDisplayParameters, output) -> {

                    }).build());

    public static  void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
