package net.truly.built.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.truly.built.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OAK_COMPACT_PLANKS);
        addDrop(ModBlocks.OAK_SHAKES);
        addDrop(ModBlocks.OAK_SHAKES_STAIRS);
        addDrop(ModBlocks.OAK_SHAKES_SLAB, slabDrops(ModBlocks.OAK_SHAKES_SLAB));

        addDrop(ModBlocks.SPRUCE_COMPACT_PLANKS);
        addDrop(ModBlocks.SPRUCE_SHAKES);
        addDrop(ModBlocks.SPRUCE_SHAKES_STAIRS);
        addDrop(ModBlocks.SPRUCE_SHAKES_SLAB, slabDrops(ModBlocks.SPRUCE_SHAKES_SLAB));

        addDrop(ModBlocks.BIRCH_COMPACT_PLANKS);
        addDrop(ModBlocks.BIRCH_SHAKES);
        addDrop(ModBlocks.BIRCH_SHAKES_STAIRS);
        addDrop(ModBlocks.BIRCH_SHAKES_SLAB, slabDrops(ModBlocks.BIRCH_SHAKES_SLAB));

        addDrop(ModBlocks.JUNGLE_COMPACT_PLANKS);
        addDrop(ModBlocks.JUNGLE_SHAKES);
        addDrop(ModBlocks.JUNGLE_SHAKES_STAIRS);
        addDrop(ModBlocks.JUNGLE_SHAKES_SLAB, slabDrops(ModBlocks.JUNGLE_SHAKES_SLAB));

        addDrop(ModBlocks.ACACIA_COMPACT_PLANKS);
        addDrop(ModBlocks.ACACIA_SHAKES);
        addDrop(ModBlocks.ACACIA_SHAKES_STAIRS);
        addDrop(ModBlocks.ACACIA_SHAKES_SLAB, slabDrops(ModBlocks.ACACIA_SHAKES_SLAB));

        addDrop(ModBlocks.DARK_OAK_COMPACT_PLANKS);
        addDrop(ModBlocks.DARK_OAK_SHAKES);
        addDrop(ModBlocks.DARK_OAK_SHAKES_STAIRS);
        addDrop(ModBlocks.DARK_OAK_SHAKES_SLAB, slabDrops(ModBlocks.DARK_OAK_SHAKES_SLAB));

        addDrop(ModBlocks.MANGROVE_COMPACT_PLANKS);
        addDrop(ModBlocks.MANGROVE_SHAKES);
        addDrop(ModBlocks.MANGROVE_SHAKES_STAIRS);
        addDrop(ModBlocks.MANGROVE_SHAKES_SLAB, slabDrops(ModBlocks.MANGROVE_SHAKES_SLAB));

        addDrop(ModBlocks.CHERRY_COMPACT_PLANKS);
        addDrop(ModBlocks.CHERRY_SHAKES);
        addDrop(ModBlocks.CHERRY_SHAKES_STAIRS);
        addDrop(ModBlocks.CHERRY_SHAKES_SLAB, slabDrops(ModBlocks.CHERRY_SHAKES_SLAB));

        addDrop(ModBlocks.BAMBOO_COMPACT_PLANKS);
        addDrop(ModBlocks.BAMBOO_SHAKES);
        addDrop(ModBlocks.BAMBOO_SHAKES_STAIRS);
        addDrop(ModBlocks.BAMBOO_SHAKES_SLAB, slabDrops(ModBlocks.BAMBOO_SHAKES_SLAB));

        addDrop(ModBlocks.CRIMSON_COMPACT_PLANKS);
        addDrop(ModBlocks.CRIMSON_SHAKES);
        addDrop(ModBlocks.CRIMSON_SHAKES_STAIRS);
        addDrop(ModBlocks.CRIMSON_SHAKES_SLAB, slabDrops(ModBlocks.CRIMSON_SHAKES_SLAB));

        addDrop(ModBlocks.WARPED_COMPACT_PLANKS);
        addDrop(ModBlocks.WARPED_SHAKES);
        addDrop(ModBlocks.WARPED_SHAKES_STAIRS);
        addDrop(ModBlocks.WARPED_SHAKES_SLAB, slabDrops(ModBlocks.WARPED_SHAKES_SLAB));

        addDrop(ModBlocks.CHUNKY_BRICKS);
        addDrop(ModBlocks.CHUNKY_BRICK_STAIRS);
        addDrop(ModBlocks.CHUNKY_BRICK_SLAB, slabDrops(ModBlocks.CHUNKY_BRICK_SLAB));
        addDrop(ModBlocks.CHUNKY_BRICK_WALL);

        addDrop(ModBlocks.TERRACOTTA_TRIM);
        addDrop(ModBlocks.WHITE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM);
        addDrop(ModBlocks.GRAY_TERRACOTTA_TRIM);
        addDrop(ModBlocks.BLACK_TERRACOTTA_TRIM);
        addDrop(ModBlocks.BROWN_TERRACOTTA_TRIM);
        addDrop(ModBlocks.RED_TERRACOTTA_TRIM);
        addDrop(ModBlocks.ORANGE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.YELLOW_TERRACOTTA_TRIM);
        addDrop(ModBlocks.LIME_TERRACOTTA_TRIM);
        addDrop(ModBlocks.GREEN_TERRACOTTA_TRIM);
        addDrop(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.CYAN_TERRACOTTA_TRIM);
        addDrop(ModBlocks.BLUE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.PURPLE_TERRACOTTA_TRIM);
        addDrop(ModBlocks.PINK_TERRACOTTA_TRIM);
        addDrop(ModBlocks.MAGENTA_TERRACOTTA_TRIM);

        addDrop(ModBlocks.CUT_COBBLESTONE);
        addDrop(ModBlocks.CUT_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.CUT_COBBLESTONE_SLAB, slabDrops(ModBlocks.CUT_COBBLESTONE_SLAB));
        addDrop(ModBlocks.CUT_COBBLESTONE_WALL);

        addDrop(ModBlocks.CUT_MOSSY_COBBLESTONE);
        addDrop(ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS);
        addDrop(ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB, slabDrops(ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB));
        addDrop(ModBlocks.CUT_MOSSY_COBBLESTONE_WALL);

        addDrop(ModBlocks.CARVED_STONE);
        addDrop(ModBlocks.CARVED_GRANITE);
        addDrop(ModBlocks.CARVED_DIORITE);
        addDrop(ModBlocks.CARVED_ANDESITE);

        addDrop(ModBlocks.SUGARCRETE_BRICKS);
        addDrop(ModBlocks.SUGARCRETE_BRICK_STAIRS);
        addDrop(ModBlocks.SUGARCRETE_BRICK_SLAB, slabDrops(ModBlocks.SUGARCRETE_BRICK_SLAB));

        addDrop(ModBlocks.CUT_FRESH_BAMBOO_BLOCK);
        addDrop(ModBlocks.CUT_FRESH_BAMBOO_STAIRS);
        addDrop(ModBlocks.CUT_FRESH_BAMBOO_SLAB, slabDrops(ModBlocks.CUT_FRESH_BAMBOO_SLAB));

        addDrop(ModBlocks.CUT_BAMBOO_BLOCK);
        addDrop(ModBlocks.CUT_BAMBOO_STAIRS);
        addDrop(ModBlocks.CUT_BAMBOO_SLAB, slabDrops(ModBlocks.CUT_FRESH_BAMBOO_SLAB));

        addDrop(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK);
        addDrop(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS);
        addDrop(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB, slabDrops(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB));

        addDrop(ModBlocks.MUD_POT);
        addDrop(ModBlocks.POLISHED_PACKED_MUD);
        addDrop(ModBlocks.MUD_SHINGLES);
        addDrop(ModBlocks.MUD_SHINGLES_STAIRS);
        addDrop(ModBlocks.MUD_SHINGLES_SLAB, slabDrops(ModBlocks.MUD_SHINGLES_SLAB));
        addDrop(ModBlocks.MUD_SHINGLES_WALL);

        addDrop(ModBlocks.STONE_SHINGLES);
        addDrop(ModBlocks.STONE_SHINGLES_STAIRS);
        addDrop(ModBlocks.STONE_SHINGLES_SLAB, slabDrops(ModBlocks.STONE_SHINGLES_SLAB));
        addDrop(ModBlocks.STONE_SHINGLES_WALL);

        addDrop(ModBlocks.MOSSY_STONE_SHINGLES);
        addDrop(ModBlocks.MOSSY_STONE_SHINGLES_STAIRS);
        addDrop(ModBlocks.MOSSY_STONE_SHINGLES_SLAB, slabDrops(ModBlocks.MOSSY_STONE_SHINGLES_SLAB));
        addDrop(ModBlocks.MOSSY_STONE_SHINGLES_WALL);

        addDrop(ModBlocks.SANDSTONE_SHINGLES);
        addDrop(ModBlocks.SANDSTONE_SHINGLES_STAIRS);
        addDrop(ModBlocks.SANDSTONE_SHINGLES_SLAB, slabDrops(ModBlocks.SANDSTONE_SHINGLES_SLAB));
        addDrop(ModBlocks.SANDSTONE_SHINGLES_WALL);

        addDrop(ModBlocks.DEEPSLATE_SHINGLES);
        addDrop(ModBlocks.DEEPSLATE_SHINGLES_STAIRS);
        addDrop(ModBlocks.DEEPSLATE_SHINGLES_SLAB, slabDrops(ModBlocks.DEEPSLATE_SHINGLES_SLAB));
        addDrop(ModBlocks.DEEPSLATE_SHINGLES_WALL);

        addDrop(ModBlocks.IRON_GRATE);

        addDropWithSilkTouch(ModBlocks.FRAMED_GLASS);
        addDropWithSilkTouch(ModBlocks.FRAMED_GLASS_PANE);









        addDrop(ModBlocks.FRESH_BAMBOO_BLOCK);
    }
}