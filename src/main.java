import java.util.Scanner;

public class main {

    public static void main(String[] args) {



    }//Main

    public static void printExample(){
        //Instead of console.writeline:
        System.out.println("Hello, world!");//println goes on next line
        System.out.print("Hello world on same line");//print stays on same line
        System.out.print("After print");
    }
    public static void variablesExample(){
        //String is upper case S string
        String name = "Zack";
        //The shortcut to println is sout + tab
        System.out.println(name);

        //Whole numbers
        //byte, short, int, long
        int grade = 100;
        System.out.println(name + " - Grade: " + grade);

        //Decimal number
        //double, float
        double percentage = 5.9;
        System.out.println(percentage);
        //Operators are the same
        double sum = grade + percentage;
        System.out.println(sum);

        //booleans
        boolean isSunny = true;
        boolean isRainy = false;

        System.out.println(isRainy);

        //Char
        char letterA = 'A';
        System.out.println(letterA);
    }
    public static void inputExample(){
        //Inputs - getting user info
        //In c# we used Console.Readline
        //For java we have to create a scanner object
        //And then pass in System.in before we can use it

        //creating a scanner object to ask user for info
        Scanner scanner = new Scanner(System.in);


        System.out.print("What is your name?");
        String name = scanner.nextLine(); //Returns the users typed response as a string

        System.out.println("Your name is " + name);

        System.out.print("How long have you taught?");

        String userNumber = scanner.nextLine();
        //In c# you parse with int.Parse
        //In java you parse with Integer.parseInt()
        //Try catch works the same
        //Java does not have try parse

        try{
            int userYearsTaught = Integer.parseInt(userNumber);
            int multiplyYears = userYearsTaught * 2;
            System.out.println("Years taught " + multiplyYears);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

//        int yearsTaught = scanner.nextInt();
    }
}//Class


//public static void Main(String[] args) {}

//First difference in Java method names are lowercase
//Called same way
//Comments are the same as c#