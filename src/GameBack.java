import java.awt.*;

/**
 * Created by IlimSarykbaev on 27.02.2018.
 */
public class GameBack {

    //Fields
    private Color color;

    //Constructor
    public GameBack(){
        color = Color.BLUE;
    }


    //Functions
    public void update(){

    }

    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillRect(0,0,GamePanel.WIDTH,GamePanel.HEIGHT);

    }
}
