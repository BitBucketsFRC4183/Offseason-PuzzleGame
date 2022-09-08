package org.bitbuckets.puzzle.subsystems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
import org.bitbuckets.puzzle.lib.Textures;

//import func();

//TODO very first subsystem
public class PlayerSystem implements SubSystem {

    int[] pose2d = new int[]{8,8};


    @Override
    public void periodic(Graphics graphics) {


        int[] transform = transform();

        int newX = pose2d[0] + transform[0];
        int newY = pose2d[1] + transform[1];


        graphics.drawTexture(Textures.PLAYER, newX, newY);

        pose2d[0] = newX;
        pose2d[1] = newY;

/* ## MERGE CONFLICT ##
    public int[] position() {
        return new int[] {x,y};
    }
*/

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public int[] transform() {

        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) {
            return new int[] {0, -1};
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.UP)) {

            return new int[] {0, +1};
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.LEFT)) {
            return new int[] {-1, 0};
        }

        if (Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)) {

            return new int[] {1, 0};
        }


        return new int[] {0,0};


/* ## MERGE CONFLICT ##
    @Override
    public void periodic(Graphics graphics) {
        graphics.drawTexture(Textures.PLAYER, x, y);
*/
    }
}
