package liveCoding;

import javax.swing.*;

public class MyViewer {

    private JFrame myFrame;

    public MyViewer(){
        this.myFrame = new JFrame();

    }
    public static void main(String[] args){
        MyViewer app = new MyViewer();
        MyComponent comp = new MyComponent();
        comp.paintComponent();
        app.runApp();
    }
    private void runApp(){
        int width = 800;
        int height = 600;
        int x =50;
        int y =100;
        this.myFrame.setSize(width,height);
        this.myFrame.setLocation(x,y);
        this.myFrame.setTitle("FDSA");
        this.myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.myFrame.setVisible(true);
    }

}
