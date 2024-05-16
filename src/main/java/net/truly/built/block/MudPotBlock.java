package net.truly.built.block;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.truly.built.entity.MudPotBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class MudPotBlock extends BlockWithEntity implements BlockEntityProvider {
    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(3, 13, 3, 13, 16, 13),
            Block.createCuboidShape(4, 12, 4, 12, 13, 12),
            Block.createCuboidShape(1, 0, 1, 15, 12, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public MudPotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new MudPotBlockEntity(pos, state);
    }
}
