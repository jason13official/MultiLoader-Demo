package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
      BuiltInRegistries.BLOCK, Constants.MOD_ID);

  public static final DeferredHolder<Block, Block> block = BLOCKS.register("my_cool_block",
      () -> new MyCoolBlock(BlockBehaviour.Properties.of()));

  public static void register(IEventBus bus) {
    BLOCKS.register(bus);
  }
}
