import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 * 
 * @author John Bartels
 * This program will produce Rectangles at random positions in the window
 * The number of rectangles will initialize to five but can be altered by
 * the user by way of a slider.
 */

public class RectangleComponent extends JComponent //--- superclass is javax.swing.JComponent
{
	
	private static final int RECT_WIDTH = 40;
	private static final int RECT_HEIGHT = 30;
	private int numRects;
	private static ArrayList<Rectangle> list = new ArrayList<Rectangle>();

	public RectangleComponent(int nr)
	{
		numRects = nr;
		
		for (int i = 0; i < numRects; i++)
		{
			//define x
			int x = (int) (Math.random() * (RectangleFrame.FRAME_WIDTH - RECT_WIDTH - 20));

			//define y
			int y = (int) (Math.random() * (RectangleFrame.FRAME_HEIGHT - RECT_HEIGHT - 20));
			
			//add rectangle to list
			list.add(new Rectangle(x, y, RECT_WIDTH, RECT_HEIGHT));
			
			
		}
		
	}
	public static void changeRectangleNumber(int n)
	{
		int numberRectangles = n;
		if (numberRectangles == list.size())
		{
			return;
		}
		else if(numberRectangles > list.size())
		{
			int addedRectangles = numberRectangles - list.size();
			for (int i = 0; i < addedRectangles; i++)
			{
				//define x
				int x = (int) (Math.random() * (RectangleFrame.FRAME_WIDTH - RECT_WIDTH - 20));

				//define y
				int y = (int) (Math.random() * (RectangleFrame.FRAME_HEIGHT - RECT_HEIGHT - 40));
				
				//add rectangle to list
				list.add(new Rectangle(x, y, RECT_WIDTH, RECT_HEIGHT));
				
			}
			
		}
		else if(numberRectangles < list.size())
		{
			int removedRectangles = list.size() - numberRectangles;
			for (int i = 0; i < removedRectangles; i++)
			{
				list.remove(list.size()-1);
				
			}
		}
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		for (int i = 0; i < list.size(); i++)
		{
			g2.draw(list.get(i));
		}
	}
}

