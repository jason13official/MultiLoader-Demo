package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ExampleMod implements ModInitializer {

  @Override
  public void onInitialize() {

    // This method is invoked by the Fabric mod loader when it is ready
    // to load your mod. You can access Fabric and Common code in this
    // project.

    // Use Fabric to bootstrap the Common mod.
    Constants.LOG.info("Hello Fabric world!");
    CommonClass.init();

    Block block = Registry.register(BuiltInRegistries.BLOCK,
        ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "my_cool_block"),
        new MyCoolBlock(BlockBehaviour.Properties.of()));

    Registry.register(BuiltInRegistries.ITEM, BuiltInRegistries.BLOCK.getKey(block),
        new BlockItem(block, new Item.Properties()));
  }
}
