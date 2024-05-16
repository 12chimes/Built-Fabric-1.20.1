package net.truly.built.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.truly.built.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.BAMBOO_BLOCKS)
                .add(ModBlocks.FRESH_BAMBOO_BLOCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CHUNKY_BRICK_WALL)
                .add(ModBlocks.CUT_COBBLESTONE_WALL)
                .add(ModBlocks.CUT_MOSSY_COBBLESTONE_WALL)
                .add(ModBlocks.MUD_SHINGLES_WALL)
                .add(ModBlocks.STONE_SHINGLES_WALL)
                .add(ModBlocks.MOSSY_STONE_SHINGLES_WALL)
                .add(ModBlocks.SANDSTONE_SHINGLES_WALL)
                .add(ModBlocks.DEEPSLATE_SHINGLES_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHUNKY_BRICKS)
                .add(ModBlocks.CHUNKY_BRICK_STAIRS)
                .add(ModBlocks.CHUNKY_BRICK_SLAB)
                .add(ModBlocks.TERRACOTTA_TRIM)
                .add(ModBlocks.WHITE_TERRACOTTA_TRIM)
                .add(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM)
                .add(ModBlocks.GRAY_TERRACOTTA_TRIM)
                .add(ModBlocks.BLACK_TERRACOTTA_TRIM)
                .add(ModBlocks.BROWN_TERRACOTTA_TRIM)
                .add(ModBlocks.RED_TERRACOTTA_TRIM)
                .add(ModBlocks.ORANGE_TERRACOTTA_TRIM)
                .add(ModBlocks.YELLOW_TERRACOTTA_TRIM)
                .add(ModBlocks.LIME_TERRACOTTA_TRIM)
                .add(ModBlocks.GREEN_TERRACOTTA_TRIM)
                .add(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM)
                .add(ModBlocks.CYAN_TERRACOTTA_TRIM)
                .add(ModBlocks.BLUE_TERRACOTTA_TRIM)
                .add(ModBlocks.PURPLE_TERRACOTTA_TRIM)
                .add(ModBlocks.PINK_TERRACOTTA_TRIM)
                .add(ModBlocks.MAGENTA_TERRACOTTA_TRIM)
                .add(ModBlocks.CUT_COBBLESTONE)
                .add(ModBlocks.CUT_COBBLESTONE_STAIRS)
                .add(ModBlocks.CUT_COBBLESTONE_SLAB)
                .add(ModBlocks.CUT_MOSSY_COBBLESTONE)
                .add(ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS)
                .add(ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB)
                .add(ModBlocks.CARVED_STONE)
                .add(ModBlocks.CARVED_GRANITE)
                .add(ModBlocks.CARVED_DIORITE)
                .add(ModBlocks.CARVED_ANDESITE)
                .add(ModBlocks.SUGARCRETE_BRICKS)
                .add(ModBlocks.SUGARCRETE_BRICK_STAIRS)
                .add(ModBlocks.SUGARCRETE_BRICK_SLAB)
                .add(ModBlocks.MUD_POT)
                .add(ModBlocks.POLISHED_PACKED_MUD)
                .add(ModBlocks.MUD_SHINGLES)
                .add(ModBlocks.MUD_SHINGLES_STAIRS)
                .add(ModBlocks.MUD_SHINGLES_SLAB)
                .add(ModBlocks.STONE_SHINGLES)
                .add(ModBlocks.STONE_SHINGLES_STAIRS)
                .add(ModBlocks.STONE_SHINGLES_SLAB)
                .add(ModBlocks.MOSSY_STONE_SHINGLES)
                .add(ModBlocks.MOSSY_STONE_SHINGLES_STAIRS)
                .add(ModBlocks.MOSSY_STONE_SHINGLES_SLAB)
                .add(ModBlocks.SANDSTONE_SHINGLES)
                .add(ModBlocks.SANDSTONE_SHINGLES_STAIRS)
                .add(ModBlocks.SANDSTONE_SHINGLES_SLAB)
                .add(ModBlocks.DEEPSLATE_SHINGLES)
                .add(ModBlocks.DEEPSLATE_SHINGLES_STAIRS)
                .add(ModBlocks.DEEPSLATE_SHINGLES_SLAB)
                .add(ModBlocks.IRON_GRATE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_COMPACT_PLANKS)
                .add(ModBlocks.OAK_SHAKES)
                .add(ModBlocks.SPRUCE_COMPACT_PLANKS)
                .add(ModBlocks.SPRUCE_SHAKES)
                .add(ModBlocks.BIRCH_COMPACT_PLANKS)
                .add(ModBlocks.BIRCH_SHAKES)
                .add(ModBlocks.JUNGLE_COMPACT_PLANKS)
                .add(ModBlocks.JUNGLE_SHAKES)
                .add(ModBlocks.ACACIA_COMPACT_PLANKS)
                .add(ModBlocks.ACACIA_SHAKES)
                .add(ModBlocks.DARK_OAK_COMPACT_PLANKS)
                .add(ModBlocks.DARK_OAK_SHAKES)
                .add(ModBlocks.MANGROVE_COMPACT_PLANKS)
                .add(ModBlocks.MANGROVE_SHAKES)
                .add(ModBlocks.CHERRY_COMPACT_PLANKS)
                .add(ModBlocks.CHERRY_SHAKES)
                .add(ModBlocks.BAMBOO_COMPACT_PLANKS)
                .add(ModBlocks.BAMBOO_SHAKES)
                .add(ModBlocks.CRIMSON_COMPACT_PLANKS)
                .add(ModBlocks.CRIMSON_SHAKES)
                .add(ModBlocks.WARPED_COMPACT_PLANKS)
                .add(ModBlocks.WARPED_SHAKES)
                .add(ModBlocks.CUT_FRESH_BAMBOO_BLOCK)
                .add(ModBlocks.CUT_BAMBOO_BLOCK)
                .add(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.OAK_SHAKES_STAIRS)
                .add(ModBlocks.SPRUCE_SHAKES_STAIRS)
                .add(ModBlocks.BIRCH_SHAKES_STAIRS)
                .add(ModBlocks.JUNGLE_SHAKES_STAIRS)
                .add(ModBlocks.ACACIA_SHAKES_STAIRS)
                .add(ModBlocks.DARK_OAK_SHAKES_STAIRS)
                .add(ModBlocks.MANGROVE_SHAKES_STAIRS)
                .add(ModBlocks.CHERRY_SHAKES_STAIRS)
                .add(ModBlocks.BAMBOO_SHAKES_STAIRS)
                .add(ModBlocks.CRIMSON_SHAKES_STAIRS)
                .add(ModBlocks.WARPED_SHAKES_STAIRS)
                .add(ModBlocks.CUT_FRESH_BAMBOO_STAIRS)
                .add(ModBlocks.CUT_BAMBOO_STAIRS)
                .add(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.OAK_SHAKES_SLAB)
                .add(ModBlocks.SPRUCE_SHAKES_SLAB)
                .add(ModBlocks.BIRCH_SHAKES_SLAB)
                .add(ModBlocks.JUNGLE_SHAKES_SLAB)
                .add(ModBlocks.ACACIA_SHAKES_SLAB)
                .add(ModBlocks.DARK_OAK_SHAKES_SLAB)
                .add(ModBlocks.MANGROVE_SHAKES_SLAB)
                .add(ModBlocks.CHERRY_SHAKES_SLAB)
                .add(ModBlocks.BAMBOO_SHAKES_SLAB)
                .add(ModBlocks.CRIMSON_SHAKES_SLAB)
                .add(ModBlocks.WARPED_SHAKES_SLAB)
                .add(ModBlocks.CUT_FRESH_BAMBOO_SLAB)
                .add(ModBlocks.CUT_BAMBOO_SLAB)
                .add(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB);





    }
}
