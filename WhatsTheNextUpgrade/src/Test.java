import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Test extends JFrame
{

    private static JPanel createPanel(Point location, JLabel image) {
        final JPanel panel = new JPanel(new SpringLayout());
        panel.add(image);
        panel.setOpaque(false);
//        panel.setEnabled(enabled);
//        panel.setSize(new Dimension(200, 200));
        panel.setBounds(location.x, location.y, panel.getWidth(), panel.getHeight());
        panel.setLocation(location);
        return panel;
    }

    public Test()
    {
        setSize(1600, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Test Game");
        setResizable(false);

        JPanel mainPanel = new JPanel();

        JLabel imgLabel = new JLabel(new ImageIcon("H:\\AP Comp. Sci\\Game\\burger.png"));
        JLabel imgs = new JLabel(new ImageIcon("H:\\two-cute-cats.jpeg"));

        JPanel test = createPanel(new Point(100, 600), imgLabel);
        JPanel background = createPanel(new Point(0, 0), imgs);


        JPanel overlay = new JPanel();
        overlay.setLayout( new OverlayLayout(overlay) );
        overlay.add(test); // add transparent panel first
        overlay.add(background);
//        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(overlay);



        add(mainPanel);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Test();
    }
}
