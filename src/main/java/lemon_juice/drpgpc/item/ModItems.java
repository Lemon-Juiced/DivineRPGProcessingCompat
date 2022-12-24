package lemon_juice.drpgpc.item;

import lemon_juice.drpgpc.DivineRPGProcessingCompat;
import lemon_juice.drpgpc.creativetab.ModCreativeModeTab;
import lemon_juice.drpgpc.item.custom.TorriditeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DivineRPGProcessingCompat.MOD_ID);

    /* Custom Clumps (Mekanism) */
    public static final RegistryObject<Item> CLUMP_ARLEMITE = ITEMS.register("clump_arlemite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> CLUMP_REALMITE = ITEMS.register("clump_realmite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> CLUMP_RUPEE = ITEMS.register("clump_rupee", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> CLUMP_TORRIDITE = ITEMS.register("clump_torridite", () -> new TorriditeItem(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB), "clump"));

    /* Custom Chunks (Factorium) */
    public static final RegistryObject<Item> ARLEMITE_CHUNKS = ITEMS.register("arlemite_chunks", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> REALMITE_CHUNKS = ITEMS.register("realmite_chunks", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> RUPEE_CHUNKS = ITEMS.register("rupee_chunks", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> TORRIDITE_CHUNKS = ITEMS.register("torridite_chunks", () -> new TorriditeItem(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB), "chunks"));

    /* Custom Dirty Dusts (Mekanism) */
    public static final RegistryObject<Item> DIRTY_DUST_ARLEMITE = ITEMS.register("dirty_dust_arlemite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> DIRTY_DUST_REALMITE = ITEMS.register("dirty_dust_realmite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> DIRTY_DUST_RUPEE = ITEMS.register("dirty_dust_rupee", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> DIRTY_DUST_TORRIDITE = ITEMS.register("dirty_dust_torridite", () -> new TorriditeItem(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB), "dirty_dust"));

    /* Custom Dusts (Factorium, Mekanism, Plain Grinder, Thermal) */
    public static final RegistryObject<Item> ARLEMITE_DUST = ITEMS.register("arlemite_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> REALMITE_DUST = ITEMS.register("realmite_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> RUPEE_DUST = ITEMS.register("rupee_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> TORRIDITE_DUST = ITEMS.register("torridite_dust", () -> new TorriditeItem(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB), "dust"));

    /* Custom Powders (Factorium) */
    public static final RegistryObject<Item> ARLEMITE_POWDER = ITEMS.register("arlemite_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> REALMITE_POWDER = ITEMS.register("realmite_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> RUPEE_POWDER = ITEMS.register("rupee_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> TORRIDITE_POWDER = ITEMS.register("torridite_powder", () -> new TorriditeItem(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB), "powder"));

    /* Custom Shards (Mekanism) */
    public static final RegistryObject<Item> SHARD_ARLEMITE = ITEMS.register("shard_arlemite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> SHARD_REALMITE = ITEMS.register("shard_realmite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> SHARD_RUPEE = ITEMS.register("shard_rupee", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB)));
    public static final RegistryObject<Item> SHARD_TORRIDITE = ITEMS.register("shard_torridite", () -> new TorriditeItem(new Item.Properties().tab(ModCreativeModeTab.DRPGPC_TAB), "shard"));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
