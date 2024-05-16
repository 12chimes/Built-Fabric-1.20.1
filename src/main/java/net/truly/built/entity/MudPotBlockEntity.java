package net.truly.built.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class MudPotBlockEntity extends BlockEntity {
    public MudPotBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MUD_POT_BLOCK_ENTITY, pos, state);
    }
}
