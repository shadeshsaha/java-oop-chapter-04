/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem7;

/**
 *
 * @author Shadesh
 */
import java.util.Scanner;

public class Level1_Problem7 {

    double celsius, fahrenheit;
	
	public double to_fahrenheit()
	{
		double far = celsius * 1.8 + 32;
		return far;
	}
	
	public double to_celsius()
	{
		double cel = (( 5 *(fahrenheit - 32.0)) / 9.0);
		return cel;
	}
	
	public double setFahrenheit(double far)
	{
		fahrenheit = far;
		return fahrenheit;
	}
	
	public double setCelsius(double cel)
	{
		celsius = cel;
		return celsius;
	}
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Value in Fahrenheit: ");
		
		double value = input.nextDouble();
		
		Level1_Problem7 temp = new Level1_Problem7();
		
		temp.setFahrenheit(value);
		
		System.out.format("Temperature in Celsius: %.2f", temp.to_celsius());
    }
    
}
