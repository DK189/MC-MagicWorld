package app.dk189.mc.magicworld.items;

import app.dk189.mc.magicworld.MagicWorld;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicWorld.MODID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> MAGIC_TAB = CREATIVE_MODE_TABS
            .register(
                "course_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Fire_Wand.get()))
                    .title(Component.translatable("creativetab.magic_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.Fire_Core.get());
                        output.accept(ModItems.Ice_Core.get());
                        output.accept(ModItems.Lightning_Core.get());
                        output.accept(ModItems.Wind_Core.get());

                        output.accept(ModItems.Fire_Wand.get());
                        output.accept(ModItems.Ice_Wand.get());
                        output.accept(ModItems.Lightning_Wand.get());
                        output.accept(ModItems.Wind_Wand.get());
                    })
                    .build()
            );
}
