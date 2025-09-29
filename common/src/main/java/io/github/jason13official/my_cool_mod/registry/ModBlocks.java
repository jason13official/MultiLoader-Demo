package io.github.jason13official.my_cool_mod.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.jason13official.my_cool_mod.Constants;
import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Constants.MOD_ID,
      Registries.BLOCK);
  public static final Registrar<Block> BLOCK_REGISTRAR = BLOCKS.getRegistrar();

  public static final RegistrySupplier<Block> MY_COOL_BLOCK = BLOCK_REGISTRAR.register(
      ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "my_cool_block"), () -> new MyCoolBlock(
          BlockBehaviour.Properties.of()));

  public static void register() {}

}
