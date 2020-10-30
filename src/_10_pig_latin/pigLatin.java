package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatin implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field = new JTextField(15);
	JTextField field2 = new JTextField(15);
	JButton button = new JButton();
	public void run() {
		frame.setVisible(true);
		panel.add(field);
		panel.add(button);
		panel.add(field2);
		button.setText("Translate");
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}
