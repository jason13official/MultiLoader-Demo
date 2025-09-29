package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.registry.ModBlocks;
import io.github.jason13official.my_cool_mod.registry.ModItems;
import io.github.jason13official.my_cool_mod.registry.ModTabs;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class ExampleMod implements ModInitializer {

  @Override
  public void onInitialize() {

    CommonClass.init();

    Constants.LOG.info("Mod initialized in Fabric!");

    bind(BuiltInRegistries.BLOCK, ModBlocks::register);
    bind(BuiltInRegistries.ITEM, ModItems::register);
    bind(BuiltInRegistries.CREATIVE_MODE_TAB, ModTabs::register);

    Constants.LOG.info("Game objects registered!");
  }

  /** Adapted from <a href="https://github.com/VazkiiMods/Botania">Botania</a> */
  private static <T> void bind(
      Registry<T> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
    Constants.LOG.info("binding objects to {}", registry);
    source.accept((t, rl) -> Registry.register(registry, rl, t));
  }
}
