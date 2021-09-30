/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development_exercises_problem16;

/**
 *
 * @author Shadesh
 */
import java.util.Scanner;

public class Development_Exercises_Problem16 {

    private static final double price_per_pound= 5.99;
	private static final double sales_tax = 0.0725;
	
	double raw_price;
	
	public double taxless_price(double weight, double number)
	{
		double unit_weight = weight;
		double unit_number = number;
		raw_price = unit_weight * unit_number * 5.99;
		return raw_price;
		
	}
	
	public double total_price()
	{
		double total = raw_price + raw_price * 0.0725;
		return total;
	}
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Number of coffe Bags/Units: ");
		int unit_number = scanner.nextInt();
		System.out.println("Wight of per Bag/Unit: ");
		double unit_weight = scanner.nextDouble();
		
		Development_Exercises_Problem16 obj = new Development_Exercises_Problem16();
		double raw_price = obj.taxless_price(unit_weight, unit_number);
		double tax_price = obj.total_price();
		
		System.out.println("Number of bags sold: " + unit_number);
		System.out.format("     Weight per bag: %.2f", unit_weight);
		System.out.println(" lb");
		System.out.println("    Price per pound: $5.99");
		System.out.println("          Sales tax: 7.25% \n");
		System.out.format("        Total price: $ %.3f", tax_price);
    }
    
}
