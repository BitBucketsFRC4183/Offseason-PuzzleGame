package org.bitbuckets.puzzle.subsystems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
import org.bitbuckets.puzzle.lib.Textures;

//TODO very first subsystem
public class PlayerSystem implements SubSystem {

    int x = 8;
    int y = 8; //starting position

    public int[] position() {
        return new int[] {x,y};
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void periodic(Graphics graphics) {
        graphics.drawTexture(Textures.PLAYER, x, y);
    }
}
