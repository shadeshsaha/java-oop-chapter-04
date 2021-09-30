/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem6;

/**
 *
 * @author Shadesh
 */
import java.util.*;

public class Level1_Problem6 {

    int seats;
	double price;
	
	
	public int num_of_seats_A(int number)
	{
		seats = number;
		return seats;
	}
	
	public double price_seat_A(double amount)
	{
		price = amount;
		return price;
	}
	
	
	public int num_of_seats_B(int number)
	{
		seats = number;
		return seats;
	}
	
	public double price_seat_B(double amount)
	{
		price = amount;
		return price;
	}
	
	
	public int num_of_seats_C(int number)
	{
		seats = number;
		return seats;
	}
	
	public double price_seat_C(double amount)
	{
		price = amount;
		return price;
	}
    public static void main(String[] args) {
        Level1_Problem6 obj = new Level1_Problem6();
		
		int seat_A = obj.num_of_seats_A(5);
		int seat_B = obj.num_of_seats_B(6);
		int seat_C = obj.num_of_seats_C(7);
		
		double price_A = obj.price_seat_A(60);
		double price_B = obj.price_seat_B(70);
		double price_C = obj.price_seat_C(80);
		
		double totalSales = seat_A * price_A + seat_B * price_B + seat_C * price_C;
		
		System.out.println("Total Sales: " + totalSales);
    }
    
}
