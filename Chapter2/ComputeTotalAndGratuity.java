package Chapter2; //For exercise 2.2
import java.util.Scanner;
public class ComputeTotalAndGratuity {
    public static void main(String[] args) {
        //Create a scanner object 
        Scanner input = new Scanner(System.in);
        //prompt user to enter the input
        System.out.print("Enter the subtotal and gratuity rate: ");

        double subtotal = input.nextDouble();
        double rate = input.nextDouble();
        input.close();
        
        double gratuity = subtotal * rate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }       
}
