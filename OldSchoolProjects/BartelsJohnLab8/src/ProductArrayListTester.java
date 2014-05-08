import java.util.ArrayList;
public class ProductArrayListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> productList = new ArrayList<Product>();

		productList.add(new Product("TV", 1000, 200));
		productList.add(new Product("AC", 1200, 100));
		productList.add(new Product("Refrig", 1500, 150));

		for (int i = 0; i < productList.size(); i++)
		{
			Product temProduct = productList.get(i);
			System.out.println(temProduct.getName());
			System.out.println(temProduct.getPrice());
			System.out.println(temProduct.getWeight());
		}

		productList.add(1, new Product("Microwave", 600, 10));

		for (int i = 0; i < productList.size(); i++)
		{
			Product temProduct = productList.get(i);
			System.out.println(temProduct.getName());
			System.out.println(temProduct.getPrice());
			System.out.println(temProduct.getWeight());
		}

		productList.remove(0);

		for (int i = 0; i < productList.size(); i++)
		{
			Product temProduct = productList.get(i);
			System.out.println(temProduct.getName());
			System.out.println(temProduct.getPrice());
			System.out.println(temProduct.getWeight());
		}


	}

}
