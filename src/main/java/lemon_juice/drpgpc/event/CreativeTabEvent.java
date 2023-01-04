package lemon_juice.drpgpc.event;

import lemon_juice.drpgpc.DivineRPGProcessingCompat;
import lemon_juice.drpgpc.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CreativeTabEvent {
    public static CreativeModeTab DRPGPC_COMMON_TAB;
    public static CreativeModeTab DRPGPC_FACTORIUM_TAB;
    public static CreativeModeTab DRPGPC_MEKANISM_TAB;

    @SubscribeEvent
    public static void onCreativeModeTabRegister(CreativeModeTabEvent.Register event){

        // Common Tab (Items Used In More Than One Mod)
        DRPGPC_COMMON_TAB = event.registerCreativeModeTab(new ResourceLocation(DivineRPGProcessingCompat.MOD_ID, "drpgpc_common"), builder -> {
            builder.icon(() -> new ItemStack(ModItems.REALMITE_DUST.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModItems.ARLEMITE_DUST.get()));
                        output.accept(new ItemStack(ModItems.REALMITE_DUST.get()));
                        output.accept(new ItemStack(ModItems.RUPEE_DUST.get()));
                        output.accept(new ItemStack(ModItems.TORRIDITE_DUST.get()));
                    })
                    .title(Component.translatable("itemGroup.drpgpc_common"))
                    .build();
        });

        // Factorium Tab (Items Used Exclusively In Factorium)
        DRPGPC_FACTORIUM_TAB = event.registerCreativeModeTab(new ResourceLocation(DivineRPGProcessingCompat.MOD_ID, "drpgpc_factorium"), builder -> {
            builder.icon(() -> new ItemStack(ModItems.REALMITE_POWDER.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModItems.ARLEMITE_POWDER.get()));
                        output.accept(new ItemStack(ModItems.REALMITE_POWDER.get()));
                        output.accept(new ItemStack(ModItems.RUPEE_POWDER.get()));
                        output.accept(new ItemStack(ModItems.TORRIDITE_POWDER.get()));

                        output.accept(new ItemStack(ModItems.ARLEMITE_CHUNKS.get()));
                        output.accept(new ItemStack(ModItems.REALMITE_CHUNKS.get()));
                        output.accept(new ItemStack(ModItems.RUPEE_CHUNKS.get()));
                        output.accept(new ItemStack(ModItems.TORRIDITE_CHUNKS.get()));
                    })
                    .title(Component.translatable("itemGroup.drpgpc_factorium"))
                    .build();
        });

        // Mekanism Tab (Items Used Exclusively In Mekanism)
        DRPGPC_MEKANISM_TAB = event.registerCreativeModeTab(new ResourceLocation(DivineRPGProcessingCompat.MOD_ID, "drpgpc_mekanism"), builder -> {
            builder.icon(() -> new ItemStack(ModItems.DIRTY_DUST_REALMITE.get()))
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
                    })
                    .title(Component.translatable("itemGroup.drpgpc_mekanism"))
                    .build();
        });

    }
}
