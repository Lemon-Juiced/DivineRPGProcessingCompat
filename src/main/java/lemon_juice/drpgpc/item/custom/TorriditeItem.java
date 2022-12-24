package lemon_juice.drpgpc.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class TorriditeItem extends Item {
    private final String identifier;
    public TorriditeItem(Properties properties, String name) {
        super(properties);
        this.identifier = name;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Objects.equals(identifier, "chunks")) components.add(Component.translatable("torridite_chunks.tooltip"));
        if(Objects.equals(identifier, "clump")) components.add(Component.translatable("torridite_clump.tooltip"));
        if(Objects.equals(identifier, "dirty_dust")) components.add(Component.translatable("torridite_dirty_dust.tooltip"));
        if(Objects.equals(identifier, "dust")) components.add(Component.translatable("torridite_dust.tooltip"));
        if(Objects.equals(identifier, "powder")) components.add(Component.translatable("torridite_powder.tooltip"));
        if(Objects.equals(identifier, "shard")) components.add(Component.translatable("torridite_shard.tooltip"));

        super.appendHoverText(stack, level, components, flag);
    }
}
