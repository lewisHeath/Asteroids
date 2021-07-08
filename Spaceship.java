import java.awt.*;

public class Spaceship extends Rectangle {
    private double speed;
    private Image image;
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    public Spaceship(double x, double y, double w, double h, String col){
        super(x, y, w, h, col);
        // image = new Image("images/spaceship.png");
        up = false;
        down = false;
        left = false;
        right = false;
    }
    
    public void up(){
        //formula to move the ship
        yPosition -= 4;
    }
    public void right(){
        xPosition += 4;
    }
    public void down(){
        yPosition += 4;
    }
    public void left(){
        xPosition -= 4;
    }

    public void move(){
        if(up) up();
        if(down) down();
        if(left) left();
        if(right) right();
    }

    public void setUp(boolean b){
        up = b;
    }
    
    public void setDown(boolean b) {
        down = b;
    }
    
    public void setLeft(boolean b) {
        left = b;
    }
    
    public void setRight(boolean b) {
        right = b;
    }
    
}
