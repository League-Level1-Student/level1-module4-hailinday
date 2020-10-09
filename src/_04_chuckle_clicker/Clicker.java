package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clicker implements ActionListener {
	public static void main(String[] args) {
		Clicker c = new Clicker();
		c.makeButtons();
		
	}
	
	public void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton joke = new JButton();
		JButton punchline = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		joke.setText("Joke");
		punchline.setText("Punchline");
		panel.add(joke);
		panel.add(punchline);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
