package mod.schnappdragon.habitat.common.entity.ai.goal;

import mod.schnappdragon.habitat.common.block.BallCactusBlock;
import mod.schnappdragon.habitat.common.block.BallCactusFlowerBlock;
import mod.schnappdragon.habitat.common.block.GrowingBallCactusBlock;
import mod.schnappdragon.habitat.common.block.KabloomBushBlock;
import mod.schnappdragon.habitat.core.registry.HabitatBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;

public class HabitatFindPollinationTargetGoal extends Goal {
    private final BeeEntity bee;

    public HabitatFindPollinationTargetGoal(BeeEntity bee) {
        this.bee = bee;
    }

    public boolean shouldExecute() {
        return this.canBeeExecute() && !this.bee.func_233678_J__();
    }

    public boolean shouldContinueExecuting() {
        return this.canBeeExecute() && !this.bee.func_233678_J__();
    }

    public boolean canBeeExecute() {
        if (this.bee.getCropsGrownSincePollination() >= 10) {
            return false;
        } else if (this.bee.getRNG().nextFloat() < 0.3F) {
            return false;
        } else {
            return this.bee.hasNectar() && this.bee.isHiveValid();
        }
    }

    public void tick() {
        if (this.bee.getRNG().nextInt(30) == 0) {
            for(int i = 1; i <= 2; ++i) {
                BlockPos pos = this.bee.getPosition().down(i);
                BlockState state = this.bee.world.getBlockState(pos);
                Block block = state.getBlock();
                boolean flag = false;
                boolean setBlockFlag = false;
                IntegerProperty integerproperty = null;
                if (block.isIn(BlockTags.BEE_GROWABLES)) {
                    if (block == HabitatBlocks.KABLOOM_BUSH.get()) {
                        int k = state.get(KabloomBushBlock.AGE);
                        if (k < 7) {
                            flag = true;
                            setBlockFlag = true;
                            integerproperty = KabloomBushBlock.AGE;
                        }
                    }

                    if (block instanceof BallCactusFlowerBlock) {
                        BallCactusFlowerBlock flower = (BallCactusFlowerBlock) block;
                        this.bee.world.setBlockState(pos, flower.getColor().getGrowingBallCactus().getDefaultState());
                        flag = true;
                    }

                    if (block instanceof GrowingBallCactusBlock) {
                        GrowingBallCactusBlock cactus = (GrowingBallCactusBlock) block;
                        this.bee.world.setBlockState(pos, cactus.getColor().getBallCactus().getDefaultState());
                        flag = true;
                    }

                    if (block instanceof BallCactusBlock) {
                        BallCactusBlock cactus = (BallCactusBlock) block;
                        this.bee.world.setBlockState(pos, cactus.getColor().getFloweringBallCactus().getDefaultState());
                        flag = true;
                    }

                    if (flag) {
                        if (setBlockFlag)
                            this.bee.world.setBlockState(pos, state.with(integerproperty, state.get(integerproperty) + 1));

                        this.bee.world.playEvent(2005, pos, 0);
                        this.bee.addCropCounter();
                    }
                }
            }
        }
    }
}