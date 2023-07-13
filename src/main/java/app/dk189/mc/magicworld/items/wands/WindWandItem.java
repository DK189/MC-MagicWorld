package app.dk189.mc.magicworld.items.wands;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WindWandItem extends Item {
    public WindWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        level.playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.FIRECHARGE_USE, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        player.getCooldowns().addCooldown(this, 5);

        if (!level.isClientSide()) {
            double playerPos_X = player.getViewVector(1f).x,
            playerPos_Y = player.getViewVector(1f).y,
            playerPos_Z = player.getViewVector(1f).z;

            Projectile orb = new Arrow(level, player);

            orb.setPos(playerPos_X, playerPos_Y, playerPos_Z);
            orb.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(orb);
        }

        player.getItemInHand(interactionHand).hurtAndBreak(1, player, p -> p.broadcastBreakEvent(interactionHand));

        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
    }
}
