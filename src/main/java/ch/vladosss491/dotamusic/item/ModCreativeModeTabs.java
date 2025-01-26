package ch.vladosss491.dotamusic.item;

import ch.vladosss491.dotamusic.DotaMusic;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DotaMusic.MOD_ID);



    public static final Supplier<CreativeModeTab> DOTAMUSIC_TAB = CREATIVE_MODE_TAB.register("dotamusic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.MUSIC_DISC_5))
                    .title(Component.translatable("creativetab.dotamusic"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.SPLESNIK);
                        output.accept(ModItems.GMCOIL);
                        output.accept(ModItems.OTETZ);
                        output.accept(ModItems.SPPSEVDO);
                        output.accept(ModItems.SARAH);
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
