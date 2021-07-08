import java.awt.event.*;

public class Board extends GameArena {
    private Spaceship spaceship;
    public Board() {
        //create a new spaceship
        super(600, 600, true);
        spaceship = new Spaceship(300, 300, 10, 20, "WHITE");
        addSpaceship(spaceship);
        addRectangle(spaceship);
        play();
    }

    //main game loop
    public void play(){
        while(true){
            spaceship.move();
    
            pause();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyAction(e, true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyAction(e, false);
    }

    @Override
    public void keyAction(KeyEvent e, boolean b) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            spaceship.setUp(b);
            System.out.println("up" + b);
        }
        if (code == KeyEvent.VK_DOWN){
            spaceship.setDown(b);
            System.out.println("down" + b);
        }
        if (code == KeyEvent.VK_LEFT){
            spaceship.setLeft(b);
            System.out.println("left" + b);
        }
        if (code == KeyEvent.VK_RIGHT){
            spaceship.setRight(b);
            System.out.println("right" + b);
        }
        // if (code == KeyEvent.VK_SPACE)
        //     spaceship.space();
    }

}