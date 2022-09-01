package org.bitbuckets.puzzle.subsystems;

import java.util.ArrayList;
import java.util.List;

public class Position {

    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    List<Position> toPositions(byte[][] positions) {
        List<Position> compile = new ArrayList<>();

        for (int x = 0; x < positions.length; x++) {
            for (int y = 0; y < positions[x].length; y++) {

                compile.add(new Position(x,y));

            }
        }

        return compile;
    }
}
