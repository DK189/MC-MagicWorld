package app.dk189.mc.magicworld.items;

import app.dk189.mc.magicworld.MagicWorld;
import app.dk189.mc.magicworld.items.cores.FireCoreItem;
import app.dk189.mc.magicworld.items.cores.IceCoreItem;
import app.dk189.mc.magicworld.items.cores.LightningCoreItem;
import app.dk189.mc.magicworld.items.cores.WindCoreItem;
import app.dk189.mc.magicworld.items.wands.FireWandItem;
import app.dk189.mc.magicworld.items.wands.IceWandItem;
import app.dk189.mc.magicworld.items.wands.LightningWandItem;
import app.dk189.mc.magicworld.items.wands.WindWandItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicWorld.MODID);

    public static final RegistryObject<Item> Fire_Core = ITEMS.register("fire_core",
            () -> new FireCoreItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> Ice_Core = ITEMS.register("ice_core",
            () -> new IceCoreItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> Lightning_Core = ITEMS.register("lightning_core",
            () -> new LightningCoreItem(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> Wind_Core = ITEMS.register("wind_core",
            () -> new WindCoreItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> Fire_Wand = ITEMS.register("fire_wand",
            () -> new FireWandItem(new Item.Properties().durability(512)));
    public static final RegistryObject<Item> Ice_Wand = ITEMS.register("ice_wand",
            () -> new IceWandItem(new Item.Properties().durability(512)));
    public static final RegistryObject<Item> Lightning_Wand = ITEMS.register("lightning_wand",
            () -> new LightningWandItem(new Item.Properties().durability(512)));
    public static final RegistryObject<Item> Wind_Wand = ITEMS.register("wind_wand",
            () -> new WindWandItem(new Item.Properties().durability(512)));

    public static void registerModItems() {
        System.out.println("Registering Mod ModItems for " + MagicWorld.MODID);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
