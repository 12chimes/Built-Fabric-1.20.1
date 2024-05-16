package net.truly.built.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.truly.built.Built;

public class ModBlocks {
    public static final Block OAK_COMPACT_PLANKS = registerBlock("oak_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_SHAKES = registerBlock("oak_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_SHAKES_STAIRS = registerBlock("oak_shakes_stairs",
            new StairsBlock(ModBlocks.OAK_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_SHAKES_SLAB = registerBlock("oak_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block SPRUCE_COMPACT_PLANKS = registerBlock("spruce_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block SPRUCE_SHAKES = registerBlock("spruce_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block SPRUCE_SHAKES_STAIRS = registerBlock("spruce_shakes_stairs",
            new StairsBlock(ModBlocks.SPRUCE_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
    public static final Block SPRUCE_SHAKES_SLAB = registerBlock("spruce_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));

    public static final Block BIRCH_COMPACT_PLANKS = registerBlock("birch_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block BIRCH_SHAKES = registerBlock("birch_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block BIRCH_SHAKES_STAIRS = registerBlock("birch_shakes_stairs",
            new StairsBlock(ModBlocks.BIRCH_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block BIRCH_SHAKES_SLAB = registerBlock("birch_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));

    public static final Block JUNGLE_COMPACT_PLANKS = registerBlock("jungle_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block JUNGLE_SHAKES = registerBlock("jungle_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block JUNGLE_SHAKES_STAIRS = registerBlock("jungle_shakes_stairs",
            new StairsBlock(ModBlocks.JUNGLE_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));
    public static final Block JUNGLE_SHAKES_SLAB = registerBlock("jungle_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));

    public static final Block ACACIA_COMPACT_PLANKS = registerBlock("acacia_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block ACACIA_SHAKES = registerBlock("acacia_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block ACACIA_SHAKES_STAIRS = registerBlock("acacia_shakes_stairs",
            new StairsBlock(ModBlocks.ACACIA_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));
    public static final Block ACACIA_SHAKES_SLAB = registerBlock("acacia_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));

    public static final Block DARK_OAK_COMPACT_PLANKS = registerBlock("dark_oak_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));
    public static final Block DARK_OAK_SHAKES = registerBlock("dark_oak_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));
    public static final Block DARK_OAK_SHAKES_STAIRS = registerBlock("dark_oak_shakes_stairs",
            new StairsBlock(ModBlocks.DARK_OAK_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));
    public static final Block DARK_OAK_SHAKES_SLAB = registerBlock("dark_oak_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));

    public static final Block MANGROVE_COMPACT_PLANKS = registerBlock("mangrove_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block MANGROVE_SHAKES = registerBlock("mangrove_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block MANGROVE_SHAKES_STAIRS = registerBlock("mangrove_shakes_stairs",
            new StairsBlock(ModBlocks.MANGROVE_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));
    public static final Block MANGROVE_SHAKES_SLAB = registerBlock("mangrove_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));

    public static final Block CHERRY_COMPACT_PLANKS = registerBlock("cherry_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_SHAKES = registerBlock("cherry_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_SHAKES_STAIRS = registerBlock("cherry_shakes_stairs",
            new StairsBlock(ModBlocks.CHERRY_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block CHERRY_SHAKES_SLAB = registerBlock("cherry_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));

    public static final Block BAMBOO_COMPACT_PLANKS = registerBlock("bamboo_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block BAMBOO_SHAKES = registerBlock("bamboo_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block BAMBOO_SHAKES_STAIRS = registerBlock("bamboo_shakes_stairs",
            new StairsBlock(ModBlocks.BAMBOO_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block BAMBOO_SHAKES_SLAB = registerBlock("bamboo_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

    public static final Block CRIMSON_COMPACT_PLANKS = registerBlock("crimson_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block CRIMSON_SHAKES = registerBlock("crimson_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block CRIMSON_SHAKES_STAIRS = registerBlock("crimson_shakes_stairs",
            new StairsBlock(ModBlocks.CRIMSON_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));
    public static final Block CRIMSON_SHAKES_SLAB = registerBlock("crimson_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));

    public static final Block WARPED_COMPACT_PLANKS = registerBlock("warped_compact_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block WARPED_SHAKES = registerBlock("warped_shakes",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block WARPED_SHAKES_STAIRS = registerBlock("warped_shakes_stairs",
            new StairsBlock(ModBlocks.WARPED_SHAKES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));
    public static final Block WARPED_SHAKES_SLAB = registerBlock("warped_shakes_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));

    public static final Block CHUNKY_BRICKS = registerBlock("chunky_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block CHUNKY_BRICK_STAIRS = registerBlock("chunky_brick_stairs",
            new StairsBlock(ModBlocks.CHUNKY_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block CHUNKY_BRICK_SLAB = registerBlock("chunky_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block CHUNKY_BRICK_WALL = registerBlock("chunky_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.BRICKS)));

    public static final Block TERRACOTTA_TRIM = registerBlock("terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_TRIM = registerBlock("white_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TRIM = registerBlock("light_gray_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_TRIM = registerBlock("gray_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_TRIM = registerBlock("black_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_TRIM = registerBlock("brown_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_TRIM = registerBlock("red_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_TRIM = registerBlock("orange_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_TRIM = registerBlock("yellow_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_TRIM = registerBlock("lime_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_TRIM = registerBlock("green_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TRIM = registerBlock("light_blue_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_TRIM = registerBlock("cyan_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_TRIM = registerBlock("blue_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_TRIM = registerBlock("purple_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_TRIM = registerBlock("pink_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_TRIM = registerBlock("magenta_terracotta_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_TERRACOTTA)));

    public static final Block CUT_COBBLESTONE = registerBlock("cut_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block CUT_COBBLESTONE_STAIRS = registerBlock("cut_cobblestone_stairs",
            new StairsBlock(ModBlocks.CUT_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block CUT_COBBLESTONE_SLAB = registerBlock("cut_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block CUT_COBBLESTONE_WALL = registerBlock("cut_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block CUT_MOSSY_COBBLESTONE = registerBlock("cut_mossy_cobblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)));
    public static final Block CUT_MOSSY_COBBLESTONE_STAIRS = registerBlock("cut_mossy_cobblestone_stairs",
            new StairsBlock(ModBlocks.CUT_MOSSY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)));
    public static final Block CUT_MOSSY_COBBLESTONE_SLAB = registerBlock("cut_mossy_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)));
    public static final Block CUT_MOSSY_COBBLESTONE_WALL = registerBlock("cut_mossy_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)));

    public static final Block CARVED_STONE = registerBlock("carved_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block CARVED_GRANITE = registerBlock("carved_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
    public static final Block CARVED_DIORITE = registerBlock("carved_diorite",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    public static final Block CARVED_ANDESITE = registerBlock("carved_andesite",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));

    public static final Block SUGARCRETE_BRICKS = registerBlock("sugarcrete_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block SUGARCRETE_BRICK_STAIRS = registerBlock("sugarcrete_brick_stairs",
            new StairsBlock(ModBlocks.SUGARCRETE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block SUGARCRETE_BRICK_SLAB = registerBlock("sugarcrete_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.MUD_BRICKS)));

    public static final Block FRESH_BAMBOO_BLOCK = registerBlock("fresh_bamboo_block",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK)));

    public static final Block CUT_FRESH_BAMBOO_BLOCK = registerBlock("cut_fresh_bamboo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CUT_FRESH_BAMBOO_STAIRS = registerBlock("cut_fresh_bamboo_stairs",
            new StairsBlock(ModBlocks.CUT_FRESH_BAMBOO_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CUT_FRESH_BAMBOO_SLAB = registerBlock("cut_fresh_bamboo_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

    public static final Block CUT_BAMBOO_BLOCK = registerBlock("cut_bamboo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CUT_BAMBOO_STAIRS = registerBlock("cut_bamboo_stairs",
            new StairsBlock(ModBlocks.CUT_BAMBOO_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CUT_BAMBOO_SLAB = registerBlock("cut_bamboo_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

    public static final Block CUT_STRIPPED_BAMBOO_BLOCK = registerBlock("cut_stripped_bamboo_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CUT_STRIPPED_BAMBOO_STAIRS = registerBlock("cut_stripped_bamboo_stairs",
            new StairsBlock(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));
    public static final Block CUT_STRIPPED_BAMBOO_SLAB = registerBlock("cut_stripped_bamboo_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

    public static final Block MUD_POT = registerBlock("mud_pot",
            new MudPotBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).sounds(BlockSoundGroup.MUD_BRICKS).nonOpaque()));

    public static final Block POLISHED_PACKED_MUD = registerBlock("polished_packed_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).sounds(BlockSoundGroup.MUD_BRICKS)));

    public static final Block MUD_SHINGLES = registerBlock("mud_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_SHINGLES_STAIRS = registerBlock("mud_shingles_stairs",
            new StairsBlock(ModBlocks.MUD_SHINGLES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.PACKED_MUD).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_SHINGLES_SLAB = registerBlock("mud_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_SHINGLES_WALL = registerBlock("mud_shingles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).sounds(BlockSoundGroup.MUD_BRICKS)));

    public static final Block STONE_SHINGLES = registerBlock("stone_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_SHINGLES_STAIRS = registerBlock("stone_shingles_stairs",
            new StairsBlock(ModBlocks.STONE_SHINGLES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_SHINGLES_SLAB = registerBlock("stone_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block STONE_SHINGLES_WALL = registerBlock("stone_shingles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block MOSSY_STONE_SHINGLES = registerBlock("mossy_stone_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));
    public static final Block MOSSY_STONE_SHINGLES_STAIRS = registerBlock("mossy_stone_shingles_stairs",
            new StairsBlock(ModBlocks.MOSSY_STONE_SHINGLES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));
    public static final Block MOSSY_STONE_SHINGLES_SLAB = registerBlock("mossy_stone_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));
    public static final Block MOSSY_STONE_SHINGLES_WALL = registerBlock("mossy_stone_shingles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSSY_STONE_BRICKS)));

    public static final Block SANDSTONE_SHINGLES = registerBlock("sandstone_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block SANDSTONE_SHINGLES_STAIRS = registerBlock("sandstone_shingles_stairs",
            new StairsBlock(ModBlocks.SANDSTONE_SHINGLES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block SANDSTONE_SHINGLES_SLAB = registerBlock("sandstone_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));
    public static final Block SANDSTONE_SHINGLES_WALL = registerBlock("sandstone_shingles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)));

    public static final Block DEEPSLATE_SHINGLES = registerBlock("deepslate_shingles",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_SHINGLES_STAIRS = registerBlock("deepslate_shingles_stairs",
            new StairsBlock(ModBlocks.DEEPSLATE_SHINGLES.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_SHINGLES_SLAB = registerBlock("deepslate_shingles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block DEEPSLATE_SHINGLES_WALL = registerBlock("deepslate_shingles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));

    public static final Block IRON_GRATE = registerBlock("iron_grate",
            new MangroveRootsBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.METAL).nonOpaque()));

    public static final Block FRAMED_GLASS = registerBlock("framed_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));

    public static final Block FRAMED_GLASS_PANE = registerBlock("framed_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Built.MOD_ID, name), block);
    }


    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Built.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Built.LOGGER.info("Registering ModBlocks for "+Built.MOD_ID);
    }

}
