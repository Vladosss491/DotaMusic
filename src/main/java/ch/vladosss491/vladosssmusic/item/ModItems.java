package ch.vladosss491.vladosssmusic.item;

import ch.vladosss491.vladosssmusic.VladosssMusic;
import ch.vladosss491.vladosssmusic.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VladosssMusic.MOD_ID);



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

    public static final DeferredItem<Item> MEMORIES = ITEMS.register("memories",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MEMORIES_KEY).stacksTo(1)));

    public static final DeferredItem<Item> ROLLIN = ITEMS.register("rollin",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.ROLLIN_KEY).stacksTo(1)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
