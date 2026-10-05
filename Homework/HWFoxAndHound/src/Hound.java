import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 * Class representing a hound, drawn as a rectangular face with triangular ears.
 *
 * @author Will Gebelein
 * <br>
 * **************************************************************************************
 * REQUIRED HELP CITATION
 *        Only used CSSE220 materials
 * **************************************************************************************
 */
public class Hound {
    private static final int width = 110;
    private static final int height = 160;
    private static final Color earColor = Color.BLACK;
    private int x;
    private int y;
    private Color color;

    public Hound(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public void drawOn(Graphics2D g2) {
        g2.translate(x, y);
        int[] xPoints = {0, width, width, 0};
        int[] yPoints = {0, 0, height, height};
        Polygon face = new Polygon(xPoints, yPoints, 4);
        g2.setColor(this.color);
        g2.fillPolygon(face);
        int[] lEarPointsX={0,0,-50};
        int[] lEarPointsY={0,height+20,height-10};
        int[] rEarPointsX={width,width,width+50};
        int[] rEarPointsY={0,height+20,height-10};
        g2.setColor(earColor);
        g2.fillPolygon(lEarPointsX,lEarPointsY,3);
        g2.fillPolygon(rEarPointsX,rEarPointsY,3);

    }
}
