import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.nextLine().toLowerCase();

        switch(ready){
            case "yes": 
                System.out.println("Choose (1) for rock");
                System.out.println("Choose (2) for paper");
                System.out.println("Choose (3) for scissors");
                int choice = scan.nextInt();

                String uC = userChoice(choice);

                String cC = computerChoice();

                String result = result(uC, cC);

                printResult(uC, cC, result);

                break;

            case "no":
                System.out.println("Exiting game...");
                System.exit(0);

            default:
                System.out.println("Choose a valid response");
                
        }
        scan.close();
    }


    public static String userChoice(int choice){
        String uChoice = "";

        switch(choice){
            case 1:
                uChoice = "rock";
                break;
            case 2: 
                uChoice = "paper";
                break;
            case 3: 
                uChoice = "scissors";
                break;
            default:
                System.out.println("Choose a valid number");
        }
        return uChoice;
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice(){
        double n = Math.random() * 2 ;
        String choice = "";
        switch ((int)n) {
            case 0:
                choice = "rock";
                break;
            case 1: 
                choice = "paper";
                break;
            case 2:
                choice = "scissors";
                break;
            default:
                System.out.println("Error");
        }
        return choice;

    }




    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
            switch(yourChoice){
                case "paper":
                    switch(computerChoice){
                        case "scissors": 
                            result = "You lose";
                            break;
                        case "paper":
                            result = "It's a tie";
                            break;
                        case "rock": 
                            result = "You win";
                            break;
                        default:
                            System.out.println("Error");
                    }
                    break;
            }
            switch(yourChoice){
                case "rock":
                    switch(computerChoice){
                        case "paper": 
                            result = "You lose";
                            break;
                        case "rock":
                            result = "It's a tie";
                            break;
                        case "scissors": 
                            result = "You win";
                            break;
                        default:
                            System.out.println("Error");
                    }
                    break;
            }
            switch(yourChoice){
                case "scissors":
                    switch(computerChoice){
                        case "rock": 
                            result = "You lose";
                            break;
                        case "scissors":
                            result = "It's a tie";
                            break;
                        case "paper": 
                            result = "You win";
                            break;
                        default:
                            System.out.println("Error");
                    }
                    break;
            }
        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

     public static void printResult (String yourChoice, String computerChoice, String result){
        System.out.println("Your choice: " + yourChoice);
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println(result);
     }

}
