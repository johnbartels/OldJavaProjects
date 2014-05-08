import java.util.Scanner;
import javax.swing.JFrame;


public class RectangleViewer
{
	public static final int FRAME_WIDTH = 400;
	public static final int FRAME_HEIGHT = 600;

	public static void main(String[] args)
	{
		RectangleFrame frame = new RectangleFrame();
		//Scanner in = new Scanner(System.in);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Rectangle Viewer");
		//createSliderPanel();
		//System.out.println("Please enter the Number of Rectangles: ");
		//int userRectangles = in.nextInt();
		//JComponent rects = new RectangleComponent(RectangleComponent.sliderValue());
		frame.setVisible(true);
	}
}

