import java.util.Scanner;
public class PaintCalculator 
{


public static void main(String[] args)
    {
    
    double length;
    double width;
    double height;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("What is the length of your rectangular room >> ");
    length = keyboard.nextDouble();
    System.out.print("What is the width of your rectangular room >> ");
    width = keyboard.nextDouble();
    System.out.print("What is the height of your rectangular room >> ");
    height = keyboard.nextDouble();
    
    calculateWallArea(length, width, height);
    gallonsNeeded(calculateWallArea(length, width, height));
    displayGallonsNeeded(gallonsNeeded(calculateWallArea(length, width, height)));
    computePrice(gallonsNeeded(calculateWallArea(length, width, height)));
    displayPrice(computePrice(gallonsNeeded(calculateWallArea(length, width, height))));
    }
    
public static double calculateWallArea(double length, double width, double height)
    {
    
    double wallArea;
    double perimeter = (length * 2) + (width * 2);
    wallArea = perimeter * height;
    return wallArea;
    
    }

public static double gallonsNeeded(double wallArea) 
    {
    
    double squareFtPerGallon = 350;
    double gallonsNeeded = wallArea / squareFtPerGallon;
    return gallonsNeeded;
    
    }
    
public static void displayGallonsNeeded(double gallonsNeeded)
    {
    
    System.out.println("You need " + gallonsNeeded + " gallons of paint.");
    
    }
    
public static double computePrice(double gallonsNeeded)
    {
    
    double totalPrice;
    double pricePerGallon = 32;
    totalPrice = pricePerGallon * gallonsNeeded;
    return totalPrice;
    
    }
    
public static void displayPrice(double totalPrice)
    {

    System.out.println("The total price is $" + totalPrice + ".");
    
    }
    
}