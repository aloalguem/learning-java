public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather){
            case "sunny": System.out.println("It's sunny, you should wear a shirt"); break;
            case "cloudy": System.out.println("It's cloudy, you should wear a sweater"); break;
            case "rainy": System.out.println("It's rainiy, you should wear a raincoat"); break;
            case "snowy": System.out.println("It's snowy, you should wear a jacket"); break;
            default: System.out.println("You can wear whatever you want");
        }

        // Section 2: User role
        int role = 2;
        switch (role){
            case 1: System.out.println("You are an admin!"); break;
            case 2: System.out.println("You are an editor"); break;
            case 3: System.out.println("You are an user"); break;
            default: System.out.println("Please contact HR");
        }
       

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        if (age >= 18 && age <= 80 && income >= 30000){
            System.out.println("You are eligible for a credit card!");
        }else{
            System.out.println("You are not eligible for a credit card!");
        }

        // Section 1: Traffic light colors
        String lightColor = "red";
        switch (lightColor){
            case "green": System.out.println("You are good to go!"); break;
            case "yellow": System.out.println("You can go, but be careful!"); break;
            case "red": System.out.println("You cannot go, wait for the light to turn green!"); 
        }
        

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Chrome";
        switch (browser){
            case "Chrome": System.out.println("You are using Chrome!"); break;
            case "Firefox": System.out.println("You are using Firefox!"); break;
            case "Safari": System.out.println("You are using Safari!"); break;
            case "Edge": System.out.println("You are using Edge!"); break;
            case "Opera": System.out.println("You are using Opera!"); break;
            default: System.out.println("Your browser was not detected!");
        }
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
