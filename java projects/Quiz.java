import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        


        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
            String a1 = scan.nextLine();
        //store answer 1
                switch (a1){
                    case "a", "b", "c", "d": System.out.println("answer 1 : "+ a1); break;
                    default: System.out.println("Invalid answer, anulled");
                }
        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
            String a2 = scan.nextLine();
        //store answer 2
                switch (a2){
                    case "a", "b", "c", "d": System.out.println("answer 2 : "+ a2); break;
                    default: System.out.println("Invalid answer, anulled");
                }
        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
            String a3 = scan.nextLine();
        //store answer 3
                switch (a3){
                    case "a", "b", "c", "d": System.out.println("answer 3 : "+ a3); break;
                    default: System.out.println("Invalid answer, anulled");
                }
        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
            String a4 = scan.nextLine();
        //store answer 4
                switch (a4){
                    case "a", "b", "c": System.out.println("answer 4 : "+ a4); break;
                    default: System.out.println("Invalid answer, anulled");
                }
        int score = 0;
        if (a1.equals("c")){
            score += 5;
        }
        if (a2.equals("a")){
            score += 5;
        }
        if (a3.equals("d")){
            score += 5;
        }
        if (a4.equals("a") || a4.equals("b")){
            score += 5;
        }


        //Task 2: Check each answer - For each correct answer, add 5 points to the score. 
        
        System.out.println("Your final score is: " + score + "/20");

        //Task 3: print a message depending on the score

        if (score >= 15){
            System.out.println("Wow, you know your stuff!");
        }else if (score >=5){
            System.out.println("Not bad!");
        }else{
            System.out.println("Better luck next time.");
        }

        // if the score is 15 or higher, print: "Wow, you know your stuff!";
        // if the score is between 5 and 15, print "Not bad!";
        // else, better luck next time. 


        scan.close();

    }
}
