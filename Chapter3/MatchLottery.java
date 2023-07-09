package Chapter3;
import java.util.Scanner;
public class MatchLottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 100);

        System.out.println("The lottery number is " + lottery);

        System.out.print("input your two-digit lottery number ");
        int guess = input.nextInt();

        input.close();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        
        if (lottery == guess){
            System.out.println("Your award is $10000");
        }
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1){
            System.out.println("Your award is $3000");
        }
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2){
            System.out.println("Your award is $1000");
        }
    }
}
