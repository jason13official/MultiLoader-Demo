package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.registry.ModBlocks;
import io.github.jason13official.my_cool_mod.registry.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ExampleMod {

  public ExampleMod(IEventBus eventBus) {

    CommonClass.init();

    ModBlocks.register(eventBus);
    ModItems.register(eventBus);
  }
}