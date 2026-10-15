package addlettersProblem;

import capitalizeExample.CapitalizeListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddLettersViewer {

	public static void main(String[] args) {
		new AddLettersViewer();
	}
	
	public AddLettersViewer() {	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		String aOut = " ";
		JLabel out = new JLabel(aOut);
		// put your new JButtons, JLabels, etc here
		JButton b1 = new JButton("Add A");
		JButton b2 = new JButton("Add B");
		JButton b3 = new JButton("Add C");
		b1.addActionListener(new AddLettersListener(b1,"A",out));
		panel.add(b1);
		b2.addActionListener(new AddLettersListener(b2,"B",out));
		panel.add(b2);
		b3.addActionListener(new AddLettersListener(b3,"C",out));
		panel.add(b3);
		frame.add(panel, BorderLayout.CENTER);
		frame.add(out, BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
