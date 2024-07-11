public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
            if (chemistryGrade < biologyGrade){
                System.out.println("Yes, you did, congrats!");
            }else{
                System.out.println("No you didn't, better luck next time!");
            }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
             if (sales > costs){
                System.out.println("Yes, we did!");
             }else{
                System.out.println("No, we didn't");
             }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
            if (temperature < targetTemperature){
                System.out.println("Yes, it's colder!");
            }else{
                System.out.println("No, it isn't colder!");
            }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
            if (currentSpeed <= speedLimit){
                System.out.println("Yes, you are!");
            }else{
                System.out.println("No, you are above the speed limit!");
            }

        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
            if (age >= retirementAge){
                System.out.println("Yes, you are old enough!");
            }else{
                System.out.println("No, you aren't old enough");
            }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
            if (myGrade == bestGrade){
                System.out.println("Yes, you got the best possible grade");
            }else{
                System.out.println("No, you didn't get the best possible grade");
            }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
            if (word.equals(secondWord)){
                System.out.println("Yes, they are the same!");
            }else{
                System.out.println("No, they aren't the same!");
            }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
            if (!thirdWord.equals (fourthWord)){
                System.out.println("Yes, they are different!");
            }else{
                System.out.println("No, they aren't different!");
            }
    }
}
