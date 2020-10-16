package _05_typing_tutor;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class typingTutor implements KeyListener {
	char currentLetter;
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		typingTutor tutor = new typingTutor();
		tutor.setup();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
		

	}

	
	private void setup() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		currentLetter = generateRandomLetter();
		frame.addKeyListener(this);
		frame.setVisible(true);
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setSize(100,100);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
		char userCharInput = arg0.getKeyChar();
		
		if (userCharInput == currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);

		} else {
			panel.setBackground(Color.RED);
		}
		
		
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
