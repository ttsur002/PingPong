
/**
 *
 * @author takehirotsurumi
 */
import java.awt.*;
import javax.swing.*;

public class PongFrame extends JPanel {

    private Ball ball;
    private Bar bar;
    private Bar barComputer;

    public PongFrame(int sizeX, int sizeY) {
        this.ball = new Ball(sizeX / 2, sizeY / 2, 20, sizeY, sizeX, bar);
        this.bar = new Bar(sizeX/2, sizeY-70, 100, 20, sizeX);
        barComputer = new Bar(sizeX / 2, 50, 100, 20, sizeX);
        this.addKeyListener(new BarMotionListener(bar));
    }

    @Override
    public void paintComponent(Graphics g) {
        this.bar.draw(g);
        this.ball.draw(g);
    }

    public void update() {
        this.ball.move();
        if (this.ball.getX() >= this.bar.getX() && this.ball.getX() + 10 <= this.bar.getX() + this.bar.getWidth()) {
            if (this.ball.getY() + 20 >= this.bar.getY()) {
                this.ball.reflect();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("PongGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PongFrame panel = new PongFrame(400,400);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.addKeyListener(new BarMotionListener(panel.bar));
        frame.setVisible(true);
        while (true) {
            panel.update();
            panel.repaint();
            Thread.sleep(20);
        }
    }
}