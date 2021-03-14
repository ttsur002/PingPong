/**
 *
 * @author takehirotsurumi
 */
import java.awt.Color;
import java.awt.Graphics;
public class Ball {

    private int x;
    private int y;
    private int radius;
    private int speedX; // Pixels per seconds
    private int speedY; // Pixels per seconds
    private int heightOfFrame;
    private int widthOfFrame;
    private Bar bar;

    public Ball(int startX, int startY, int radius, int heightOfFrame, int widthOfFrame, Bar bar) {
        this.x = startX;
        this.y = startY;
        this.radius = radius;
        this.heightOfFrame = heightOfFrame;
        this.widthOfFrame = widthOfFrame;
        speedX = 3;
        speedY = -3;
        this.bar = bar;
    }
    public int getX(){
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getRadius(){

        return this.radius;
    }


    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(getX(),getY(),getRadius(),getRadius());
    }

    public void move() {
        this.x += speedX;
        this.y += speedY;
        if (this.x <= 0 || this.x >= this.widthOfFrame) {
            speedX = speedX * -1;
        }
        if (this.y <= 0) {
            speedY = speedY * -1;
        }
        if (this.y >= this.heightOfFrame) {
            // Player loses
            speedX = 0;
            speedY = 0;
        }
    }
    public void reflect(){
        speedY = speedY * -1;
    }
}