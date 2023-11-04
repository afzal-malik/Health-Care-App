
import java.util.Scanner;


public class LO3 {
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        showMainMenu();
        
    }
    
    private static void showMainMenu() {
        System.out.println("****HEALTH CARE****");
        System.out.println("**WELCOME**");
        System.out.println("CHOOSE AN OPTION");
        System.out.println("1.Body Mass Index");
        System.out.println("2.Cholestrol Level");
        System.out.println("3.Blood Sugar Level");
        System.out.println("4.Exit");
        System.out.println("Enter Choice : ");
        int option = scan.nextInt();
        
        switch(option) {
            case 1:
                findBodyMassIndex();
                showMainMenu();
                break;
            case 2:
               findCholestrolLevel();
               showMainMenu();
                break;
            case 3:
                findBloodsugarLevel();
                showMainMenu();
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option try again");
       
        }
               
    }
    public static void findBodyMassIndex(){
        System.out.println("Body Mass Index");
        System.out.println("Enter Weight in Kilograms");
        float kg = scan.nextFloat();
        System.out.println("Enter Height in Centimeters");
        float cm = scan.nextFloat();
        float bmi = (100*100*kg) / (cm * cm);
        System.out.println("Total : " + bmi);
        
        if(bmi < 18.5){
            System.out.println("Under Weigth");
            
        }
        else if ((bmi >= 18.5) && (bmi <=25)){
            System.out.println("Health Weight");
        }
        else if ((bmi >= 25) && (bmi <= 30)){
            System.out.println("Over Weight");
        }
        else {
            System.out.println("Obesity");
        }
        
    }
    
    public static void findCholestrolLevel() {
        System.out.println("***Cholestrol Level***");
        System.out.println("Enter Gender : ");
        scan.next();
        String Gender = scan.nextLine();
        
        System.out.println("Enter Age : ");
        int age = scan.nextInt();
        System.out.println("Enter Cholestrol Level : ");
        float cholestrolLevel = scan.nextFloat();
        int cholestrolevel;
        
        if ((age <= 19) && (cholestrolLevel <=170)){
            System.out.println("Your Cholestrol Level is Normal");
        }
        else if ((age >= 20) && ((cholestrolLevel > 125)&&(cholestrolLevel < 200))){
            System.out.println("Your Cholestrol Level is Normal");
        }
        else if ((age >= 20) && (cholestrolLevel < 125)){
            System.out.println("Your Cholestrol Level is Low");
        }
        else {
            System.out.println("Your Cholestrol Level is High");
        }
    }
        
    public static void findBloodsugarLevel() {
        System.out.println("***Blood Sugar Levl***");
        System.out.print("Enter Gender : ");
        scan.next();
        String Gender = scan.nextLine();
        
        System.out.print("Enter Age : ");
        int age = scan.nextInt();
        System.out.println("Enter Blood Sugar Level : ");
        float bloodsugerLevel = scan.nextFloat();
        
        
        if((bloodsugerLevel <= 70)&&(bloodsugerLevel <= 100)){
            System.out.println("Your Blood Sugar Level is Normal");
        }
        else if ((bloodsugerLevel > 101)&&(bloodsugerLevel <125)) {
            System.out.println("Your Blood Sugar Level is Pre-diabetes");
        }
        else if ((bloodsugerLevel > 125)){
            System.out.println("Your Blood Sugar Level is Diabetes");
        }
    }
        
    }
    

    

