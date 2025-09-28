package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.registry.ModBlocks;
import io.github.jason13official.my_cool_mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ExampleMod implements ModInitializer {

  @Override
  public void onInitialize() {

    CommonClass.init();

    ModBlocks.register();
    ModItems.register();
  }
}
