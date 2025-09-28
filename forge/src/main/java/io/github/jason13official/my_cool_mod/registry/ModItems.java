package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
      Constants.MOD_ID);

    public static final RegistryObject<Item> item = ITEMS.register(ModBlocks.block.getId().getPath(),
        () -> new BlockItem(ModBlocks.block.get(), new Item.Properties()));

  public static void register(IEventBus bus) {
    ITEMS.register(bus);
  }
}
