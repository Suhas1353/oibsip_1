import java.util.Scanner;
import java.util.Random;
public class NumberGuessing {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            System.out.println("Welcome to the Number Guessing Game");
            System.out.println("Are you Ready for the Challenge?\n Type: 'YES' or 'NO");
            String res = sc.nextLine();
            if(res.equals("YES")){
                System.out.println("You are having Ten chances to Guess the Number.");
                int chances=10;
                System.out.println("Your score will be Calculated upon your right guess and no of turns to guess the number");
                int max_score=10;
                int score=max_score;
                int random_number=random.nextInt(100);
                System.out.println("No its Time to Guess the Number:");
                System.out.println("GOOD LUCK");
                while(chances>0){
                    System.out.println("Guess the number between 1 to 100");
                    int user_number=sc.nextInt();
                    if(user_number == random_number){
                        System.out.println("Congratulations You have guessed it Correct");
                        System.out.println("The correct Number is : "+random_number);
                        System.out.println("Your Score : "+score+"/"+max_score);
                        break;
                    }
                    else if(user_number > random_number){
                        System.out.println("Your Guess was higher than the number");
                    }
                    else{
                        System.out.println("Your Guess was lower than the number");
                    }
                    chances--;
                    score--;
                }
                if(chances==0){
                    System.out.println("Your Chances are completed.");
                    System.out.println("Better Luck Next Time!");
                }
            }
            else{
                System.out.println("To Participate in the game give 'YES' When you are ready");
            }
        }
    }
}
