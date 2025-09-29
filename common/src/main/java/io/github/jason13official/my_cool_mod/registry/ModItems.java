package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import java.util.function.BiConsumer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {

  public static final Item MY_COOL_BLOCK = new BlockItem(ModBlocks.MY_COOL_BLOCK,
      new Item.Properties());

  static {
    Constants.LOG.info("defined items!");
  }

  public static void register(BiConsumer<Item, ResourceLocation> consumer) {
    Constants.LOG.info("registering items!");
    consumer.accept(MY_COOL_BLOCK, BuiltInRegistries.BLOCK.getKey(ModBlocks.MY_COOL_BLOCK));
  }
}
