package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
      ForgeRegistries.BLOCKS, Constants.MOD_ID);

  public static final RegistryObject<Block> block = BLOCKS.register("my_cool_block",
      () -> new MyCoolBlock(BlockBehaviour.Properties.of()));

  public static void register(IEventBus bus) {
    BLOCKS.register(bus);
  }
}
