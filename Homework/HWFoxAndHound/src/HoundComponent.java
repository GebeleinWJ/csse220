import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Draws a Hound and a Fox on a graphics area.
 *
 * @author Will Gebelein
 * <br>
 * **************************************************************************************
 * REQUIRED HELP CITATION
 *        Only used CSSE220 materials
 * **************************************************************************************
 */
public class HoundComponent extends JComponent{
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        Graphics2D graphics2 = (Graphics2D) graphics;
        graphics2.setColor(new Color(180,180,255));
        graphics2.fillRect(0,0,600,800);

        Color houndingBrown = new Color(124, 71, 0);
        Hound hound1 = new Hound(150, 150, houndingBrown);
        hound1.drawOn(graphics2);
        Color growlingGray = new Color(35,35,35);
        Fox fox1 = new Fox(200,450,growlingGray); // He is gray for an amazing reason
        fox1.drawOn(graphics2);

    }
}
