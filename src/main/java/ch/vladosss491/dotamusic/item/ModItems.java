package ch.vladosss491.dotamusic.item;

import ch.vladosss491.dotamusic.DotaMusic;
import ch.vladosss491.dotamusic.sound.ModSounds;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DotaMusic.MOD_ID);



    public static final DeferredItem<Item> SPLESNIK = ITEMS.register("splesnik",
    () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SPLESNIK_KEY).stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
