package liveCoding;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MyComponent extends JComponent {



    protected void paintComponent(Graphics g){
        drawTranslateRotate(g);



    }
    private void drawTranslateRotate(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(150,300,150,40);
        g2d.fill(rect);
        int xOffset = 200;
        int yOffset = 0;
        g2d.translate(xOffset,yOffset);
        g2d.fill(rect);
        g2d.rotate(30*Math.PI/180);
        g2d.fill(rect);
    }
}
