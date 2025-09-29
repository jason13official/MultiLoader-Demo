package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import io.github.jason13official.my_cool_mod.registration.RegistrationProvider;
import io.github.jason13official.my_cool_mod.registration.RegistryObject;
import java.util.function.BiConsumer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

  public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registries.BLOCK, Constants.MOD_ID);

  public static final RegistryObject<Block, MyCoolBlock> MY_COOL_BLOCK = BLOCKS.register("my_cool_block", () -> new MyCoolBlock(BlockBehaviour.Properties.of()));

  static {
    Constants.LOG.info("defined blocks!");
  }

  public static void register() {
    Constants.LOG.info("registering blocks!");
  }
}
