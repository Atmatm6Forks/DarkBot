package org.darkstorm.darkbot.minecraftbot.world.pathfinding.astar;

import org.darkstorm.darkbot.minecraftbot.world.World;
import org.darkstorm.darkbot.minecraftbot.world.block.BlockLocation;
import org.darkstorm.darkbot.minecraftbot.world.pathfinding.*;

public class AStarPathSearchProvider implements PathSearchProvider {
	private final Heuristic heuristic;
	private final WorldPhysics worldPhysics;

	private final World world;

	public AStarPathSearchProvider(Heuristic heuristic, WorldPhysics worldPhysics) {
		this.heuristic = heuristic;
		this.worldPhysics = worldPhysics;

		world = worldPhysics.getWorld();
	}

	@Override
	public AStarPathSearch provideSearch(BlockLocation start, BlockLocation end) {
		return new AStarPathSearch(this, start, end);
	}

	@Override
	public Heuristic getHeuristic() {
		return heuristic;
	}

	@Override
	public WorldPhysics getWorldPhysics() {
		return worldPhysics;
	}

	@Override
	public World getWorld() {
		return world;
	}
}
