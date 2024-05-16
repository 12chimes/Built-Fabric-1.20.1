package net.truly.built.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BUILT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Built.MOD_ID, "built"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.built"))
                    .icon(() -> new ItemStack(ModItems.BUILT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.OAK_COMPACT_PLANKS);
                        entries.add(ModBlocks.OAK_SHAKES);
                        entries.add(ModBlocks.OAK_SHAKES_STAIRS);
                        entries.add(ModBlocks.OAK_SHAKES_SLAB);

                        entries.add(ModBlocks.SPRUCE_COMPACT_PLANKS);
                        entries.add(ModBlocks.SPRUCE_SHAKES);
                        entries.add(ModBlocks.SPRUCE_SHAKES_STAIRS);
                        entries.add(ModBlocks.SPRUCE_SHAKES_SLAB);

                        entries.add(ModBlocks.BIRCH_COMPACT_PLANKS);
                        entries.add(ModBlocks.BIRCH_SHAKES);
                        entries.add(ModBlocks.BIRCH_SHAKES_STAIRS);
                        entries.add(ModBlocks.BIRCH_SHAKES_SLAB);

                        entries.add(ModBlocks.JUNGLE_COMPACT_PLANKS);
                        entries.add(ModBlocks.JUNGLE_SHAKES);
                        entries.add(ModBlocks.JUNGLE_SHAKES_STAIRS);
                        entries.add(ModBlocks.JUNGLE_SHAKES_SLAB);

                        entries.add(ModBlocks.ACACIA_COMPACT_PLANKS);
                        entries.add(ModBlocks.ACACIA_SHAKES);
                        entries.add(ModBlocks.ACACIA_SHAKES_STAIRS);
                        entries.add(ModBlocks.ACACIA_SHAKES_SLAB);

                        entries.add(ModBlocks.DARK_OAK_COMPACT_PLANKS);
                        entries.add(ModBlocks.DARK_OAK_SHAKES);
                        entries.add(ModBlocks.DARK_OAK_SHAKES_STAIRS);
                        entries.add(ModBlocks.DARK_OAK_SHAKES_SLAB);

                        entries.add(ModBlocks.MANGROVE_COMPACT_PLANKS);
                        entries.add(ModBlocks.MANGROVE_SHAKES);
                        entries.add(ModBlocks.MANGROVE_SHAKES_STAIRS);
                        entries.add(ModBlocks.MANGROVE_SHAKES_SLAB);

                        entries.add(ModBlocks.CHERRY_COMPACT_PLANKS);
                        entries.add(ModBlocks.CHERRY_SHAKES);
                        entries.add(ModBlocks.CHERRY_SHAKES_STAIRS);
                        entries.add(ModBlocks.CHERRY_SHAKES_SLAB);

                        entries.add(ModBlocks.BAMBOO_COMPACT_PLANKS);
                        entries.add(ModBlocks.BAMBOO_SHAKES);
                        entries.add(ModBlocks.BAMBOO_SHAKES_STAIRS);
                        entries.add(ModBlocks.BAMBOO_SHAKES_SLAB);

                        entries.add(ModBlocks.CRIMSON_COMPACT_PLANKS);
                        entries.add(ModBlocks.CRIMSON_SHAKES);
                        entries.add(ModBlocks.CRIMSON_SHAKES_STAIRS);
                        entries.add(ModBlocks.CRIMSON_SHAKES_SLAB);

                        entries.add(ModBlocks.WARPED_COMPACT_PLANKS);
                        entries.add(ModBlocks.WARPED_SHAKES);
                        entries.add(ModBlocks.WARPED_SHAKES_STAIRS);
                        entries.add(ModBlocks.WARPED_SHAKES_SLAB);

                        entries.add(ModBlocks.CHUNKY_BRICKS);
                        entries.add(ModBlocks.CHUNKY_BRICK_STAIRS);
                        entries.add(ModBlocks.CHUNKY_BRICK_SLAB);
                        entries.add(ModBlocks.CHUNKY_BRICK_WALL);

                        entries.add(ModBlocks.TERRACOTTA_TRIM);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.RED_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.LIME_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.PINK_TERRACOTTA_TRIM);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_TRIM);

                        entries.add(ModBlocks.CUT_COBBLESTONE);
                        entries.add(ModBlocks.CUT_COBBLESTONE_STAIRS);
                        entries.add(ModBlocks.CUT_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.CUT_COBBLESTONE_WALL);

                        entries.add(ModBlocks.CUT_MOSSY_COBBLESTONE);
                        entries.add(ModBlocks.CUT_MOSSY_COBBLESTONE_STAIRS);
                        entries.add(ModBlocks.CUT_MOSSY_COBBLESTONE_SLAB);
                        entries.add(ModBlocks.CUT_MOSSY_COBBLESTONE_WALL);

                        entries.add(ModBlocks.CARVED_STONE);
                        entries.add(ModBlocks.CARVED_GRANITE);
                        entries.add(ModBlocks.CARVED_DIORITE);
                        entries.add(ModBlocks.CARVED_ANDESITE);

                        entries.add(ModBlocks.SUGARCRETE_BRICKS);
                        entries.add(ModBlocks.SUGARCRETE_BRICK_STAIRS);
                        entries.add(ModBlocks.SUGARCRETE_BRICK_SLAB);

                        entries.add(ModBlocks.FRESH_BAMBOO_BLOCK);

                        entries.add(ModBlocks.CUT_FRESH_BAMBOO_BLOCK);
                        entries.add(ModBlocks.CUT_FRESH_BAMBOO_STAIRS);
                        entries.add(ModBlocks.CUT_FRESH_BAMBOO_SLAB);

                        entries.add(ModBlocks.CUT_BAMBOO_BLOCK);
                        entries.add(ModBlocks.CUT_BAMBOO_STAIRS);
                        entries.add(ModBlocks.CUT_BAMBOO_SLAB);

                        entries.add(ModBlocks.CUT_STRIPPED_BAMBOO_BLOCK);
                        entries.add(ModBlocks.CUT_STRIPPED_BAMBOO_STAIRS);
                        entries.add(ModBlocks.CUT_STRIPPED_BAMBOO_SLAB);

                        entries.add(ModBlocks.MUD_POT);

                        entries.add(ModBlocks.POLISHED_PACKED_MUD);

                        entries.add(ModBlocks.MUD_SHINGLES);
                        entries.add(ModBlocks.MUD_SHINGLES_STAIRS);
                        entries.add(ModBlocks.MUD_SHINGLES_SLAB);
                        entries.add(ModBlocks.MUD_SHINGLES_WALL);

                        entries.add(ModBlocks.STONE_SHINGLES);
                        entries.add(ModBlocks.STONE_SHINGLES_STAIRS);
                        entries.add(ModBlocks.STONE_SHINGLES_SLAB);
                        entries.add(ModBlocks.STONE_SHINGLES_WALL);

                        entries.add(ModBlocks.MOSSY_STONE_SHINGLES);
                        entries.add(ModBlocks.MOSSY_STONE_SHINGLES_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_SHINGLES_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_SHINGLES_WALL);

                        entries.add(ModBlocks.SANDSTONE_SHINGLES);
                        entries.add(ModBlocks.SANDSTONE_SHINGLES_STAIRS);
                        entries.add(ModBlocks.SANDSTONE_SHINGLES_SLAB);
                        entries.add(ModBlocks.SANDSTONE_SHINGLES_WALL);

                        entries.add(ModBlocks.DEEPSLATE_SHINGLES);
                        entries.add(ModBlocks.DEEPSLATE_SHINGLES_STAIRS);
                        entries.add(ModBlocks.DEEPSLATE_SHINGLES_SLAB);
                        entries.add(ModBlocks.DEEPSLATE_SHINGLES_WALL);

                        entries.add(ModBlocks.IRON_GRATE);

                        entries.add(ModBlocks.FRAMED_GLASS);
                        entries.add(ModBlocks.FRAMED_GLASS_PANE);

                    }).build());

    public static void registerItemGroups() {
        Built.LOGGER.info("Registering Item Groups for "+Built.MOD_ID);
    }
}
