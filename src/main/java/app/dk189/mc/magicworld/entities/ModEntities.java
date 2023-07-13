package app.dk189.mc.magicworld.entities;

import app.dk189.mc.magicworld.MagicWorld;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MagicWorld.MODID);

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
