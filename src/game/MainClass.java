package game;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake");
		frame.setContentPane(new GamePannel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.pack();
		
		frame.setPreferredSize(new Dimension(GamePannel.WIDTH, GamePannel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
