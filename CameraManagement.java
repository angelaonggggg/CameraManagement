import java.util.Scanner;

class CameraManagement
{
	private static final String LINE = "-----------------------------------------------------";
	public static void main (String[]args)
	{
		// Create a Scanner class object
        Scanner input = new Scanner (System.in);

		// Declare variables
		String cameraA;
		String cameraB;
		String cameraC;
		String address;
		String postalCode;
		String country;

		// Read three cameras for online purchase
		System.out.println ("Welcome to cameras online service");
		System.out.println ("-----------------------------");
		System.out.println ("Enter three cameras to be sold");
		System.out.print ("1. ");
		cameraA = input.nextLine();
		System.out.print ("2. ");
		cameraB = input.nextLine();
		System.out.print ("3. ");
		cameraC = input.nextLine();
				
		// Read delivery info
		System.out.println ();
		System.out.println ("Some other info");
		System.out.println ("---------------");
		System.out.print ("Delivery address: ");
		address = input.nextLine();
		System.out.print ("Postal code: ");
		postalCode = input.nextLine();
		System.out.print ("Country: ");
		country = input.nextLine();
		
		// Declare variables
		int quantityA;
		double priceA;
		int quantityB;
		double priceB;
		int quantityC;
		double priceC;
		
		// Read the quantities and price of camera
		System.out.println();
		System.out.print ("Enter the quantities and price of " + cameraA + ": ");
		quantityA = input.nextInt();
		priceA = input.nextDouble();
		System.out.print ("Enter the quantities and price of " + cameraB + ": ");
		quantityB = input.nextInt();
		priceB = input.nextDouble();
		System.out.print ("Enter the quantities and price of " + cameraC + ": ");
		quantityC = input.nextInt();
		priceC = input.nextDouble();
		
		// Display the summary of camera
		System.out.println ();
		System.out.println ("Summary of cameras");
		System.out.println ("---------------");
		System.out.println();
		System.out.printf ("%-25s" + "%-20s" + "%-20s%n", "camera", "Quantity", "Price");
		System.out.println (LINE);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraA, quantityA, priceA);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraB, quantityB, priceB);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraC, quantityC, priceC);
		System.out.println (LINE);
		
		// Swap the position
		String temp1 = cameraA;
		int temp2 = quantityA;
		double temp3 = priceA;
		cameraA = cameraB;
		cameraB = temp1;
		quantityA = quantityB;
		quantityB = temp2;
		priceA = priceB;
		priceB = temp3;
		
		// Display the summary table after the swaps
		System.out.println ();
		System.out.println ("Summary of cameras after the swaps");
		System.out.println ("----------------------------------");
		System.out.printf ("%-25s" + "%-20s" + "%-20s%n", "Camera", "Quantity", "Price");
		System.out.println (LINE);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraA, quantityA, priceA);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraB, quantityB, priceB);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraC, quantityC, priceC);
		System.out.println (LINE);
	
		// Declare variables
		int orderA;
		int orderB;
		int orderC;

		// Read the orders
		System.out.println ();
		System.out.println ("Please place your order");
		System.out.println ("------------------------");
		System.out.print ("No of " + cameraA + ": ");
		orderA = input.nextInt();
		System.out.print ("No of " + cameraB + ": ");
		orderB = input.nextInt();
		System.out.print ("No of " + cameraC + ": ");
		orderC = input.nextInt();
		
		// Compute the total cost
		double costA = (orderA * priceA);
		double costB = (orderB * priceB);
		double costC = (orderC * priceC);
		double subtotal = (costA + costB + costC);
		double gst = (subtotal * 0.09);
		double totalCost = (subtotal + gst);

		// Display summary report
		System.out.println();
		System.out.println("Summary of your order");
		System.out.println("----------------------");
		System.out.println();
		System.out.printf ("%-25s" + "%-20s" + "%-20s%n", "Camera", "Quantity", "Cost");
		System.out.println (LINE);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraA, orderA, costA);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraB, orderB, costB);
		System.out.printf ("%-25s" + "%-20d" + "%-20.2f%n", cameraC, orderC, costC);
		System.out.println (LINE);
		System.out.printf ("%-45s" + "%-10.2f%n", "Subtotal: ", subtotal);
		System.out.printf ("%-45s" + "%-10.2f%n", "GST (9%):", gst);
		System.out.printf ("%-45s" + "%-10.2f%n", "Total cost:", totalCost);
		System.out.println (LINE);
		
		// Declare variables
		int balanceA = (quantityA - orderA);
		int balanceB = (quantityB - orderB);
		int balanceC = (quantityC - orderC);
		
		// Display the balance report
		System.out.println ();
		System.out.println ("Balance report");
		System.out.println ("--------------");
		System.out.println ();
		System.out.printf ("%-25s" + "%-10s" + "%-10s" + "%-10s%n", "Camera", "Quantity", "Sold", "Balance");
		System.out.println (LINE);
		System.out.printf ("%-25s" + "%-10d" + "%-10d" + "%-10d%n", cameraA, quantityA, orderA, balanceA); 
		System.out.printf ("%-25s" + "%-10d" + "%-10d" + "%-10d%n", cameraB, quantityB, orderB, balanceB);
		System.out.printf ("%-25s" + "%-10d" + "%-10d" + "%-10d%n", cameraC, quantityC, orderC, balanceC);
		System.out.println (LINE);
	}
}