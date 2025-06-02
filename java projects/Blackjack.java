import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");

        scan.nextLine();

        int playerCardInt = drawRandomCard();
        int playerCardInt2 = drawRandomCard();
        String playerCardString = cardString(playerCardInt);
        String playerCardString2 = cardString(playerCardInt2);

        System.out.println("You get a \n" + playerCardString + "\n and a \n" + playerCardString2);

        int playerTotal = playerCardInt + playerCardInt2;

        System.out.println("Your total is: " + playerTotal);

        scan.nextLine();

        int dealerCardInt = drawRandomCard();
        int dealerCardInt2 = drawRandomCard();
        String dealerCardString = cardString(dealerCardInt);
        String dealerCardString2 = faceDown();
        
        System.out.println("The dealer shows \n" + dealerCardString + "\nand has a card facing down \n" + dealerCardString2);
        System.out.println("\nThe dealer's total is hidden");

        int dealerTotal = dealerCardInt + dealerCardInt2;

        scan.nextLine();

        while(true){
            if(playerTotal > 21){
                System.out.println("Bust! You lost! \nYour total reached " + playerTotal);
                break;
            }else if(playerTotal == 21){
                break;
            }
            System.out.println("Type (1) to hit or (2) to stay");

            int choice = scan.nextInt();
            int newCard = 0;


            switch(choice){
                case 1:
                    newCard = drawRandomCard();
                    playerTotal += newCard;

                    System.out.println("\nYou get a \n" + cardString(newCard));
                    System.out.println("Your new total is " + playerTotal);
                    continue;
                case 2: 
                    System.out.println("You chose to stay");
                    break;
                default: 
                    System.out.println("Choose a valid choice");
                    continue;
            }
        
                break;
        }

        if(playerTotal > 21){
            System.exit(0);;
        }

        System.out.println("Dealer's hidden card: \n" + cardString(dealerCardInt2));

        while(dealerTotal < 17){

            int newCard = drawRandomCard();

            dealerTotal += newCard;

            System.out.println("Dealer gets a \n" + cardString(newCard));
        }

        System.out.println("Dealer's total: " + dealerTotal);

        if(dealerTotal > 21){
            System.out.println("Bust! Dealer loses");
        }else{
            System.out.println("Your total: " + playerTotal);
            
            if(playerTotal > dealerTotal){
                System.out.println("You win!");
            }else if(playerTotal == dealerTotal){
                System.out.println("It's a draw!");
            }else{
                System.out.println("The dealer won. Better luck next time!");
            }
        } 
         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

     public static int drawRandomCard(){

        return(int) (Math.random() * 13) + 1;
     }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

     public static String cardString(int cardNumber){

        String card = "";

        switch(cardNumber){
            case 1:
               card = 
                    "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
                    break;
            case 2:
                card =
                    "   _____\n"+
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                    break;

            case 3:
                card =
                    "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
                    break;
            case 4:
                card =
                    "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";
                    break;
            case 5:
                card =
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
                    break;
            case 6:
                card =
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                    break;
            case 7:
                card =
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                    break;
            case 8:
                card =
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
                    break;
            case 9:
                card =
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
                    break;
            case 10:
                card =
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                    break;
            case 11:
                card =
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
                    break;
            case 12:
                card =
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
                    break;
            case 13:
                card =
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                    break;

        }
        return card;

     }



    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    }

