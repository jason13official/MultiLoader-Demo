package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM,
      Constants.MOD_ID);

    public static final DeferredHolder<Item, Item> item = ITEMS.register(ModBlocks.block.getId().getPath(),
        () -> new BlockItem(ModBlocks.block.get(), new Item.Properties()));

  public static void register(IEventBus bus) {
    ITEMS.register(bus);
  }
}
