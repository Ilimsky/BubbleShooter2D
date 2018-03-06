import java.awt.*;

/**
 * Created by IlimSarykbaev on 01.03.2018.
 */
public class Bullet {

    //Fields
    private double x,y;
    private double bulletDX;
    private double bulletDY;
    private double distX;
    private double distY;
    private double dist;


    private int r;
    private Color color;
    private double speed;

    //Constructor
    public Bullet(){
        x = GamePanel.player.getX();
        y = GamePanel.player.getY();
        r = 2;
        color = Color.WHITE;
        speed = 10;

        distX = GamePanel.mouseX - x;
        distY = GamePanel.mouseY - y;
        dist = Math.sqrt(distX * distX + distY * distY);

        bulletDX = distX/dist * speed;
        bulletDY = distY/dist * speed;

    }

    //Functions
    public double getX() {return x;}
    public double getY() {return y;}
    public int getR() {return r;}

    public boolean remove(){
        if (y < 0 || y > GamePanel.HEIGHT || x < 0 || x > GamePanel.WIDTH){
            return true;
        }
        return false;
    }


    public void update(){
        y += bulletDY;
        x += bulletDX;
    }

    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillOval((int)x,(int)y,r,r * 2);
    }


}
