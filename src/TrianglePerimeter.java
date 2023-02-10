/**Class: Triangle Perimeter
 * @author Sean-Michael Reid
 * @version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: Feb 09, 2023
 * This class – Write a program that prompts the user to enter the length of the three edges of a triangle.
 * The program calculates the perimeter of the triangle if the input is valid,
 * otherwise it prints invalid input.
 * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */
import java.util.Scanner;
public class TrianglePerimeter {
    class PerimeterOfTriangle
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the length for side 1: ");
            int side1 = input.nextInt();
            System.out.print("Enter the length for side 2: ");
            int side2 = input.nextInt();
            System.out.print("Enter the length for side 3: ");
            int side3 = input.nextInt();

            if(side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2)
            {
                System.out.println("Invalid input.");
                return;
            }
            System.out.println("The perimeter of the triangle is: " + (side1 + side2 + side3));

        }
    }
}