
/**
 *
 * @author takehirotsurumi
 */
import java.awt.event.*;
import java.awt.*;

public class BarMotionListener implements KeyListener {

    private Bar bar;
    int formerX;

    public BarMotionListener(Bar bar) {
        this.bar = bar;
    }


    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode()==39){
            bar.move(5);
        }
        else if(e.getKeyCode()==37){
            bar.move(-5);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==39){
            bar.move(20);
        }
        else if(e.getKeyCode()==37){
            bar.move(-20);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}