package net.truly.built.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.truly.built.block.ModBlocks;
import net.truly.built.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //WOOD BLOCKS

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OAK_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool oakPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OAK_SHAKES);
        oakPool.stairs(ModBlocks.OAK_SHAKES_STAIRS);
        oakPool.slab(ModBlocks.OAK_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRUCE_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool sprucePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SPRUCE_SHAKES);
        sprucePool.stairs(ModBlocks.SPRUCE_SHAKES_STAIRS);
        sprucePool.slab(ModBlocks.SPRUCE_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BIRCH_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool birchPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIRCH_SHAKES);
        birchPool.stairs(ModBlocks.BIRCH_SHAKES_STAIRS);
        birchPool.slab(ModBlocks.BIRCH_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JUNGLE_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool junglePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JUNGLE_SHAKES);
        junglePool.stairs(ModBlocks.JUNGLE_SHAKES_STAIRS);
        junglePool.slab(ModBlocks.JUNGLE_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ACACIA_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool acaciaPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACACIA_SHAKES);
        acaciaPool.stairs(ModBlocks.ACACIA_SHAKES_STAIRS);
        acaciaPool.slab(ModBlocks.ACACIA_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_OAK_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool darkOakPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_OAK_SHAKES);
        darkOakPool.stairs(ModBlocks.DARK_OAK_SHAKES_STAIRS);
        darkOakPool.slab(ModBlocks.DARK_OAK_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANGROVE_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool mangrovePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MANGROVE_SHAKES);
        mangrovePool.stairs(ModBlocks.MANGROVE_SHAKES_STAIRS);
        mangrovePool.slab(ModBlocks.MANGROVE_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHERRY_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool cherryPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_SHAKES);
        cherryPool.stairs(ModBlocks.CHERRY_SHAKES_STAIRS);
        cherryPool.slab(ModBlocks.CHERRY_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BAMBOO_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool bambooPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAMBOO_SHAKES);
        bambooPool.stairs(ModBlocks.BAMBOO_SHAKES_STAIRS);
        bambooPool.slab(ModBlocks.BAMBOO_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRIMSON_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool crimsonPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRIMSON_SHAKES);
        crimsonPool.stairs(ModBlocks.CRIMSON_SHAKES_STAIRS);
        crimsonPool.slab(ModBlocks.CRIMSON_SHAKES_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WARPED_COMPACT_PLANKS);
        BlockStateModelGenerator.BlockTexturePool warpedPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WARPED_SHAKES);
        warpedPool.stairs(ModBlocks.WARPED_SHAKES_STAIRS);
        warpedPool.slab(ModBlocks.WARPED_SHAKES_SLAB);

        //CHUNKY BRICKS

        BlockStateModelGenerator.BlockTexturePool chunkyBrickPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHUNKY_BRICKS);
        chunkyBrickPool.stairs(ModBlocks.CHUNKY_BRICK_STAIRS);
        chunkyBrickPool.slab(ModBlocks.CHUNKY_BRICK_SLAB);
        chunkyBrickPool.wall(ModBlocks.CHUNKY_BRICK_WALL);

        //TERRACOTTA TRIMS

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_TERRACOTTA_TRIM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_TERRACOTTA_TRIM);

        //CUT COBBLESTONES

        BlockStateModelGenerator.BlockTexturePool cutCobblePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_COBBLESTONE);
        cutCobblePool.stairs(ModBlocks.CUT_COBBLESTONE_STAIRS);
        cutCobblePool.slab(ModBlocks.CUT_COBBLESTONE_SLAB);
        cutCobblePool.wall(ModBlocks.CUT_COBBLESTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool cutMossyCobblePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_MOSSY_COBBLESTONE);
        cutMossyCobblePool.stairs(ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS);
        cutMossyCobblePool.slab(ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB);
        cutMossyCobblePool.wall(ModBlocks.CUT_MOSSY_COBBLESTONE_WALL);

        blockStateModelGenerator.registerSingleton(ModBlocks.CARVED_STONE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CARVED_GRANITE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CARVED_DIORITE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CARVED_ANDESITE, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool sugarcretePool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUGARCRETE_BRICKS);
        sugarcretePool.stairs(ModBlocks.SUGARCRETE_BRICK_STAIRS);
        sugarcretePool.slab(ModBlocks.SUGARCRETE_BRICK_SLAB);

        BlockStateModelGenerator.BlockTexturePool cutFreshPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_FRESH_BAMBOO_BLOCK);
        cutFreshPool.stairs(ModBlocks.CUT_FRESH_BAMBOO_STAIRS);
        cutFreshPool.slab(ModBlocks.CUT_FRESH_BAMBOO_SLAB);

        BlockStateModelGenerator.BlockTexturePool cutBambooPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_BAMBOO_BLOCK);
        cutBambooPool.stairs(ModBlocks.CUT_BAMBOO_STAIRS);
        cutBambooPool.slab(ModBlocks.CUT_BAMBOO_SLAB);

        BlockStateModelGenerator.BlockTexturePool cutStrippedPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK);
        cutStrippedPool.stairs(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS);
        cutStrippedPool.slab(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB);

        blockStateModelGenerator.registerSimpleState(ModBlocks.MUD_POT);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_PACKED_MUD);

        BlockStateModelGenerator.BlockTexturePool mudShinglesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MUD_SHINGLES);
        mudShinglesPool.stairs(ModBlocks.MUD_SHINGLES_STAIRS);
        mudShinglesPool.slab(ModBlocks.MUD_SHINGLES_SLAB);
        mudShinglesPool.wall(ModBlocks.MUD_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool stoneShinglesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONE_SHINGLES);
        stoneShinglesPool.stairs(ModBlocks.STONE_SHINGLES_STAIRS);
        stoneShinglesPool.slab(ModBlocks.STONE_SHINGLES_SLAB);
        stoneShinglesPool.wall(ModBlocks.STONE_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyStoneShinglesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_STONE_SHINGLES);
        mossyStoneShinglesPool.stairs(ModBlocks.MOSSY_STONE_SHINGLES_STAIRS);
        mossyStoneShinglesPool.slab(ModBlocks.MOSSY_STONE_SHINGLES_SLAB);
        mossyStoneShinglesPool.wall(ModBlocks.MOSSY_STONE_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool sandstoneShinglesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDSTONE_SHINGLES);
        sandstoneShinglesPool.stairs(ModBlocks.SANDSTONE_SHINGLES_STAIRS);
        sandstoneShinglesPool.slab(ModBlocks.SANDSTONE_SHINGLES_SLAB);
        sandstoneShinglesPool.wall(ModBlocks.SANDSTONE_SHINGLES_WALL);

        BlockStateModelGenerator.BlockTexturePool deepslateShinglesPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_SHINGLES);
        deepslateShinglesPool.stairs(ModBlocks.DEEPSLATE_SHINGLES_STAIRS);
        deepslateShinglesPool.slab(ModBlocks.DEEPSLATE_SHINGLES_SLAB);
        deepslateShinglesPool.wall(ModBlocks.DEEPSLATE_SHINGLES_WALL);

        blockStateModelGenerator.registerSimpleState(ModBlocks.IRON_GRATE);

        blockStateModelGenerator.registerSimpleState(ModBlocks.FRAMED_GLASS);












        blockStateModelGenerator.registerLog(ModBlocks.FRESH_BAMBOO_BLOCK).log(ModBlocks.FRESH_BAMBOO_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BUILT, Models.GENERATED);
    }
}
