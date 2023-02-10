/**Class: BMIInterpretation
 * @author Sean-Michael Reid
 * @version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: Feb 09, 2023
 *
 * This class – Write a program that computes and interprets the Body Mass Index (BMI).
 * The program prompts the user to enter his/her weight in pounds and his/her height in inches.
 * The program then calculates the bmi using the formula: BMI = Weight(kilograms)/(height(meters))2.
 * To convert weight in pounds(p) to kilograms(kg) use the formula: weight(kg) = weight(p) * 0.4536.
 * To convert inches(in) into meters(m) use the formula: height(m) = height(in) * 0.0254.
 * The BMI interpretation is as follows:
 */
import java.util.Scanner;
public class BMIInterpretation {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double weight;double height;
        System.out.print("Enter weight in pounds: ");
        weight= input.nextDouble();
        System.out.print("Enter height in inches: ");
        height= input.nextDouble();
        weight= weight * 0.4536;
        height= height * 0.0254;
        double bmi = weight / (height * height);

        System.out.println("BMI is " + bmi);
        if(bmi >= 30)
            System.out.println("Obese");
        else if(bmi >= 25.0 && bmi < 30.0)
            System.out.println("Overweight");
        else if (bmi >= 18.5 && bmi < 25.0)
            System.out.println("Normal");
        else
            System.out.println("Underweight");







    }
}
