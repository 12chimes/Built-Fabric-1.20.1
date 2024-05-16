package net.truly.built.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.truly.built.Built;

public class ModItems {

    public static final Item BUILT = registerItem("built", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Built.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Built.LOGGER.info("Registering Mod Items for " + Built.MOD_ID);

    }
}
