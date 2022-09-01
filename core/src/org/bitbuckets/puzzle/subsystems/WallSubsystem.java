package org.bitbuckets.puzzle.subsystems;

import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
import org.bitbuckets.puzzle.lib.Textures;

public class WallSubsystem implements SubSystem {

    private final byte[][] wallPositions;

    public WallSubsystem(byte[][] wallPositions) {
        this.wallPositions = wallPositions;
    }

    @Override
    public void init() {
        //do nothing
    }

    @Override
    public void periodic(Graphics graphics) {
        for (int x = 0; x < wallPositions.length; x++) {
            for (int y = 0; y < wallPositions[x].length; y++) {
                graphics.drawTexture(Textures.WALL, x, y);
            }
        }
    }

    public boolean collidesWithWall(int x, int y) {
        return wallPositions[x][y] != 0;
    }






}
