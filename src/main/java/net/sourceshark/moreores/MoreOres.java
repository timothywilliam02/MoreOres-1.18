package net.sourceshark.moreores;

import net.fabricmc.api.ModInitializer;
import net.sourceshark.moreores.block.ModBlocks;
import net.sourceshark.moreores.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreOres implements ModInitializer {
    public static final String MOD_ID = "moreores";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

    }
}
