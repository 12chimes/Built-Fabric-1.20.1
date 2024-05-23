package net.truly.built.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //OAK

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.OAK_PLANKS)
                .input('S', Items.STRIPPED_OAK_LOG)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_OAK_LOG), conditionsFromItem(Items.STRIPPED_OAK_LOG))
                .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.OAK_PLANKS)
                .input('S', Items.STRIPPED_OAK_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_OAK_LOG), conditionsFromItem(Items.STRIPPED_OAK_LOG))
                .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_SHAKES)));

        createStairsRecipe(ModBlocks.OAK_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.OAK_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.OAK_SHAKES), conditionsFromItem(ModBlocks.OAK_SHAKES))
                        .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.OAK_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.OAK_SHAKES), conditionsFromItem(ModBlocks.OAK_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OAK_SHAKES_SLAB)));

        //SPRUCE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.SPRUCE_PLANKS)
                .input('S', Items.STRIPPED_SPRUCE_LOG)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_SPRUCE_LOG), conditionsFromItem(Items.STRIPPED_SPRUCE_LOG))
                .criterion(hasItem(Items.SPRUCE_PLANKS), conditionsFromItem(Items.SPRUCE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPRUCE_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.SPRUCE_PLANKS)
                .input('S', Items.STRIPPED_SPRUCE_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_SPRUCE_LOG), conditionsFromItem(Items.STRIPPED_SPRUCE_LOG))
                .criterion(hasItem(Items.SPRUCE_PLANKS), conditionsFromItem(Items.SPRUCE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPRUCE_SHAKES)));

        createStairsRecipe(ModBlocks.SPRUCE_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.SPRUCE_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.SPRUCE_SHAKES), conditionsFromItem(ModBlocks.SPRUCE_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPRUCE_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.SPRUCE_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.SPRUCE_SHAKES), conditionsFromItem(ModBlocks.SPRUCE_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SPRUCE_SHAKES_SLAB)));

        //BIRCH

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.BIRCH_PLANKS)
                .input('S', Items.STRIPPED_BIRCH_LOG)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_BIRCH_LOG), conditionsFromItem(Items.STRIPPED_BIRCH_LOG))
                .criterion(hasItem(Items.BIRCH_PLANKS), conditionsFromItem(Items.BIRCH_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BIRCH_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.BIRCH_PLANKS)
                .input('S', Items.STRIPPED_BIRCH_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_BIRCH_LOG), conditionsFromItem(Items.STRIPPED_BIRCH_LOG))
                .criterion(hasItem(Items.BIRCH_PLANKS), conditionsFromItem(Items.BIRCH_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BIRCH_SHAKES)));

        createStairsRecipe(ModBlocks.BIRCH_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.BIRCH_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.BIRCH_SHAKES), conditionsFromItem(ModBlocks.BIRCH_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BIRCH_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.BIRCH_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.BIRCH_SHAKES), conditionsFromItem(ModBlocks.BIRCH_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BIRCH_SHAKES_SLAB)));

        //JUNGLE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.JUNGLE_PLANKS)
                .input('S', Items.STRIPPED_JUNGLE_LOG)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_JUNGLE_LOG), conditionsFromItem(Items.STRIPPED_JUNGLE_LOG))
                .criterion(hasItem(Items.JUNGLE_PLANKS), conditionsFromItem(Items.JUNGLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.JUNGLE_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.JUNGLE_PLANKS)
                .input('S', Items.STRIPPED_JUNGLE_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_JUNGLE_LOG), conditionsFromItem(Items.STRIPPED_JUNGLE_LOG))
                .criterion(hasItem(Items.JUNGLE_PLANKS), conditionsFromItem(Items.JUNGLE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.JUNGLE_SHAKES)));

        createStairsRecipe(ModBlocks.JUNGLE_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.JUNGLE_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.JUNGLE_SHAKES), conditionsFromItem(ModBlocks.JUNGLE_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.JUNGLE_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.JUNGLE_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.JUNGLE_SHAKES), conditionsFromItem(ModBlocks.JUNGLE_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.JUNGLE_SHAKES_SLAB)));

        //ACACIA

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.ACACIA_PLANKS)
                .input('S', Items.STRIPPED_ACACIA_LOG)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_ACACIA_LOG), conditionsFromItem(Items.STRIPPED_ACACIA_LOG))
                .criterion(hasItem(Items.ACACIA_PLANKS), conditionsFromItem(Items.ACACIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ACACIA_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.ACACIA_PLANKS)
                .input('S', Items.STRIPPED_ACACIA_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_ACACIA_LOG), conditionsFromItem(Items.STRIPPED_ACACIA_LOG))
                .criterion(hasItem(Items.ACACIA_PLANKS), conditionsFromItem(Items.ACACIA_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ACACIA_SHAKES)));

        createStairsRecipe(ModBlocks.ACACIA_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.ACACIA_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.ACACIA_SHAKES), conditionsFromItem(ModBlocks.ACACIA_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ACACIA_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.ACACIA_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.ACACIA_SHAKES), conditionsFromItem(ModBlocks.ACACIA_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ACACIA_SHAKES_SLAB)));

        //DARK OAK

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .group("compact_planks")
                .input('#', Items.DARK_OAK_PLANKS)
                .input('S', Items.STRIPPED_DARK_OAK_LOG)
                .criterion(hasItem(Items.STRIPPED_DARK_OAK_LOG), conditionsFromItem(Items.STRIPPED_DARK_OAK_LOG))
                .criterion(hasItem(Items.DARK_OAK_PLANKS), conditionsFromItem(Items.DARK_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_OAK_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.DARK_OAK_PLANKS)
                .input('S', Items.STRIPPED_DARK_OAK_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_DARK_OAK_LOG), conditionsFromItem(Items.STRIPPED_DARK_OAK_LOG))
                .criterion(hasItem(Items.DARK_OAK_PLANKS), conditionsFromItem(Items.DARK_OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_OAK_SHAKES)));

        createStairsRecipe(ModBlocks.DARK_OAK_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.DARK_OAK_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.DARK_OAK_SHAKES), conditionsFromItem(ModBlocks.DARK_OAK_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_OAK_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.DARK_OAK_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.DARK_OAK_SHAKES), conditionsFromItem(ModBlocks.DARK_OAK_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DARK_OAK_SHAKES_SLAB)));

        //MANGROVE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.MANGROVE_PLANKS)
                .input('S', Items.STRIPPED_MANGROVE_LOG)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_MANGROVE_LOG), conditionsFromItem(Items.STRIPPED_MANGROVE_LOG))
                .criterion(hasItem(Items.MANGROVE_PLANKS), conditionsFromItem(Items.MANGROVE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MANGROVE_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.MANGROVE_PLANKS)
                .input('S', Items.STRIPPED_MANGROVE_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_MANGROVE_LOG), conditionsFromItem(Items.STRIPPED_MANGROVE_LOG))
                .criterion(hasItem(Items.MANGROVE_PLANKS), conditionsFromItem(Items.MANGROVE_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MANGROVE_SHAKES)));

        createStairsRecipe(ModBlocks.MANGROVE_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.MANGROVE_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.MANGROVE_SHAKES), conditionsFromItem(ModBlocks.MANGROVE_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MANGROVE_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.MANGROVE_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.MANGROVE_SHAKES), conditionsFromItem(ModBlocks.MANGROVE_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MANGROVE_SHAKES_SLAB)));

        //CHERRY

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.CHERRY_PLANKS)
                .input('S', Items.STRIPPED_CHERRY_LOG)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_CHERRY_LOG), conditionsFromItem(Items.STRIPPED_CHERRY_LOG))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.CHERRY_PLANKS)
                .input('S', Items.STRIPPED_CHERRY_LOG)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_CHERRY_LOG), conditionsFromItem(Items.STRIPPED_CHERRY_LOG))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_SHAKES)));

        createStairsRecipe(ModBlocks.CHERRY_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.CHERRY_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.CHERRY_SHAKES), conditionsFromItem(ModBlocks.CHERRY_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.CHERRY_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.CHERRY_SHAKES), conditionsFromItem(ModBlocks.CHERRY_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHERRY_SHAKES_SLAB)));

        //BAMBOO

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.BAMBOO_PLANKS)
                .input('S', Items.STRIPPED_BAMBOO_BLOCK)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Items.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Items.BAMBOO_PLANKS), conditionsFromItem(Items.BAMBOO_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.BAMBOO_PLANKS)
                .input('S', Items.STRIPPED_BAMBOO_BLOCK)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_BAMBOO_BLOCK), conditionsFromItem(Items.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Items.BAMBOO_PLANKS), conditionsFromItem(Items.BAMBOO_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_SHAKES)));

        createStairsRecipe(ModBlocks.BAMBOO_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.BAMBOO_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.BAMBOO_SHAKES), conditionsFromItem(ModBlocks.BAMBOO_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.BAMBOO_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.BAMBOO_SHAKES), conditionsFromItem(ModBlocks.BAMBOO_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_SHAKES_SLAB)));

        //CRIMSON

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.CRIMSON_PLANKS)
                .input('S', Items.STRIPPED_CRIMSON_STEM)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_CRIMSON_STEM), conditionsFromItem(Items.STRIPPED_CRIMSON_STEM))
                .criterion(hasItem(Items.CRIMSON_PLANKS), conditionsFromItem(Items.CRIMSON_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRIMSON_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.CRIMSON_PLANKS)
                .input('S', Items.STRIPPED_CRIMSON_STEM)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_CRIMSON_STEM), conditionsFromItem(Items.STRIPPED_CRIMSON_STEM))
                .criterion(hasItem(Items.CRIMSON_PLANKS), conditionsFromItem(Items.CRIMSON_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRIMSON_SHAKES)));

        createStairsRecipe(ModBlocks.CRIMSON_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.CRIMSON_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.CRIMSON_SHAKES), conditionsFromItem(ModBlocks.CRIMSON_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRIMSON_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.CRIMSON_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.CRIMSON_SHAKES), conditionsFromItem(ModBlocks.CRIMSON_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CRIMSON_SHAKES_SLAB)));

        //WARPED

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_COMPACT_PLANKS, 8)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.WARPED_PLANKS)
                .input('S', Items.STRIPPED_WARPED_STEM)
                .group("compact_planks")
                .criterion(hasItem(Items.STRIPPED_WARPED_STEM), conditionsFromItem(Items.STRIPPED_WARPED_STEM))
                .criterion(hasItem(Items.WARPED_PLANKS), conditionsFromItem(Items.WARPED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WARPED_COMPACT_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SHAKES, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.WARPED_PLANKS)
                .input('S', Items.STRIPPED_WARPED_STEM)
                .group("wood_shakes")
                .criterion(hasItem(Items.STRIPPED_WARPED_STEM), conditionsFromItem(Items.STRIPPED_WARPED_STEM))
                .criterion(hasItem(Items.WARPED_PLANKS), conditionsFromItem(Items.WARPED_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WARPED_SHAKES)));

        createStairsRecipe(ModBlocks.WARPED_SHAKES_STAIRS, Ingredient.ofItems(ModBlocks.WARPED_SHAKES))
                .group("wood_shakes_stairs")
                .criterion(hasItem(ModBlocks.WARPED_SHAKES), conditionsFromItem(ModBlocks.WARPED_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WARPED_SHAKES_STAIRS)));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SHAKES_SLAB, Ingredient.ofItems(ModBlocks.WARPED_SHAKES))
                .group("wood_shakes_slab")
                .criterion(hasItem(ModBlocks.WARPED_SHAKES), conditionsFromItem(ModBlocks.WARPED_SHAKES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WARPED_SHAKES_SLAB)));

        //CHUNKY BRICKS

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICKS, Items.BRICKS);

        createStairsRecipe(ModBlocks.CHUNKY_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.CHUNKY_BRICK_STAIRS))
                .criterion(hasItem(ModBlocks.CHUNKY_BRICKS), conditionsFromItem(ModBlocks.CHUNKY_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHUNKY_BRICK_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_STAIRS, ModBlocks.CHUNKY_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_STAIRS, Items.BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_SLAB, ModBlocks.CHUNKY_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_SLAB, ModBlocks.CHUNKY_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_SLAB, Items.BRICKS, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_WALL, ModBlocks.CHUNKY_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_WALL, ModBlocks.CHUNKY_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHUNKY_BRICK_WALL, Items.BRICKS);

        //TERRACOTTA TRIMS

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.TERRACOTTA), conditionsFromItem(Items.TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.WHITE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.WHITE_TERRACOTTA), conditionsFromItem(Items.WHITE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.WHITE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.LIGHT_GRAY_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.LIGHT_GRAY_TERRACOTTA), conditionsFromItem(Items.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.GRAY_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.GRAY_TERRACOTTA), conditionsFromItem(Items.GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRAY_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.BLACK_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.BLACK_TERRACOTTA), conditionsFromItem(Items.BLACK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.BROWN_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.BROWN_TERRACOTTA), conditionsFromItem(Items.BROWN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BROWN_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.RED_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.RED_TERRACOTTA), conditionsFromItem(Items.RED_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RED_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.ORANGE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.ORANGE_TERRACOTTA), conditionsFromItem(Items.ORANGE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ORANGE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.YELLOW_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.YELLOW_TERRACOTTA), conditionsFromItem(Items.YELLOW_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOW_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.LIME_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.LIME_TERRACOTTA), conditionsFromItem(Items.LIME_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIME_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.GREEN_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.GREEN_TERRACOTTA), conditionsFromItem(Items.GREEN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREEN_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.LIGHT_BLUE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.LIGHT_BLUE_TERRACOTTA), conditionsFromItem(Items.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.CYAN_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.CYAN_TERRACOTTA), conditionsFromItem(Items.CYAN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CYAN_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.BLUE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.BLUE_TERRACOTTA), conditionsFromItem(Items.BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.PURPLE_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.PURPLE_TERRACOTTA), conditionsFromItem(Items.PURPLE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLE_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.PINK_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.PINK_TERRACOTTA), conditionsFromItem(Items.PINK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINK_TERRACOTTA_TRIM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_TRIM, 2)
                .pattern("##")
                .input('#', Items.MAGENTA_TERRACOTTA)
                .group("terracotta_trims")
                .criterion(hasItem(Items.MAGENTA_TERRACOTTA), conditionsFromItem(Items.MAGENTA_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MAGENTA_TERRACOTTA_TRIM)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TERRACOTTA_TRIM, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_TERRACOTTA_TRIM, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_TERRACOTTA_TRIM, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_TERRACOTTA_TRIM, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_TERRACOTTA_TRIM, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_TERRACOTTA_TRIM, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_TERRACOTTA_TRIM, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_TERRACOTTA_TRIM, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_TERRACOTTA_TRIM, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_TERRACOTTA_TRIM, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_TERRACOTTA_TRIM, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_TERRACOTTA_TRIM, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_TERRACOTTA_TRIM, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_TERRACOTTA_TRIM, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_TERRACOTTA_TRIM, Items.MAGENTA_TERRACOTTA);

        //CUT COBBLESTONE

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE, Items.COBBLESTONE);

        createStairsRecipe(ModBlocks.CUT_COBBLESTONE_STAIRS, Ingredient.ofItems(ModBlocks.CUT_COBBLESTONE))
                .criterion(hasItem(ModBlocks.CUT_COBBLESTONE), conditionsFromItem(ModBlocks.CUT_COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_COBBLESTONE_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_STAIRS, ModBlocks.CUT_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_STAIRS, Items.COBBLESTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_SLAB, ModBlocks.CUT_COBBLESTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_SLAB, ModBlocks.CUT_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_SLAB, Items.COBBLESTONE, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_WALL, ModBlocks.CUT_COBBLESTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_WALL, ModBlocks.CUT_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_COBBLESTONE_WALL, Items.COBBLESTONE);

        //MOSSY CUT COBBLESTONE

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE, Items.MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE, Items.MOSSY_COBBLESTONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUT_MOSSY_COBBLESTONE)
                .pattern("#S")
                .input('#', ModBlocks.CUT_COBBLESTONE)
                .input('S', Items.VINE)
                .group("cut_mossy_cobblestone")
                .criterion(hasItem(Items.VINE), conditionsFromItem(Items.VINE))
                .offerTo(exporter, new Identifier(Built.MOD_ID, "cut_mossy_cobblestone_from_vine"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CUT_MOSSY_COBBLESTONE)
                .pattern("#S")
                .input('#', ModBlocks.CUT_COBBLESTONE)
                .input('S', Items.MOSS_BLOCK)
                .group("cut_mossy_cobblestone")
                .criterion(hasItem(Items.MOSS_BLOCK), conditionsFromItem(Items.MOSS_BLOCK))
                .offerTo(exporter, new Identifier(Built.MOD_ID, "cut_mossy_cobblestone_from_moss_block"));

        createStairsRecipe(ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS, Ingredient.ofItems(ModBlocks.CUT_MOSSY_COBBLESTONE))
                .criterion(hasItem(ModBlocks.CUT_MOSSY_COBBLESTONE), conditionsFromItem(ModBlocks.CUT_MOSSY_COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS, ModBlocks.CUT_MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS, Items.MOSSY_COBBLESTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB, ModBlocks.CUT_MOSSY_COBBLESTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB, ModBlocks.CUT_MOSSY_COBBLESTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB, Items.MOSSY_COBBLESTONE, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_WALL, ModBlocks.CUT_MOSSY_COBBLESTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_WALL, ModBlocks.CUT_MOSSY_COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_MOSSY_COBBLESTONE_WALL, Items.MOSSY_COBBLESTONE);

        //CARVED STONE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_STONE, 4)
                .pattern("#S")
                .pattern("S#")
                .input('#', Items.STONE_BRICKS)
                .input('S', Items.STONE)
                .criterion(hasItem(Items.STONE_BRICKS), conditionsFromItem(Items.STONE_BRICKS))
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CARVED_STONE)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_STONE, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_STONE, Items.STONE);

        //CARVED GRANITE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_GRANITE, 4)
                .pattern("##")
                .pattern("SS")
                .input('#', Items.POLISHED_GRANITE)
                .input('S', Items.GRANITE)
                .criterion(hasItem(Items.POLISHED_GRANITE), conditionsFromItem(Items.POLISHED_GRANITE))
                .criterion(hasItem(Items.GRANITE), conditionsFromItem(Items.GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CARVED_GRANITE)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_GRANITE, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_GRANITE, Items.GRANITE);

        //CARVED DIORITE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_DIORITE, 4)
                .pattern("##")
                .pattern("SS")
                .input('#', Items.POLISHED_DIORITE)
                .input('S', Items.DIORITE)
                .criterion(hasItem(Items.POLISHED_DIORITE), conditionsFromItem(Items.POLISHED_DIORITE))
                .criterion(hasItem(Items.DIORITE), conditionsFromItem(Items.DIORITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CARVED_DIORITE)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_DIORITE, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_DIORITE, Items.DIORITE);

        //CARVED ANDESITE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_ANDESITE, 4)
                .pattern("##")
                .pattern("SS")
                .input('#', Items.POLISHED_ANDESITE)
                .input('S', Items.ANDESITE)
                .criterion(hasItem(Items.POLISHED_ANDESITE), conditionsFromItem(Items.POLISHED_ANDESITE))
                .criterion(hasItem(Items.ANDESITE), conditionsFromItem(Items.ANDESITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CARVED_ANDESITE)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_ANDESITE, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARVED_ANDESITE, Items.ANDESITE);

        //SUGARCRETE BRICKS

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICKS, 4)
                .pattern("##")
                .pattern("#S")
                .input('#', Items.SUGAR_CANE)
                .input('S', Items.WHEAT)
                .criterion(hasItem(Items.SUGAR_CANE), conditionsFromItem(Items.SUGAR_CANE))
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SUGARCRETE_BRICKS)));

        createStairsRecipe(ModBlocks.SUGARCRETE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.SUGARCRETE_BRICKS))
                .criterion(hasItem(ModBlocks.SUGARCRETE_BRICKS), conditionsFromItem(ModBlocks.SUGARCRETE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SUGARCRETE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICK_STAIRS, ModBlocks.SUGARCRETE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICK_SLAB, ModBlocks.SUGARCRETE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGARCRETE_BRICK_SLAB, ModBlocks.SUGARCRETE_BRICKS, 2);

        //CUT FRESH BAMBOO

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_FRESH_BAMBOO_BLOCK, ModBlocks.FRESH_BAMBOO_BLOCK);

        createStairsRecipe(ModBlocks.CUT_FRESH_BAMBOO_STAIRS, Ingredient.ofItems(ModBlocks.CUT_FRESH_BAMBOO_BLOCK))
                .criterion(hasItem(ModBlocks.CUT_FRESH_BAMBOO_BLOCK), conditionsFromItem(ModBlocks.CUT_FRESH_BAMBOO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_FRESH_BAMBOO_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_FRESH_BAMBOO_SLAB, ModBlocks.CUT_FRESH_BAMBOO_BLOCK);

        //CUT BAMBOO

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BAMBOO_BLOCK, Items.BAMBOO_BLOCK);

        createStairsRecipe(ModBlocks.CUT_BAMBOO_STAIRS, Ingredient.ofItems(ModBlocks.CUT_BAMBOO_BLOCK))
                .criterion(hasItem(ModBlocks.CUT_BAMBOO_BLOCK), conditionsFromItem(ModBlocks.CUT_BAMBOO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_BAMBOO_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BAMBOO_SLAB, ModBlocks.CUT_BAMBOO_BLOCK);

        //CUT STRIPPED BAMBOO

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK, Items.STRIPPED_BAMBOO_BLOCK);

        createStairsRecipe(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS, Ingredient.ofItems(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK), conditionsFromItem(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STRIPPED_BAMBOO_SLAB, ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK);

        //POLISHED PACKED MUD

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PACKED_MUD, Items.MUD_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PACKED_MUD, Items.MUD_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PACKED_MUD, Items.PACKED_MUD);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.MUD_BRICKS, Items.PACKED_MUD); //should be vanilla lol

        //MUD SHINGLES

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES, 2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.MUD_BRICK_SLAB)
                .criterion(hasItem(Items.MUD_BRICK_SLAB), conditionsFromItem(Items.MUD_BRICK_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MUD_SHINGLES)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES, Items.MUD_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES, Items.PACKED_MUD);

        createStairsRecipe(ModBlocks.MUD_SHINGLES_STAIRS, Ingredient.ofItems(ModBlocks.MUD_SHINGLES))
                .criterion(hasItem(ModBlocks.MUD_SHINGLES), conditionsFromItem(ModBlocks.MUD_SHINGLES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MUD_SHINGLES_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_STAIRS, Items.MUD_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_STAIRS, ModBlocks.MUD_SHINGLES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_SLAB, ModBlocks.MUD_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_SLAB, Items.MUD_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_SLAB, ModBlocks.MUD_SHINGLES, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_WALL, ModBlocks.MUD_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_WALL, Items.MUD_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MUD_SHINGLES_WALL, ModBlocks.MUD_SHINGLES);

        //STONE SHINGLES

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES, 2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.STONE_BRICK_SLAB)
                .criterion(hasItem(Items.STONE_BRICK_SLAB), conditionsFromItem(Items.STONE_BRICK_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_SHINGLES)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES, Items.STONE);

        createStairsRecipe(ModBlocks.STONE_SHINGLES_STAIRS, Ingredient.ofItems(ModBlocks.STONE_SHINGLES))
                .criterion(hasItem(ModBlocks.STONE_SHINGLES), conditionsFromItem(ModBlocks.STONE_SHINGLES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STONE_SHINGLES_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_STAIRS, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_STAIRS, ModBlocks.STONE_SHINGLES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_SLAB, ModBlocks.STONE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_SLAB, Items.STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_SLAB, ModBlocks.STONE_SHINGLES, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_WALL, ModBlocks.STONE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_WALL, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_SHINGLES_WALL, ModBlocks.STONE_SHINGLES);

        //MOSSY STONE SHINGLES

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES, 2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.MOSSY_STONE_BRICK_SLAB)
                .criterion(hasItem(Items.MOSSY_STONE_BRICK_SLAB), conditionsFromItem(Items.MOSSY_STONE_BRICK_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOSSY_STONE_SHINGLES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOSSY_STONE_SHINGLES)
                .pattern("#S")
                .input('#', ModBlocks.STONE_SHINGLES)
                .input('S', Items.VINE)
                .group("mossy_stone_shingles")
                .criterion(hasItem(Items.VINE), conditionsFromItem(Items.VINE))
                .offerTo(exporter, new Identifier(Built.MOD_ID, "mossy_stone_shingles_from_vine"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOSSY_STONE_SHINGLES)
                .pattern("#S")
                .input('#', ModBlocks.STONE_SHINGLES)
                .input('S', Items.MOSS_BLOCK)
                .group("mossy_stone_shingles")
                .criterion(hasItem(Items.MOSS_BLOCK), conditionsFromItem(Items.MOSS_BLOCK))
                .offerTo(exporter, new Identifier(Built.MOD_ID, "mossy_stone_shingles_from_moss_block"));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES, Items.MOSSY_STONE_BRICKS);

        createStairsRecipe(ModBlocks.MOSSY_STONE_SHINGLES_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_STONE_SHINGLES))
                .criterion(hasItem(ModBlocks.MOSSY_STONE_SHINGLES), conditionsFromItem(ModBlocks.MOSSY_STONE_SHINGLES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MOSSY_STONE_SHINGLES_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_STAIRS, Items.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_STAIRS, ModBlocks.MOSSY_STONE_SHINGLES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_SLAB, ModBlocks.MOSSY_STONE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_SLAB, Items.MOSSY_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_SLAB, ModBlocks.MOSSY_STONE_SHINGLES, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_WALL, ModBlocks.MOSSY_STONE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_WALL, Items.MOSSY_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SHINGLES_WALL, ModBlocks.MOSSY_STONE_SHINGLES);

        //SANDSTONE SHINGLES

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES, 2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.CUT_SANDSTONE_SLAB)
                .criterion(hasItem(Items.CUT_SANDSTONE_SLAB), conditionsFromItem(Items.CUT_SANDSTONE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SANDSTONE_SHINGLES)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES, Items.SANDSTONE);

        createStairsRecipe(ModBlocks.SANDSTONE_SHINGLES_STAIRS, Ingredient.ofItems(ModBlocks.SANDSTONE_SHINGLES))
                .criterion(hasItem(ModBlocks.SANDSTONE_SHINGLES), conditionsFromItem(ModBlocks.SANDSTONE_SHINGLES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SANDSTONE_SHINGLES_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_STAIRS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_STAIRS, ModBlocks.SANDSTONE_SHINGLES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_SLAB, ModBlocks.SANDSTONE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_SLAB, Items.CUT_SANDSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_SLAB, ModBlocks.SANDSTONE_SHINGLES, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_WALL, ModBlocks.SANDSTONE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SHINGLES_WALL, ModBlocks.SANDSTONE_SHINGLES);

        //DEEPSLATE SHINGLES

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES, 2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.DEEPSLATE_TILE_SLAB)
                .criterion(hasItem(Items.DEEPSLATE_TILE_SLAB), conditionsFromItem(Items.DEEPSLATE_TILE_SLAB))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPSLATE_SHINGLES)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES, Items.DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES, Items.COBBLED_DEEPSLATE);

        createStairsRecipe(ModBlocks.DEEPSLATE_SHINGLES_STAIRS, Ingredient.ofItems(ModBlocks.DEEPSLATE_SHINGLES))
                .criterion(hasItem(ModBlocks.DEEPSLATE_SHINGLES), conditionsFromItem(ModBlocks.DEEPSLATE_SHINGLES))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPSLATE_SHINGLES_STAIRS)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_STAIRS, Items.DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_STAIRS, ModBlocks.DEEPSLATE_SHINGLES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_SLAB, ModBlocks.DEEPSLATE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_SLAB, Items.DEEPSLATE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_SLAB, ModBlocks.DEEPSLATE_SHINGLES, 2);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_WALL, ModBlocks.DEEPSLATE_SHINGLES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_WALL, Items.DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SHINGLES_WALL, ModBlocks.DEEPSLATE_SHINGLES);

        //IRON GRATE

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_GRATE)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.IRON_GRATE)));

        //FRAMED GLASS

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRAMED_GLASS)
                .pattern(" # ")
                .pattern("#S#")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('S', Items.GLASS)
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FRAMED_GLASS)));

        offerStainedGlassPaneRecipe(exporter, ModBlocks.FRAMED_GLASS_PANE, ModBlocks.FRAMED_GLASS);

        //MUD POT

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MUD_POT)
                .pattern(" # ")
                .pattern("# #")
                .pattern("###")
                .input('#', Items.PACKED_MUD)
                .criterion(hasItem(Items.PACKED_MUD), conditionsFromItem(Items.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MUD_POT)));





























        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FRESH_BAMBOO_BLOCK, Items.BAMBOO);
    }
}
