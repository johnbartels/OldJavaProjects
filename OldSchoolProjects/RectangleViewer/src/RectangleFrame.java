import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RectangleFrame extends JFrame
{
	public static final int FRAME_WIDTH = 400;
	public static final int FRAME_HEIGHT = 600;
	private JSlider numberSlider;
	private JPanel rectanglePanel;
	private int sliderPanelHeight;
	
	public RectangleFrame()
	{
		int numbRectangles = 5;
		rectanglePanel = new JPanel();
		rectanglePanel.setSize(FRAME_WIDTH, FRAME_HEIGHT - sliderPanelHeight);
		add(rectanglePanel, BorderLayout.NORTH);
		createSliderPanel();
		setRectangleNumber();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	public void createSliderPanel()
	{
		
		class RectListener implements ChangeListener
		{
			public void stateChanged(ChangeEvent event)
			{
				int numbRectangles = numberSlider.getValue();
				RectangleComponent.changeRectangleNumber(numbRectangles);
				repaint();
			}
		}
			
			ChangeListener listener = new RectListener();
			numberSlider = new JSlider(0, 50, 5);
			numberSlider.addChangeListener(listener);
			JPanel sliderPanel = new JPanel();
			sliderPanel.setLayout(new GridLayout(1, 2));
			sliderPanel.add(new JLabel("Number of Rectangles: "));
			sliderPanel.add(numberSlider);
			sliderPanelHeight = sliderPanel.getHeight();
			add(sliderPanel, BorderLayout.SOUTH);
	}	
	public void setRectangleNumber()
	{
		int numbRectangles = 5;
		add(new RectangleComponent(numbRectangles));
		
	}
}
