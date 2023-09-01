package net.mcreator.ifgretro.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.ifgretro.block.RubberSaplingBlock;
import net.mcreator.ifgretro.IfgretroMod;

import java.util.Map;

public class RubberLeavesDestroyProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				IfgretroMod.LOGGER.warn("Failed to load dependency world for procedure RubberLeavesDestroy!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				IfgretroMod.LOGGER.warn("Failed to load dependency x for procedure RubberLeavesDestroy!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				IfgretroMod.LOGGER.warn("Failed to load dependency y for procedure RubberLeavesDestroy!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				IfgretroMod.LOGGER.warn("Failed to load dependency z for procedure RubberLeavesDestroy!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.0625) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RubberSaplingBlock.block));
				entityToSpawn.setPickupDelay((int) 1);
				world.addEntity(entityToSpawn);
			}
		}
		if (Math.random() < 0.005) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.STICK));
				entityToSpawn.setPickupDelay((int) 1);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
