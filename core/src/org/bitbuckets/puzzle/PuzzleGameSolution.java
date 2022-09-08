package org.bitbuckets.puzzle;

import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
import org.bitbuckets.puzzle.lib.Textures;
import org.bitbuckets.puzzle.subsystems.PlayerSystem;

/**
 * This is where you write the code that will make the game function!
 * The starting (this class) code are structured similarly to the robot code you'll see in the real world.
 *
 * Open {@link org.bitbuckets.puzzle.lib} to see the pre-written classes: {@link Graphics}, {@link System}, and {@link Textures}
 */
public class PuzzleGameSolution implements SubSystem {

    /**
     * This is your very first subsystem! We use the subsystem pattern in robot code as well. Press Ctrl + B while
     * highlighting it to open it, or double click it in the file browser
     */
    PlayerSystem playerSystem = new PlayerSystem();

    @Override
    public void init() {
        //This is the initialization, or "init" function and is only ran once
        //Use this to execute code that is used for startup
        System.out.println("Hello World");
        //when you add new subsystems, make sure to add them here, in the periodic loop, and call their init function.
        playerSystem = new PlayerSystem();
        playerSystem.init();
    }

    @Override
    public void periodic(Graphics graphics) {
        //The code you put here is run every game loop
        //For LibGDX this can vary
        //If you were writing a robot this code would be run every 20 milliseconds!
        //You can do stuff with the graphics in your periodic loop!
        //hover over the word Graphics to learn more about how to draw objects on the screen

        playerSystem.periodic( graphics );


    }

}
