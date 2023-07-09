package Chapter3;
import java.util.Scanner;
public class ComputeLoan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestrate = annualInterestRate / 1200;

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        input.close();

        double monthlyPayment = loanAmount * monthlyInterestrate / (1 - 1 / Math.pow(1 + monthlyInterestrate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("the monthly payment is $" + (int)(monthlyPayment * 100) / 100);
        System.out.println("the total payment is $" + (int)(totalPayment * 100) / 100);
    }
    
}
