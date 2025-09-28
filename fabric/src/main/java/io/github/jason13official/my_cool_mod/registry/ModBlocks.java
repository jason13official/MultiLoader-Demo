package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

  public static final Block block = Registry.register(
      BuiltInRegistries.BLOCK,
      ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "my_cool_block"),
      new MyCoolBlock(BlockBehaviour.Properties.of()));

  public static void register() {
  }
}
