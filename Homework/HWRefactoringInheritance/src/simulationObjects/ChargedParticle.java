package simulationObjects;

import java.awt.*;
import java.util.Random;

public class ChargedParticle extends Particle{
    private Color innerColor;
    private Color midColor;
    private Color outerColor;
    public ChargedParticle(int x,int y){
        super(x,y);
        Random r = new Random();
        this.innerColor = new Color( r.nextInt(255),  r.nextInt(255),  r.nextInt(255) );
        this.midColor = new Color( r.nextInt(255),  r.nextInt(255),  r.nextInt(255) );
        this.outerColor = new Color( r.nextInt(255),  r.nextInt(255),  r.nextInt(255) );
    }
    public void drawOn(Graphics2D g) {
        //avoid having to untranslate by mutating a copy of the graphics content
        g = (Graphics2D)g.create();
        g.setColor( this.outerColor );
        g.translate(super.getCenterX()-super.getRadius(), super.getCenterY()-super.getRadius());
        g.fillOval(0, 0, super.getRadius()*2, super.getRadius()*2);
        g.setColor( this.midColor );
        g.translate(super.getRadius()/2, super.getRadius()/2);
        g.fillOval(0, 0, super.getRadius(), super.getRadius());
        g.setColor( this.innerColor );
        g.translate(super.getRadius()/4, super.getRadius()/4);
        g.fillOval(0, 0, super.getRadius()/2, super.getRadius()/2);
    }
    public void bounce(Particle other) {
        Random r = new Random();
        this.innerColor = new Color( r.nextInt(255),  r.nextInt(255),  r.nextInt(255) );
        this.midColor = new Color( r.nextInt(255),  r.nextInt(255),  r.nextInt(255) );
        this.outerColor = new Color( r.nextInt(255),  r.nextInt(255),  r.nextInt(255) );
        super.bounce(other);

    }
}
