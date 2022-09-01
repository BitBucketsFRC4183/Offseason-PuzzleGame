package org.bitbuckets.puzzle.subsystems.box;

import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
import org.bitbuckets.puzzle.subsystems.Position;

import java.util.List;

public class PositionSubsystem implements SubSystem {

    private final int tex;
    private final List<Position> positions;

    public PositionSubsystem(int tex, List<Position> positions) {
        this.tex = tex;
        this.positions = positions;
    }

    @Override
    public void periodic(Graphics graphics) {
        for (Position position : positions) {
            graphics.drawTexture(tex, position.x, position.y);
        }
    }

    public boolean isPositionHeld(int x, int y) {
        for (Position pos : positions) {
            if (pos.x == x && pos.y == y) {
                return true;
            }
        }

        return false;
    }




}
