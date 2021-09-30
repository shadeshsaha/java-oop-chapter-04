/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2_problem12;

/**
 *
 * @author Shadesh
 */
import java.util.Scanner;

public class Level2_Problem12 {

    int age;
	double height;
	
	public double rec_weight(int age, double height)
	{
		int s_age = age;
		double s_height = height;
		
		double weight = Math.abs((s_height - 100 + s_age / 10) * 0.90);
		
		return weight;
	}
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Level2_Problem12 obj = new Level2_Problem12();
		
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		
		System.out.println("Enter height: ");
		double height = scan.nextDouble();
		
		System.out.println("Recommended Weight: " + obj.rec_weight(age, height));
    }
    
}
