package io.github.jason13official.my_cool_mod.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.jason13official.my_cool_mod.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Constants.MOD_ID,
      Registries.ITEM);
  public static final Registrar<Item> ITEM_REGISTRAR = ITEMS.getRegistrar();

  public static final RegistrySupplier<Item> MY_COOL_BLOCK = ITEM_REGISTRAR.register(
      ModBlocks.MY_COOL_BLOCK.getId(),
      () -> new BlockItem(ModBlocks.MY_COOL_BLOCK.get(), new Item.Properties()));

  public static void register() {
  }

}
