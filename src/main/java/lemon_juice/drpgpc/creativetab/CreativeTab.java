package lemon_juice.drpgpc.creativetab;

import lemon_juice.drpgpc.DivineRPGProcessingCompat;
import lemon_juice.drpgpc.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {
    public static ResourceLocation DRPGPC_COMMON = new ResourceLocation(DivineRPGProcessingCompat.MOD_ID, "drpgpc_common");
    public static ResourceLocation DRPGPC_FACTORIUM = new ResourceLocation(DivineRPGProcessingCompat.MOD_ID, "drpgpc_factorium");
    public static ResourceLocation DRPGPC_MEKANISM = new ResourceLocation(DivineRPGProcessingCompat.MOD_ID, "drpgpc_mekanism");

    public static void registerTabs(CreativeModeTabEvent.Register event){
        // Common Tab (Items Used In More Than One Mod)
        event.registerCreativeModeTab(DRPGPC_COMMON, builder -> builder
                .title(Component.translatable("itemGroup.drpgpc_common"))
                .icon(() -> new ItemStack(ModItems.ARLEMITE_DUST.get()))
                .displayItems((features, output, hasPermissions) -> {
                    output.accept(new ItemStack(ModItems.ARLEMITE_DUST.get()));
                    output.accept(new ItemStack(ModItems.REALMITE_DUST.get()));
                    output.accept(new ItemStack(ModItems.RUPEE_DUST.get()));
                    output.accept(new ItemStack(ModItems.TORRIDITE_DUST.get()));
                }));

        // Factorium Tab (Items Used Exclusively In Factorium)
        event.registerCreativeModeTab(DRPGPC_FACTORIUM, builder -> builder
                .title(Component.translatable("itemGroup.drpgpc_factorium"))
                .icon(() -> new ItemStack(ModItems.ARLEMITE_POWDER.get()))
                .displayItems((features, output, hasPermissions) -> {
                    output.accept(new ItemStack(ModItems.ARLEMITE_POWDER.get()));
                    output.accept(new ItemStack(ModItems.REALMITE_POWDER.get()));
                    output.accept(new ItemStack(ModItems.RUPEE_POWDER.get()));
                    output.accept(new ItemStack(ModItems.TORRIDITE_POWDER.get()));

                    output.accept(new ItemStack(ModItems.ARLEMITE_CHUNKS.get()));
                    output.accept(new ItemStack(ModItems.REALMITE_CHUNKS.get()));
                    output.accept(new ItemStack(ModItems.RUPEE_CHUNKS.get()));
                    output.accept(new ItemStack(ModItems.TORRIDITE_CHUNKS.get()));
                }));

        // Mekanism Tab (Items Used Exclusively In Mekanism)
        event.registerCreativeModeTab(DRPGPC_MEKANISM, builder -> builder
                .title(Component.translatable("itemGroup.drpgpc_mekanism"))
                .icon(() -> new ItemStack(ModItems.DIRTY_DUST_ARLEMITE.get()))
                .displayItems((features, output, hasPermissions) -> {
                    output.accept(new ItemStack(ModItems.DIRTY_DUST_ARLEMITE.get()));
                    output.accept(new ItemStack(ModItems.DIRTY_DUST_REALMITE.get()));
                    output.accept(new ItemStack(ModItems.DIRTY_DUST_RUPEE.get()));
                    output.accept(new ItemStack(ModItems.DIRTY_DUST_TORRIDITE.get()));

                    output.accept(new ItemStack(ModItems.CLUMP_ARLEMITE.get()));
                    output.accept(new ItemStack(ModItems.CLUMP_REALMITE.get()));
                    output.accept(new ItemStack(ModItems.CLUMP_RUPEE.get()));
                    output.accept(new ItemStack(ModItems.CLUMP_TORRIDITE.get()));

                    output.accept(new ItemStack(ModItems.SHARD_ARLEMITE.get()));
                    output.accept(new ItemStack(ModItems.SHARD_REALMITE.get()));
                    output.accept(new ItemStack(ModItems.SHARD_RUPEE.get()));
                    output.accept(new ItemStack(ModItems.SHARD_TORRIDITE.get()));
                }));
    }
}
