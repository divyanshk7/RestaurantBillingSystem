
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class RestaurantBill {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double mealCost;
        double tax;
        double totalCost;
        double tip;
        double totalBill;
        System.out.println("Please enter the cost of meal: ");
        mealCost=sc.nextDouble();
        tax=0.18 * mealCost;      //tax is 18% of mealCost
        totalCost = mealCost + tax;
        tip =0.02 * totalCost;     // tip is 2% of totalCost
        totalBill =totalCost + tip;
        System.out.println("Cost of meal: "+mealCost);
        System.out.println("Tax: "+tax);
        System.out.println("Tip: "+tip);
        System.out.println("TotalBill: "+totalBill);
    }
}
