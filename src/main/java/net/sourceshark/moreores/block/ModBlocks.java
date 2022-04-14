package net.sourceshark.moreores.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.sourceshark.moreores.MoreOres;
import net.minecraft.util.registry.Registry;
import net.sourceshark.moreores.item.ModItemGroup;
import net.sourceshark.moreores.item.ModItems;

public class ModBlocks {

    public static final Block  ENDER_FRAGMENT_ORE = registerBlock("ender_fragment_ore",
        new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), (ModItemGroup.MOREORES));


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoreOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MoreOres.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MoreOres.LOGGER.info("Registering ModBlocks for" + MoreOres.MOD_ID);
    }

}
