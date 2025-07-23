import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static Scanner scan = new Scanner(System.in);
   
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        System.out.println("Let's play hangman!");

        int wordIndex = (int)(Math.random() * words.length);

        int misses = 0;

        String word = words[wordIndex];

        char[] wordArray = word.toCharArray();

        char[] blankArray = new char[wordArray.length];

        char[] charMisses = new char[8];

        for(int i = 0; i < blankArray.length; i++){
               blankArray[i] = '_';
            }

        while(misses < 6){

            System.out.print("\n" + gallows[misses] + "\n");
            
            System.out.print("Word: ");

            for(int i = 0; i < blankArray.length; i++){
                System.out.print(blankArray[i] + " ");
            }

            System.out.print("\n");

            System.out.print("Misses: ");

            for(int i = 0; i < charMisses.length; i++){
                System.out.print(charMisses[i]);
            }
            
            System.out.print("\n");

            String typedString = "";

            char typedChar = '*';

            while(true){
                System.out.print("Enter a letter: ");
                typedString = scan.nextLine();

                if(typedString.length() == 1){
                    typedChar = typedString.charAt(0);
                    break;
                }else{
                    System.out.print("Invalid input, please input exactly one character");
                }

                
            }

            boolean miss = true;

            for(int j = 0; j < wordArray.length; j++){
                if(wordArray[j] == typedChar){
                    miss = false;
                    blankArray[j] = typedChar;
                }
            }
            if(miss == true){
                misses++;
                charMisses[misses] = typedChar;
            }else{
                miss = true;
            }

            boolean win = true;

            for(int i = 0; i < blankArray.length; i++){
                if(blankArray[i] == '_'){
                    win = false;
                }
            }
            if(win){
                break;
            }
       
            
        }
            if(misses == 6){
                System.out.print("\n" + gallows[misses] + "\n");
                System.out.print("R.I.P\n");
                System.out.print("The word was: " + word);

            }else{
                System.out.print("\n" + gallows[misses] + "\n");
            
            System.out.print("Word: ");

            for(int i = 0; i < blankArray.length; i++){
                System.out.print(blankArray[i] + " ");
            }

            System.out.print("\n");

            System.out.print("Misses: ");

            for(int i = 0; i < charMisses.length; i++){
                System.out.print(charMisses[i]);
            }
            
            System.out.print("\n");
                System.out.print("You won!");
            }
    }

}





