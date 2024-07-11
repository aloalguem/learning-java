import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();


        /******************Part 1******************/
        switch(option){
        case "a","A": System.out.println("you chose option " + option + ". Entering the buy a car menu."); break;
        case "b","B": System.out.println("you chose option " + option + ". Entering the sell a car menu."); break;
        default: System.out.println("invalid option " + option + ". Select a valid option.");
        }
        /******************Case A******************/
        switch(option){
            case "a", "A":
        
                    System.out.println("What is your budget?");
                    int budget = scan.nextInt();

                    // budget greater than or equal to 10000
                    if (budget >= 10000){
                        System.out.println("Great! A Nissan Altima is available");
                        System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                        String waste = scan.nextLine();
                        String insurance = scan.nextLine();
                        System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                        String license = scan.nextLine();
                        System.out.println("What is your credit score?");
                        int creditScore = scan.nextInt();
                        // if they have insurace, a license, and credit score greater than 660
                        if(insurance.equals("yes")&& license.equals("yes") && creditScore >= 660){
                            System.out.println("Sold! Pleasure doing business with you");
                        }else{
                            System.out.println("You were not eligible for doing business with us, sorry!");
                        }
                    }else{
                            System.out.println("We're sorry. You are not eligible");
                    }
                    break;
        /******************Case B******************/

            case "b", "B":
                System.out.println("What is your car valued at?");
                int value = scan.nextInt();
                System.out.println("What is your selling price?");
                int price = scan.nextInt();


                if((value - price >=0) && price < 30000){
                    System.out.println("We will buy your car. Pleasure doing business with you!");
                }else{
                    System.out.println("Sorry, we're not interested.");
                }
        }
        scan.close();
        
    }
}
