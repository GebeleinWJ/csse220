package ballStrikeCounter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *  A Tracker is the main application that demos a Baseball state tracker.
 * 
 * 
 *************************************************************************************** 
 *         REQUIRED HELP CITATION
 * 		"only used CSSE220 materials"
 ***************************************************************************************
 * @author Will Gebelein - gebelewj
 * @author Luke Mowery - mowerylr
 *************************************************************************************** 
 */

public class Tracker {
	private JLabel label = new JLabel();

	// Call this to update the text on the label.
	public void updateLabel(int numBalls, int numStrikes) {
		if(numBalls>3||numStrikes>2){
			balls=0;
			strikes=0;
			numBalls=0;
			numStrikes=0;
		}
		this.label.setText("<html>Balls: " + numBalls + "<br />Strikes: " + numStrikes + "</HTML>");
	}
	public int balls = 0;
	public int strikes = 0;
	public static void main(String[] args) {
		new Tracker();
	}

	public Tracker() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize( new Dimension(160, 100));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.add(label, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);

		JButton ball = new JButton("Ball");
		ball.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				balls++;
				updateLabel(balls,strikes);
			} });
		panel.add(ball);
		JButton strike = new JButton("Strike");
		strike.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				strikes++;
				updateLabel(balls,strikes);
			} });
		panel.add(strike);
		updateLabel(0,0);

		// The following line is given to show you how to use the given method:

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
