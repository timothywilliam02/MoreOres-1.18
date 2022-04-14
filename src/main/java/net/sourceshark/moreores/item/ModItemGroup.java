package net.sourceshark.moreores.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.sourceshark.moreores.MoreOres;

public class ModItemGroup {
    public static final ItemGroup MOREORES = FabricItemGroupBuilder.build(new Identifier(MoreOres.MOD_ID, "more_ores"),
        () -> new ItemStack(ModItems.ENDER_FRAGMENT));
}
