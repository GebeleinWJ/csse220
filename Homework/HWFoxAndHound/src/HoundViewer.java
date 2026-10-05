import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Draws a bunch of hounds, via the HoundComponent and Hound classes.
 *
 * @author Will Gebelein
 */
public class HoundViewer {
    public static final Dimension HoundSize = new Dimension(600, 800);

    /**
     * Constructs and displays the JFrame which displays Fox and Hound objects via a
     * FoxComponent object.
     *
     * @param args
     *            Command-line arguments, ignored here.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(HoundSize);
        frame.setTitle("I see a hound and a fox!");

        frame.add(new HoundComponent());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
