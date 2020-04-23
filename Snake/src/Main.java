import java.awt.Frame;

import javax.swing.JFrame;

public class Main {
	
	public Main() {
		
		JFrame frame = new JFrame();
		Gameboard gamepanel = new Gameboard();
		
		frame.add(gamepanel); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKE");
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
			
		}
		public static void main(String[] args) {
			
			new Main();
			

	}

}
