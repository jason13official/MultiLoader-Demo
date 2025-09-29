package io.github.jason13official.neoforge;

import io.github.jason13official.my_cool_mod.Constants;
import net.neoforged.fml.common.Mod;

import io.github.jason13official.ExampleMod;

@Mod(Constants.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
