import java.awt.event.*;

public class Board extends GameArena {
    private Spaceship spaceship;
    public Board() {
        //create a new spaceship
        super(600, 600, true);
        spaceship = new Spaceship(300, 300, 10, 20, "WHITE");
        addSpaceship(spaceship);
        addRectangle(spaceship);
    }

    public void play(){
        spaceship.move();
        pause();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyAction(e, true);
    }

    @Override
    public void keyAction(KeyEvent e, boolean yn) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
            spaceship.move();
        // if (code == KeyEvent.VK_DOWN)
        //     spaceship.down();
        // if (code == KeyEvent.VK_LEFT)
        //     spaceship.left();
        // if (code == KeyEvent.VK_RIGHT)
        //     spaceship.right();
        // if (code == KeyEvent.VK_SPACE)
        //     spaceship.space();
    }

}