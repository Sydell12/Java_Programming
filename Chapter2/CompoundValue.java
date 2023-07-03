package Chapter2; //For exercise 2.6
import java.util.Scanner;
public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double SA = input.nextDouble();

        input.close();

        double M1 = SA * 1.00417;
        double M2 = (SA + M1) * 1.00417;
        double M3 = (SA + M2) * 1.00417;
        double M4 = (SA + M3) * 1.00417;
        double M5 = (SA + M4) * 1.00417;
        double M6 = (SA + M5) * 1.00417;

        System.out.println("After the sixth month, the account value in $" + M6);
    }
    
}
