package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import io.github.jason13official.my_cool_mod.registration.RegistrationProvider;
import io.github.jason13official.my_cool_mod.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {

  public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registries.ITEM,
      Constants.MOD_ID);

  public static final RegistryObject<Item, BlockItem> MY_COOL_BLOCK = ITEMS.register(
      ModBlocks.MY_COOL_BLOCK.getId().getPath(),
      () -> new BlockItem(ModBlocks.MY_COOL_BLOCK.get(), new Item.Properties()));

  static {
    Constants.LOG.info("defined items!");
  }

  public static void register() {
    Constants.LOG.info("registering items!");
  }
}
