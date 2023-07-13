package app.dk189.mc.magicworld.blocks;

import app.dk189.mc.magicworld.MagicWorld;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MagicWorld.MODID);



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
