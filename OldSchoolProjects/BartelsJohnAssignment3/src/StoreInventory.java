import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class StoreInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize variables or objects that are used throughout program
		int userChoice = 0;
		String newProductName = "";
		double newProductPrice = 0.0;
		double newProductWeight = 0.0;
		double taxRate = 0.07;
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Product> checkoutList = new ArrayList<Product>();
		
		
		
		// The first Do loop is used to that after completing each task the user
		// will return to Main Menu for the Program and can complete other tasks
		do
		{
			// initializes System.in file for Scanner class
			Scanner in = new Scanner(System.in);
			
			// Prints menu to screen for user to choose from and applies userInput to variable
			System.out.println();
			System.out.println("Please select an option from the following menu:  ");
			System.out.println();
			System.out.println("Enter 1 for Inventory Module");
			System.out.println("Enter 2 for Sales Department Module");
			System.out.println("Enter 3 for Shopping Cart Module");
			System.out.println("Enter 4 to view our full Product List.");
			System.out.println("Enter 5 to Exit the Store Product Program");
			userChoice = in.nextInt();
			
			// uses if then statement to direct menu option to part of code that is applicable
			if (userChoice == 1)
			{
				// Prints Sub-Menu to Screen for user to choose from and supplies userInput to variable
				int userChoiceSub1 = 0;
				do
				{
				System.out.println();
				System.out.println("You Have Selected the Inventory Module.");
				System.out.println();
				System.out.println("Please select an option from the following menu:  ");
				System.out.println("Enter 1 to Add Item to Inventory");
				System.out.println("Enter 2 to Remove Item from Inventory");
				System.out.println("Enter 3 to Change Product Information");
				System.out.println("Enter 4 to view our full Product List.");
				System.out.println("Enter 5 to Exit the Inventory Module");
				userChoiceSub1 = in.nextInt();
					
					// used if/then statement to control what code is used according to userInput
					
					
					if (userChoiceSub1 == 1)
					{
						// SubMenu Item one Will Allow User to Add Products to Inventory
						
						int numberOfProducts = 0;
						int loopCounter = 0;
						System.out.println("How Many Products Would You Like to Add?");
						numberOfProducts = in.nextInt();
						
							do
							{
								System.out.print("Please input the new Product name: ");
								newProductName = in.next();
								System.out.println();
								System.out.print("Please input the " + newProductName + "'s Price: ");
								newProductPrice = in.nextDouble();
								System.out.println();
								System.out.print("Please input the " + newProductName + "'s Weight: ");
								newProductWeight = in.nextDouble();
								System.out.println();
								productList.add(new Product(newProductName, newProductPrice, newProductWeight));
								loopCounter++;
							}
							while (loopCounter < numberOfProducts);
							
							
					}
				
					
					else if (userChoiceSub1 == 2)
					{
						//Inventory Sub-Menu Item two will Print Product List and allow the user to Remove Products from Inventory.
						
						
						int loopCounterSub1 = 0;
						String removeItem = "";
						String removeCheck = "";
						boolean removeOption = false;
						do
						{
								System.out.println("Are You Sure You Want to REMOVE a Product from Inventory? (Y/N)");
								removeCheck = in.next();
								if (removeCheck.equalsIgnoreCase("y"))
								{
									if (productList.size() == 0)
									{
										removeOption = false;
										System.out.println("There are currently no Products in Inventory.");
										System.out.println();
									}
									else
									{
										removeOption = true;
									
										System.out.println("Current List of Products: ");
										int listnumber = productList.size();
										int x = 0;
										do
										{
								
											Product first = productList.get(x);
											System.out.println("Product Name: " + first.getProductName() + " Product Price: " + first.getProductPrice()+ " Product Weight: " + first.getProductWeight());
										
											x++;
										}
										while (x < listnumber);
									
										System.out.println("You Have Selected the Item Removal Module.");
										System.out.println("Please Enter the Product Name to Remove: ");
										removeItem = in.next();
									
									
									
										int i = 0;
										do
										{
											Product tempProduct = new Product();
											tempProduct = productList.get(i);
										
											if (removeItem.equalsIgnoreCase(tempProduct.getProductName()))
											{
												System.out.println("Product Name: " + tempProduct.getProductName() + " Product Price: " + tempProduct.getProductPrice() + " Product Weight: " + tempProduct.getProductWeight());
												productList.remove(i);
												System.out.println("The item has been Removed.");
												i++;
												loopCounterSub1++;
											}
											else
													i++;
									
										}
										while (i < productList.size());
									}
								}
								else removeOption = false;
								
								
						}
						while (removeOption == true);
						
					}
					else if (userChoiceSub1 == 3)
					{
					
						// Inventory Sub-Menu Item three will allow the user to Change Product Inventory Information.
						
						System.out.println("Current List of Products: ");
						int listnumber = productList.size();
						int x = 0;
						do
						{
					
							Product first = productList.get(x);
							System.out.println("Product Name: " + first.getProductName() + " Product Price: " + first.getProductPrice()+ " Product Weight: " + first.getProductWeight());
							
							x++;
						}
						while (x < listnumber);
						
						int numberOfProductsSub3 = 0;
						int loopCounterSub3 = 0;
						String nameToChange = "";
						
						System.out.println("How Many Products Would you Like to Change?");
						numberOfProductsSub3 = in.nextInt();
							do
							{
								System.out.println("You Have Selected the Product Edit Module.");
								System.out.println("Please Enter the Product Name to Change: ");
								nameToChange = in.next();
								
								
								int i = 0;
								do
								{
									Product tempProduct = new Product();
									tempProduct = productList.get(i);
									
										if (nameToChange.equalsIgnoreCase(tempProduct.getProductName()))
										{
											// allows user to dynamically choose which attribute to change
											int attributeChoice =0;
											System.out.println("Please Select an Attribute to Change:");
											System.out.println("Enter 1 to Change Product Name.");
											System.out.println("Enter 2 to Change Product Price.");
											System.out.println("Enter 3 to Change Product Weight.");
											System.out.println("Enter 4 to Go Back");
											attributeChoice = in.nextInt();
										
											// allows user to change Product Name
											if (attributeChoice == 1)
											{
												System.out.print("Please input the" + tempProduct.getProductName() + "'s new Product name: ");
												newProductName = in.next();
												tempProduct.changeProductName(newProductName);
												productList.set(i, tempProduct);
												loopCounterSub3++;
												i++;
											}
											// allows user to change Product Price
											else if (attributeChoice == 2)
											{
												System.out.print("Please input the " + tempProduct.getProductName() + "'s Price: ");
												newProductPrice = in.nextDouble();
												tempProduct.changeProductPrice(newProductPrice);
												productList.set(i, tempProduct);
												loopCounterSub3++;
												i++;
											}
											// allows user to change Product Weight
											else if (attributeChoice == 3)
											{
											
												System.out.print("Please input the " + tempProduct.getProductName() + "'s Weight: ");
												newProductWeight = in.nextDouble();
												tempProduct.changeProductWeight(newProductWeight);
												productList.set(i, tempProduct);
												loopCounterSub3++;
												i++;
											
											}
											else System.out.println("You have Decided NOT to Change Information for Product.");
												loopCounterSub3++;
												i++;
											
										}
										else
											System.out.println("You have entered an Item that is not in our Inventory.");
											i++;
								}
								while (i < productList.size());
								
								
								
							}
							while (loopCounterSub3 <= numberOfProductsSub3);
						
						
					}
					else if (userChoiceSub1 == 4)
					{
						// Inventory Sub-Menu item four will allow user to view all products
						int i = 0;
						do
						{
							if (productList.size() == 0)
							{
								System.out.println("There are Currently no Items in Inventory.");
							}
							else
							{
								int listnumber = productList.size();
								int x = 0;
								do
								{
					
									Product first = productList.get(x);
									System.out.println("Product Name: " + first.getProductName() + " Product Price: " + first.getProductPrice()+ " Product Weight: " + first.getProductWeight());
							
									x++;
									i++;
								}
								while (x < listnumber);
							}
						}
						while (i < productList.size());
						
					}
					else
					{
						
						System.out.println("Thank you for Using the Inventory Module.");
						
					}
			}while (userChoiceSub1 != 5);
			
			}
		
			// Main Menu Option two allows Store Employee to Search for Product Information
			else if (userChoice == 2)
			{
				boolean searchOrNot = false;
				do
				{
					if (productList.size() == 0)
						System.out.println("There are Currently no Products in Inventory.");
					else
					{
				
						String custSearch = "";
						System.out.println();
						System.out.println("You Have Selected the Sales Deparment Module.");
						System.out.println();
						System.out.println("Please Enter the Product Name to Search For: ");
						custSearch = in.next();
						String continueSearching = "";
				
						int i = 0;
						do
						{
							Product tempProduct = new Product();
							tempProduct = productList.get(i);
							
								if (custSearch.equalsIgnoreCase(tempProduct.getProductName()))
								{
									System.out.println("Product Name: " + tempProduct.getProductName() + " Product Price: " + tempProduct.getProductPrice() + " Product Weight: " + tempProduct.getProductWeight());
									i++;
									System.out.println("Would you like to continue Searching for Products? (Y/N):");
									continueSearching = in.next();
									if (continueSearching.equalsIgnoreCase("y"))
										searchOrNot = true;
										else searchOrNot = false;
								}
								else
										i++;
						}
						while (i < productList.size());
					
				}
				
				}
				while (searchOrNot == true);
				
			}
		
			// Main menu Option three will start the Shopping Cart Module
			else if (userChoice == 3)
			{
				
					// Prints Sub-Menu to Screen for user to choose from and supplies userInput to variable
					int userChoiceSub3 = 0;
					do
					{
					System.out.println();
					System.out.println("You Have Selected the Shopping Cart Module.");
					System.out.println();
					System.out.println("Please select an option from the following menu:  ");
					System.out.println("Enter 1 to Add Item(s) to Shopping Cart.");
					System.out.println("Enter 2 to Remove Item(s) from Shoppint Cart.");
					System.out.println("Enter 3 to View Product(s) in Shopping Cart.");
					System.out.println("Enter 4 to view our full Store Product List.");
					System.out.println("Enter 5 to Proceed to Checkout with the items in your Shopping Cart.");
					System.out.println("Enter 6 to Exit the Customer Checkout Module.");
					userChoiceSub3 = in.nextInt();
						
						// used if/then statement to control what code is used according to userInput
						
						if (userChoiceSub3 == 1)
						{
							// Shopping Cart SubMenu Item one Will Allow Customer to Add Products to Shopping Cart.
							int loopCounter = 0;
							String addItemToCart = "";
							boolean continueShopping = true;
							String userContinue = "";
							
							do
							{
									System.out.println("Continue to Add items to Cart? (Y/N): ");
									userContinue = in.next();
									
									if (userContinue.equalsIgnoreCase("y"))
									{
										System.out.println("You Have Selected the Shopping Cart Item Add Module.");
										System.out.println("Please Enter the Product Name to Add: ");
										addItemToCart = in.next();
									
									
									
										int i = 0;
										do
										{
											Product tempProduct = new Product();
											tempProduct = productList.get(i);
										
											if (addItemToCart.equalsIgnoreCase(tempProduct.getProductName()))
											{
												System.out.println("Product Name: " + tempProduct.getProductName() + " Product Price: " + tempProduct.getProductPrice() + " Product Weight: " + tempProduct.getProductWeight());
												checkoutList.add(tempProduct);
												System.out.println("The item has been Added to your cart.");
												i++;
												loopCounter++;
											}
											else
													i++;
										}
										while (i < productList.size());
									}
									else
										continueShopping = false;
							}
							while (continueShopping == true);
								
								System.out.print("Would you like to Proceed to Checkout? (Y/N):");
								String proceedToCheckout = "";
								proceedToCheckout = in.next();
								if (proceedToCheckout.equalsIgnoreCase("y"))
								{
									
									int i = 0;
									double transactionSubtotal = 0;
									double totalWeight = 0;
									
									do
									{
										Product tempProduct = new Product();
										tempProduct = checkoutList.get(i);
										System.out.println("Product Name: " + tempProduct.getProductName() + " Product Price:" + tempProduct.getProductPrice() + " Product Weight: " + tempProduct.getProductWeight());
										transactionSubtotal = transactionSubtotal + tempProduct.getProductPrice();
										totalWeight = totalWeight + tempProduct.getProductWeight();
										i++;
									}
									while (i < checkoutList.size());
									
									System.out.println();
									System.out.println("Subtotal: " + transactionSubtotal);
									double taxAmount = transactionSubtotal * taxRate;
									System.out.println("     Tax:  " + taxAmount);
									double transactionTotal = transactionSubtotal + taxAmount;
									System.out.println("   Total: " + transactionTotal + " Total Weight: " + totalWeight);
									System.out.println();
									
								}
								else
									System.out.println("You have chosen to continue shopping.");
						}
					
						
						else if (userChoiceSub3 == 2)
						{
							//Shopping Cart Sub-Menu Item two will allow the user to Remove Products from Inventory.
							int loopCounterSub1 = 0;
							String removeItem = "";
							String removeCheck = "";
							boolean removeOption = false;
							do
							{
									System.out.println("Are You Sure You Want to REMOVE a Product from Your Shopping Cart? (Y/N)");
									removeCheck = in.next();
									if (removeCheck.equalsIgnoreCase("y"))
									{
										if (checkoutList.size() == 0)
										{
											removeOption = false;
											System.out.println("There are currently no Items in Your Shopping Cart.");
											System.out.println();
										}
											else
											{
												removeOption = true;
							
												System.out.println("You Have Selected the Item Removal Module.");
												System.out.println("Please Enter the Product Name to Remove: ");
												removeItem = in.next();
									
									
									
												int i = 0;
												do
												{
													Product tempProduct = new Product();
													tempProduct = checkoutList.get(i);
										
														if (removeItem.equalsIgnoreCase(tempProduct.getProductName()))
														{
															System.out.println("Product Name: " + tempProduct.getProductName() + " Product Price: " + tempProduct.getProductPrice() + " Product Weight: " + tempProduct.getProductWeight());
															checkoutList.remove(i);
															System.out.println("The item has been Removed.");
															loopCounterSub1++;
															i++;
														}
														else
															i++;
												}
												while (i < checkoutList.size());
											}
											}
									
									else removeOption = true;
									}
								while (removeOption == true);
						}
						else if (userChoiceSub3 == 3)
						{
						
							// Shopping Cart Sub-Menu Item three will allow the user to View all Products in Shopping Cart.
							int i = 0;
							do
							{
								if (checkoutList.size() == 0)
								{
									//printList = false;
									System.out.println("There are Currently no Items in Your Shopping Cart.");
								}
								else
								{
									//printList = true;
									int listnumber = checkoutList.size();
									int x = 0;
									do
									{
						
										Product first = checkoutList.get(x);
										System.out.println("Product Name: " + first.getProductName() + " Product Price: " + first.getProductPrice()+ " Product Weight: " + first.getProductWeight());
								
										x++;
										i++;
									}
									while (x < listnumber);
								}
							}
							while (i < checkoutList.size());
							
						}
						else if (userChoiceSub3 == 4)
						{
							// Shopping Cart Sub-Menu item four will allow user to view all Store products
							int i = 0;
							do
							{
								if (productList.size() == 0)
								{
									//printList = false;
									System.out.println("There are Currently no Items in Inventory.");
								}
								else
								{
									//printList = true;
									int listnumber = productList.size();
									int x = 0;
									do
									{
						
										Product first = productList.get(x);
										System.out.println("Product Name: " + first.getProductName() + " Product Price: " + first.getProductPrice()+ " Product Weight: " + first.getProductWeight());
								
										x++;
										i++;
									}
									while (x < listnumber);
								}
							}
							while (i < productList.size());
							
							
						}
						else if (userChoiceSub3 == 5)
						{
							// Customer Checkout menu item five will allow the customer to purchase items in shopping cart.
							if (checkoutList.size() == 0)
								System.out.println("There are no items in your cart. Please add an item.");
							else
							{
							
								int i = 0;
								double transactionSubtotal = 0;
								double totalWeight = 0;
							
								do
								{
									Product tempProduct = new Product();
									tempProduct = checkoutList.get(i);
									System.out.println("Product Name: " + tempProduct.getProductName() + " Product Price:" + tempProduct.getProductPrice() + " Product Weight: " + tempProduct.getProductWeight());
									transactionSubtotal = transactionSubtotal + tempProduct.getProductPrice();
									totalWeight = totalWeight + tempProduct.getProductWeight();
									i++;
								}
								while (i < checkoutList.size());
							
								System.out.println();
								System.out.println("Subtotal: " + transactionSubtotal);
								double taxAmount = transactionSubtotal * taxRate;
								System.out.println("     Tax:  " + taxAmount);
								double transactionTotal = transactionSubtotal + taxAmount;
								System.out.println("   Total: " + transactionTotal + " Total Weight: " + totalWeight);
								System.out.println();
							}
						}
						else
						{
							
							System.out.println("Thank you for Using the Customer Checkout Module.");
							
						}
					}while (userChoiceSub3 !=6);
			}
			// Main Menu option four allows user to view all Products in Inventory
			else if (userChoice == 4)
			{
				//boolean printList = true;
				int i = 0;
				do
				{
					if (productList.size() == 0)
					{
						//printList = false;
						System.out.println("There are Currently no Items in Inventory.");
					}
					else
					{
						//printList = true;
						int listnumber = productList.size();
						int x = 0;
						do
						{
			
							Product first = productList.get(x);
							System.out.println("Product Name: " + first.getProductName() + " Product Price: " + first.getProductPrice()+ " Product Weight: " + first.getProductWeight());
					
							x++;
							i++;
						}
						while (x < listnumber);
					}
				}
				while (i < productList.size());
			}
			else 
				System.out.println("Thank you For Using the Store Product Program");
		
		
		}while (userChoice != 5);
		
	}

}
