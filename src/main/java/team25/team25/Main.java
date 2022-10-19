package team25.team25;



import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {
	public static void main(String[] args) {
		
		
		JFrame Main_Frame = new JFrame("Frame");
		Main_Frame.setTitle("Ипотечный калькулятор для юридических лиц");
		Main_Frame.setBounds(500, 400, 650, 400);
		Main_Frame.setResizable(false);
	
		JPanel Main_Panel = new Panel();
		
		Main_Frame.add(Main_Panel);
		
		
	
		Main_Frame.setVisible(true);
		Main_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

