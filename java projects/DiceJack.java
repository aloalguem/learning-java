import java.util.Scanner;



public class DiceJack{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Choose 3 numbers ranging from 1 to 6:");
    
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        //IF ALL IS VALID, START APPLICATION
        if(lowerThan(n1, n2, n3) || higherThan(n1, n2, n3)){

            System.out.println("Choose a valid number!");
            System.exit(0);
        }else{
            int totalY = n1 + n2 + n3;

            printChoosen(n1, n2, n3, totalY);

            int roll1 = rollDice();
            int roll2 = rollDice();
            int roll3 = rollDice();

            int totalC = roll1 + roll2 + roll3;

            printRoll(roll1, roll2, roll3, totalC);

            if (winner(totalY, totalC)) {
                System.out.println("You won!!");
            }else{
                System.out.println("Better luck next time!");
            }
        }
    }
    /**
     * Function name: rollDice
     *
     * @return randomNumber (int);
     */
    public static int rollDice(){
        double randomNumber = Math.random() * 6 + 1;
        return (int)randomNumber;
    }

    //PRINTS THE NUMBERS CHOSEN BY COMPUTER
    public static void printRoll(int roll1, int roll2, int roll3, int totalC){
        System.out.println("Roll 1: " + roll1);
        System.out.println("Roll 2: " + roll2);
        System.out.println("Roll 3: " + roll3);

        System.out.println("Total: " + totalC);
    }

    //PRINTS THE NUMBERS CHOSEN BY THE USER
    public static void printChoosen(int n1, int n2, int n3, int totalY){
        System.out.println("/Numbers you picked/");
        System.out.println("Number 1: " + n1);
        System.out.println("Number 2: " + n2);
        System.out.println("Number 3: " + n3);

        System.out.println("Total: " + totalY);
    }

    //CHECKS THE WINNER
    public static boolean winner(int sumNumber, int sumDiceRolls){
      return (sumNumber > sumDiceRolls && (sumNumber - sumDiceRolls) < 3);
    }

    //VERIFY IF THE NUMBER IS LOWER THAN 1 
    public static boolean lowerThan(int n1, int n2, int n3){
        return(n1 < 0 || n2 < 0 || n3 < 0);
    }

    //VERIFY IF THE NUMBER IS HIGHER THAN 6
    public static boolean higherThan(int n1, int n2, int n3){
        return(n1 > 6 || n2 > 6 || n3 > 6);
           
    
    } 
}