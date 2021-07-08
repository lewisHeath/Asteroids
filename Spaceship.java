import java.awt.*;

public class Spaceship extends Rectangle {
    private double speed;
    private Image image;
    public Spaceship(double x, double y, double w, double h, String col){
        super(x, y, w, h, col);
        // image = new Image("images/spaceship.png");
    }
    
    public void move(){
        //formula to move the ship
        yPosition -= 4;
    }

}
