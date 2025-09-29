package io.github.jason13official;

import io.github.jason13official.my_cool_mod.registry.ModBlocks;
import io.github.jason13official.my_cool_mod.registry.ModItems;

public final class ExampleMod {

    public static void init() {
        // Write common init code here.

        ModBlocks.register();
        ModItems.register();
    }
}
