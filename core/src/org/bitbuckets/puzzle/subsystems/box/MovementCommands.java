package org.bitbuckets.puzzle.subsystems.box;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
import org.bitbuckets.puzzle.subsystems.PlayerSystem;

public class MovementCommands implements SubSystem {

    private final PlayerSystem player;
    private final PositionSubsystem walls;
    private final PositionSubsystem spots;

    public MovementCommands(PlayerSystem player, PositionSubsystem walls, PositionSubsystem spots) {
        this.player = player;
        this.walls = walls;
        this.spots = spots;
    }

    static int x = 0;
    static int y = 0;

    @Override
    public void periodic(Graphics graphics) {
        int[] direction = direction();
        int[] position = player.position();

        int[] simulatedNextPosition = new int[2];

        simulatedNextPosition[x] = direction[x] + position[x];
        simulatedNextPosition[y] = direction[y] + position[y];

        //don't move out of bounds
        if (outOfBounds(simulatedNextPosition)) {
            return;
        }

        //make sure position is held
        if (walls.isPositionHeld( simulatedNextPosition[x], simulatedNextPosition[y] )) {
            return;
        }

        //move boxes!
        






    }

    int[] direction() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) return new int[] {0, -1};
        if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) return new int[] {1, 0};
        if (Gdx.input.isKeyJustPressed(Input.Keys.UP)) return new int[] {0, 1};
        if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT)) return new int[] {-1, 0};

        return new int[]{0, 0};
    }

    boolean outOfBounds(int[] pos) {
        return pos[x] > 8 || pos[x] < 1 || pos[y] > 8 || pos[y] < 1;
    }
}
