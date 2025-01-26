package ch.vladosss491.dotamusic.item;

import ch.vladosss491.dotamusic.DotaMusic;
import ch.vladosss491.dotamusic.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DotaMusic.MOD_ID);



    public static final DeferredItem<Item> SPLESNIK = ITEMS.register("splesnik",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.SPLESNIK_KEY).stacksTo(1)));

    public static final DeferredItem<Item> GMCOIL = ITEMS.register("gmcoil",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.GMCOIL_KEY).stacksTo(1)));

    public static final DeferredItem<Item> OTETZ = ITEMS.register("otetz",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.OTETZ_KEY).stacksTo(1)));

    public static final DeferredItem<Item> SPPSEVDO = ITEMS.register("sppsevdo",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.SPPSEVDO_KEY).stacksTo(1)));

    public static final DeferredItem<Item> SARAH = ITEMS.register("sarah",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.SARAH_KEY).stacksTo(1)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
