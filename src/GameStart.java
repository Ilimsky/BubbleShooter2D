import javax.swing.*;

/**
 * Created by IlimSarykbaev on 26.02.2018.
 */
public class GameStart {
    public static void main(String[] args) {
        GamePanel panel = new GamePanel();
        JFrame startFrame = new JFrame("BubbleShooter");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startFrame.setContentPane(panel);
        startFrame.pack();
        startFrame.setLocationRelativeTo(null);
        startFrame.setVisible(true);
        panel.start();

    }
}
