package net.sourceshark.moreores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.sourceshark.moreores.MoreOres;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Ender Fragment
    public static final Item ENDER_FRAGMENT = registerItem("ender_fragment",
        new Item(new FabricItemSettings().group(ModItemGroup.MOREORES)));

    // Diamond Dust
    public static final Item DIAMOND_DUST = registerItem("diamond_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.MOREORES)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreOres.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreOres.LOGGER.info("Registering Mod Items for" + MoreOres.MOD_ID);
    }

}
