import javax.swing.JFrame;

import view.DiceGamePanel;

public class Main 
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(400, 100);

        var diceGamePanel = new DiceGamePanel(window);
        diceGamePanel.init();

        window.pack();
        window.setVisible(true);
    }
}