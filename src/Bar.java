
/**
 *
 * @author takehirotsurumi
 */
import java.awt.*;

public class Bar {

    private int x;
    private int y;
    private int width;
    private int height;
    private int widthOfFrame;

    public Bar(int x, int y, int width, int height, int widthOfFrame) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.widthOfFrame = widthOfFrame;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(getX(),getY(),getWidth(),getHeight());
    }

    public void move(int moveInX) {
        this.x += (moveInX );
        if (this.x <= 0) {
            this.x = 0;
        } else if (this.x >= (widthOfFrame - width)) {
            this.x = widthOfFrame - width;
        }
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }

}
