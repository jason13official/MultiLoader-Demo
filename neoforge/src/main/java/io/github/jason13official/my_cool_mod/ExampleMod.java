package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class ExampleMod {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
      BuiltInRegistries.BLOCK, Constants.MOD_ID);
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM,
      Constants.MOD_ID);

  public ExampleMod(IEventBus eventBus) {

    DeferredHolder<Block, MyCoolBlock> block = BLOCKS.register("my_cool_block",
        () -> new MyCoolBlock(BlockBehaviour.Properties.of()));
    ITEMS.register(block.getId().getPath(),
        () -> new BlockItem(block.get(), new Item.Properties()));

    BLOCKS.register(eventBus);
    ITEMS.register(eventBus);

    // This method is invoked by the NeoForge mod loader when it is ready
    // to load your mod. You can access NeoForge and Common code in this
    // project.

    // Use NeoForge to bootstrap the Common mod.
    Constants.LOG.info("Hello NeoForge world!");
    CommonClass.init();

  }
}