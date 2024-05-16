package net.truly.built.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.truly.built.Built;
import net.truly.built.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<MudPotBlockEntity> MUD_POT_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Built.MOD_ID, "mud_pot_be"),
                    FabricBlockEntityTypeBuilder.create(MudPotBlockEntity::new,
                            ModBlocks.MUD_POT).build());

    public static void registerBlockEntities() {
        Built.LOGGER.info("Registering Block Entities for "+Built.MOD_ID);
    }
}
