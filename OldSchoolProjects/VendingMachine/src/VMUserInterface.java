/**
 * 
 * @author Johnny
 *	Specification:  This program simulates a vending machine. Products
 *  can be purchased by inserting coins with a value at least equal to 
 *  the cost of the product.  A user selects a product from a list of 
 *  available products, adds coins, and either gets the product or gets
 *  the coins returned if insufficient money was supplied or if the 
 *  product is sold out.  The machine does not give change if too much 
 *  money was added.  Products can be restocked and money removed by 
 *  an operator.
 *  
 *  Classes:  VendingMachine, Product, Coin, User, Operator, ProductList, Bin (location of object in vending machine, as well as quantity)
 *  
 *  Product:  
 *  	Responsibilities: 
 *  		1.  Store a name and a cost
 *  	Collaborators:
 *  		
 *  Bin:
 *  	Responsibilities:
 *  		1.  Keeps track of the product stored in it
 *  		2.  Keeps track of quantity of product
 *  		3.  Stores its own location (number)(product location number)
 *  	Collaborators:
 *  		1.  Products - get cost of item
 *  		2.  Operator(?) - quantity reduction or increase
 *  
 *  VendingMachine:
 *  	Responsibilities:
 *  		1.  Maintain a list of products and their Bin Numbers
 *  		2.  Keep track of value of coins entered
 *  		3.  Retrieve an item from the user selected bin and dispense the item
 *  		4.  Keep a transaction log -- counter and time of transaction(possible future enhancement)
 *  	Collaborators:
 *  		1.  Bin
 *  		2.  Product (possible collaborators)
 *  		3.  ProductList
 *  		4.  coin (possible collaborators)
 *  		5.  VMUserInterface (possible collaborator)
 *  
 *  VMUserInterface:
 *  	Responsibilities:
 *  		1.  Greet user and Display a list of Menu Options  choose a product, enter operator mode, deposit coin
 *  		2.  Get user/operator input
 *  		3.  interpret the input
 *  		4.  initiate appropriate response to user operator input
 *  		5.  Display current coin amount
 *  
 *  Unassigned Responsibilities:
 *  		1.  Set Product Price.
 *  		
 *  
 *  
 */
public class VMUserInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
