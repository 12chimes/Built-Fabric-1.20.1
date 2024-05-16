package net.truly.built;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.truly.built.block.ModBlocks;
import net.truly.built.entity.ModBlockEntities;
import net.truly.built.item.ModItemGroups;
import net.truly.built.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Built implements ModInitializer {
	public static final String MOD_ID = "built";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();

		FuelRegistry.INSTANCE.add(ModBlocks.OAK_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.OAK_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.OAK_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.OAK_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.SPRUCE_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.SPRUCE_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.SPRUCE_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.SPRUCE_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SPRUCE_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.BIRCH_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BIRCH_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BIRCH_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BIRCH_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BIRCH_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.JUNGLE_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.JUNGLE_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.JUNGLE_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.JUNGLE_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JUNGLE_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.ACACIA_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.ACACIA_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.ACACIA_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.ACACIA_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.DARK_OAK_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.DARK_OAK_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.DARK_OAK_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.DARK_OAK_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_OAK_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.MANGROVE_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.MANGROVE_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.MANGROVE_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.MANGROVE_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MANGROVE_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.CHERRY_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CHERRY_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CHERRY_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CHERRY_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHERRY_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_COMPACT_PLANKS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_SHAKES, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_SHAKES_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.BAMBOO_SHAKES_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_COMPACT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_SHAKES, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_SHAKES_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BAMBOO_SHAKES_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.FRESH_BAMBOO_BLOCK, 300);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FRESH_BAMBOO_BLOCK, 5, 5);

		FuelRegistry.INSTANCE.add(ModBlocks.CUT_FRESH_BAMBOO_BLOCK, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CUT_FRESH_BAMBOO_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CUT_FRESH_BAMBOO_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_FRESH_BAMBOO_BLOCK, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_FRESH_BAMBOO_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_FRESH_BAMBOO_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.CUT_BAMBOO_BLOCK, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CUT_BAMBOO_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CUT_BAMBOO_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_BAMBOO_BLOCK, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_BAMBOO_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_BAMBOO_SLAB, 5, 20);

		FuelRegistry.INSTANCE.add(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS, 300);
		FuelRegistry.INSTANCE.add(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB, 150);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB, 5, 20);
	}
}