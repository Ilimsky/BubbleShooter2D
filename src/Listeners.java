import java.awt.event.*;

/**
 * Created by IlimSarykbaev on 01.03.2018.
 */
public class Listeners implements KeyListener, MouseMotionListener, MouseListener  {

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP){
            Player.up = true;
        }if (key == KeyEvent.VK_DOWN){
            Player.down = true;
        }if (key == KeyEvent.VK_LEFT){
            Player.left = true;
        }if (key == KeyEvent.VK_RIGHT){
            Player.rigth = true;
        }if (key == KeyEvent.VK_SPACE) {
            Player.isFiring = true;
        }if (key == KeyEvent.VK_ESCAPE){
            GamePanel.state = GamePanel.STATES.MENU;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP){
            Player.up = false;
        }if (key == KeyEvent.VK_DOWN){
            Player.down = false;
        }if (key == KeyEvent.VK_LEFT){
            Player.left = false;
        }if (key == KeyEvent.VK_RIGHT){
            Player.rigth = false;
        }if (key == KeyEvent.VK_SPACE) {
            Player.isFiring = false;
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){
            GamePanel.player.isFiring = true;
            GamePanel.leftMouse = true;


        }
    }

    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 ){
            GamePanel.player.isFiring = false;
            GamePanel.leftMouse = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        GamePanel.mouseX = e.getX();
        GamePanel.mouseY = e.getY();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        GamePanel.mouseX = e.getX();
        GamePanel.mouseY = e.getY();
    }
}
