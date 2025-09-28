package io.github.jason13official.my_cool_mod;

import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Constants.MOD_ID)
public class ExampleMod {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
      ForgeRegistries.BLOCKS, Constants.MOD_ID);
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
      Constants.MOD_ID);
  public static IEventBus eventBus;

  public ExampleMod(FMLJavaModLoadingContext context) {

    eventBus = context.getModEventBus();

    RegistryObject<Block> block = BLOCKS.register("my_cool_block",
        () -> new MyCoolBlock(BlockBehaviour.Properties.of()));

    ITEMS.register(block.getId().getPath(),
        () -> new BlockItem(block.get(), new Item.Properties()));

    BLOCKS.register(eventBus);
    ITEMS.register(eventBus);

    // This method is invoked by the Forge mod loader when it is ready
    // to load your mod. You can access Forge and Common code in this
    // project.

    // Use Forge to bootstrap the Common mod.
    Constants.LOG.info("Hello Forge world!");
    CommonClass.init();

  }
}