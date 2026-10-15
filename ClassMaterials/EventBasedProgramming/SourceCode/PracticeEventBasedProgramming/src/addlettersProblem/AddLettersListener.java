package addlettersProblem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * A listener that uppercases a button when it's pressed
 */
public class AddLettersListener implements ActionListener {
    JButton button = new JButton();
    String type;
    JLabel stringToUpdate;

    public AddLettersListener(JButton b, String t, JLabel s) {
        this.type = t;
        this.stringToUpdate = s;
        this.button=b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.stringToUpdate.setText(this.stringToUpdate.getText()+this.type);
    }

}
