import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class JohnBartelsLab3part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hxlly, Wyrld!";
		String greeting2 = greeting.replace("x", "o");
		String greeting3 = greeting2.replace("y", "e");
		String greeting4 = greeting.replace("y", "o");
		String greeting5 = greeting4.replace("x", "e");
		String greeting6 = greeting5.toLowerCase();
		String greeting7 = greeting5.toUpperCase();
		System.out.println(greeting3);
		System.out.println(greeting5);
		System.out.println(greeting6);
		System.out.println(greeting7);
		
		JOptionPane.showMessageDialog(null, greeting5);
		
		JFrame frame = new JFrame();
	      frame.setSize(300, 400);
	      frame.setTitle("An Alien Face");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      FaceComponent component = new FaceComponent();
	      frame.add(component);

	      frame.setVisible(true);

	}

}
