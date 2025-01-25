package ch.vladosss491.dotamusic.sound;

import ch.vladosss491.dotamusic.DotaMusic;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, DotaMusic.MOD_ID);



    public static final Supplier<SoundEvent> SPLESNIK = registerSoundEvent("splesnik");
    public static final ResourceKey<JukeboxSong> SPLESNIK_KEY = createSong("splesnik");

    public static final Supplier<SoundEvent> GMCOIL = registerSoundEvent("gmcoil");
    public static final ResourceKey<JukeboxSong> GMCOIL_KEY = createSong("gmcoil");

    public static final Supplier<SoundEvent> OTETZ = registerSoundEvent("otetz");
    public static final ResourceKey<JukeboxSong> OTETZ_KEY = createSong("otetz");

    public static final Supplier<SoundEvent> SPPSEVDO = registerSoundEvent("sppsevdo");
    public static final ResourceKey<JukeboxSong> SPPSEVDO_KEY = createSong("sppsevdo");


    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(DotaMusic.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(DotaMusic.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
