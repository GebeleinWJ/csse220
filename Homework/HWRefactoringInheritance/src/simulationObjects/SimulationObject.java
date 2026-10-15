package simulationObjects;

import java.awt.*;
import java.awt.geom.Dimension2D;

public class SimulationObject {
    private int centerX, centerY, radius, velX, velY, moveSpeed;
    private Color color;
    private String type;

    public SimulationObject(int x, int y,String type) {
        this.centerX = x;
        this.centerY = y;
        this.velX = (int) (moveSpeed - Math.random() * moveSpeed * 2);
        this.velY = (int) (moveSpeed - Math.random() * moveSpeed * 2);
        this.type = type;


    }

    public void drawOn(Graphics2D g) {
        //avoid having to untranslate by mutating a copy of the graphics content
        g = (Graphics2D)g.create();
        g.setColor( this.color );
        g.translate(centerX-radius, centerY-radius);
        g.fillOval(0, 0, radius*2, radius*2);
    }

    public void update(Dimension2D dim) {
        centerX += velX;
        centerY += velY;
        if (centerX > dim.getWidth() || centerX < 0) {
            centerX = (int)Math.min( Math.max(centerX, 0), dim.getWidth());
            velX = -velX;
        }
        if (centerY > dim.getHeight() || centerY < 0) {
            velY = -velY;
            centerY = (int)Math.min( Math.max(centerY, 0), dim.getHeight());
        }
    }
    public boolean overlapsWith(SimulationObject other) {
        int xDiff =  centerX - other.centerX;
        int yDiff =  centerY - other.centerY;
        double distance = Math.sqrt(  xDiff*xDiff + yDiff * yDiff );
        return this.radius + other.radius >= distance;
    }

    //move in opposite direction of collision with other particle.
    public void bounce(SimulationObject other) {
        if(other.type==this.type){
            velX = this.centerX - other.centerX;
            velY = this.centerY - other.centerY;
            normalizeVelocity();
        }
    }

    // Make sure that velocity remains fixed and non-zero
    public void normalizeVelocity() {
        //move down, right if velocity is set to zero
        if (this.velX == 0 && this.velY == 0) {
            this.velX = 1;
            this.velY = 1;
        }
        //normalize vector
        double vectorLength = Math.sqrt(velX*velX + velY*velY);
        this.velX = (int)(this.velX / vectorLength * moveSpeed * 2);
        this.velY = (int)(this.velY / vectorLength * moveSpeed * 2);
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}