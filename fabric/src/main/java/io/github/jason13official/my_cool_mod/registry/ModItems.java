package io.github.jason13official.my_cool_mod.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {

  public static final Item item = Registry.register(
      BuiltInRegistries.ITEM,
      BuiltInRegistries.BLOCK.getKey(ModBlocks.block),
      new BlockItem(ModBlocks.block, new Item.Properties()));

  public static void register() {
  }
}
