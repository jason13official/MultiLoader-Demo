package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.registry.ModBlocks;
import io.github.jason13official.my_cool_mod.registry.ModItems;
import io.github.jason13official.my_cool_mod.registry.ModTabs;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class ExampleMod {

  public static IEventBus eventBus;

  public ExampleMod(IEventBus eventBus) {

    ExampleMod.eventBus = eventBus;

    CommonClass.init();

    bind(Registries.BLOCK, ModBlocks::register);
    bind(Registries.ITEM, ModItems::register);
    bind(Registries.CREATIVE_MODE_TAB, ModTabs::register);
  }

  /** Adapted from <a href="https://github.com/VazkiiMods/Botania">Botania</a> */
  private static <T> void bind(
      ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
    eventBus.addListener((RegisterEvent event) -> {
      if (registry.equals(event.getRegistryKey())) {
        source.accept((t, rl) -> event.register(registry, rl, () -> t));
      }
    });
  }
}