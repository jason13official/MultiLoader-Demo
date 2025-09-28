package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.registry.ModBlocks;
import io.github.jason13official.my_cool_mod.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class ExampleMod {

  public ExampleMod(FMLJavaModLoadingContext context) {

    CommonClass.init();

    ModBlocks.register(context.getModEventBus());
    ModItems.register(context.getModEventBus());
  }
}