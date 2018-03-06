import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * Created by IlimSarykbaev on 04.03.2018.
 */

public class Menu {

    //Fields
    private int buttonWidth;
    private int buttonHeight;
    private Color color;
    private String s;
    private int transparance = 0;

    //Constructor
    public Menu(){
        buttonWidth = 120;
        buttonHeight = 60;
        color = Color.white;
        s = "Play";

    }
    //Functions

    public void update(){
        if (GamePanel.mouseX > GamePanel.WIDTH/2 - buttonWidth/2
                && GamePanel.mouseX < GamePanel.WIDTH/2 + buttonWidth/2
                && GamePanel.mouseY > GamePanel.HEIGHT/2 - buttonHeight/2
                && GamePanel.mouseY < GamePanel.HEIGHT/2 + buttonHeight/2){
            transparance = 60;
            if (GamePanel.leftMouse){
                GamePanel.state = GamePanel.STATES.PLAY;
            }
        } else {
            transparance = 0;
        }
    }

    public void draw(Graphics2D g){
        g.setColor(color);
        g.setStroke(new BasicStroke(3));
        g.drawRect(GamePanel.WIDTH/2 - buttonWidth/2, GamePanel.HEIGHT/2 - buttonHeight /2, buttonWidth, buttonHeight);
        g.setColor(new Color(255, 255,255, transparance));
        g.fillRect(GamePanel.WIDTH/2 - buttonWidth/2, GamePanel.HEIGHT/2 - buttonHeight /2, buttonWidth, buttonHeight);
        g.setStroke(new BasicStroke(1));
        g.setColor(color);
        g.setFont(new Font("consolas", Font.BOLD, 40));
        long length = (int) g.getFontMetrics().getStringBounds(s,g).getWidth();
        g.drawString(s, (int) (GamePanel.WIDTH/2 - length/2), (int) ((GamePanel.HEIGHT / 2) + (buttonHeight / 4)));
    }
}
