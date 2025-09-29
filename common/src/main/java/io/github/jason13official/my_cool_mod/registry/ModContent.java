package io.github.jason13official.my_cool_mod.registry;

import io.github.jason13official.my_cool_mod.Constants;
import io.github.jason13official.my_cool_mod.block.MyCoolBlock;
import net.darkhax.bookshelf.common.api.registry.IContentProvider;
import net.darkhax.bookshelf.common.api.registry.register.Register;
import net.darkhax.bookshelf.common.api.registry.register.RegisterItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModContent implements IContentProvider {

  public static final Block MY_COOL_BLOCK = new MyCoolBlock(BlockBehaviour.Properties.of());

  @Override
  public String contentNamespace() {
    return Constants.MOD_ID;
  }

  @Override
  public void registerBlocks(Register<Block> registry) {

    registry.add("my_cool_block", MY_COOL_BLOCK);
  }

  @Override
  public void registerItems(RegisterItem registry) {
    registry.addBlock(MY_COOL_BLOCK);
  }
}
