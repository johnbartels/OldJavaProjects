import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.ArrayList;

public class InventoryFrame extends JFrame
{
	public InventoryFrame()
	{
		resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
		resultArea.setEditable(false);
		
		//Use Helper Methods
		createNameField();
		createPriceField();
		createWeightField();
		createButton();
		createListButton();
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	private void createNameField()
	{
		nameLabel = new JLabel("Product Name: ");
		final int FIELD_WIDTH = 20;
		nameField = new JTextField(FIELD_WIDTH);
		nameField.setText("Enter Name");
		System.out.println();
		
	}
	private void createPriceField()
	{
		priceLabel = new JLabel("Product Price: ");
		final int FIELD_WIDTH = 20;
		priceField = new JTextField(FIELD_WIDTH);
		priceField.setText("Enter Price");
	}
	private void createWeightField()
	{
		weightLabel = new JLabel("Product Weight: ");
		final int FIELD_WIDTH = 20;
		weightField = new JTextField(FIELD_WIDTH);
		weightField.setText("Enter Weight");
	}
	private void createButton()
	{
		button = new JButton("Add Product");
		
		class AddInterestListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent event)
			{
				String name = nameField.getText();
				double weight = Double.parseDouble(weightField.getText());
				double price = Double.parseDouble(priceField.getText());
				Product tempProduct = new Product(name, price, weight);
				productList.add(tempProduct);
				resultArea.append("The " + tempProduct.getProductName() + " has been added." + "\n");
				
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
	}
	
	private void createListButton()
	{
		button2 = new JButton("List All Products");
		
		class createListListener implements ActionListener
		{
	
			public void actionPerformed(ActionEvent event)
			{
				int i = 0;
				
				do
				{
					Product tempProduct = productList.get(i);
					System.out.println("Product Name: " + tempProduct.getProductName() + " Product Price: " + tempProduct.getProductPrice() + " Product Weight: " + tempProduct.getProductWeight());
					resultArea.append("Name: " + tempProduct.getProductName() + " Price: " + tempProduct.getProductPrice() + " Weight: " + tempProduct.getProductWeight());
					resultArea.append("\n");
					System.out.println();
					i++;
				}
				while (i < productList.size());
				
			}
		}
		ActionListener listener2 = new createListListener();
		button2.addActionListener(listener2);
	}
	
	private void createPanel()
	{
		panel = new JPanel();
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(priceLabel);
		panel.add(priceField);
		panel.add(weightLabel);
		panel.add(weightField);
		panel.add(button);
		panel.add(button2);
		JScrollPane scrollPane = new JScrollPane(resultArea);
		panel.add(scrollPane);
		add(panel);
	}
	private JLabel nameLabel;
	private JLabel priceLabel;
	private JLabel weightLabel;
	private JTextField nameField;
	private JTextField priceField;
	private JTextField weightField;
	private JButton button;
	private JButton button2;
	private JTextArea resultArea;
	private JPanel panel;
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 275;
	
	private static final int AREA_ROWS = 10;
	private static final int AREA_COLUMNS = 30;
	
	ArrayList<Product> productList = new ArrayList<Product>();
	
}
