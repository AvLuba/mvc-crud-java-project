import java.util.Scanner;

public class View implements ViewInterface{

    //1. input: A Scanner object used to collect user input from the console.
    //Methods:
    //1. printMessage(String message): Accepts a string argument and
    //prints it to the console. This method is typically used to display
    //information to the user.

    Scanner input = new Scanner(System.in);

    @Override
    public void printMessage(String message){
        System.out.println(message);

    }

    //2. promptForStringInput(String message): Takes a string message
    //as a prompt, displays it to the user, and then retrieves the user input
    //as a string. It ensures that the input is not empty by calling the private
    //getLine() method.
    @Override
    public String promptForStringInput(String message){
       printMessage(message);
       return getLine();


    }

    private String getLine(){

        String line = input.nextLine();
        while(line.isEmpty() || line.isBlank()) {
            line = input.nextLine();
        }
        return line;
    }

    //3. promptForNumberInput(String message): Similar to
    //promptForStringInput(String message), but instead, it retrieves the
    //user input as an integer. It uses the nextInt() method of the
    //Scanner object.

    @Override
    public int promptForNumberInput(String message){
        printMessage(message);
        int num = input.nextInt();
        return num;

    }

    //4. printMenuAndGetUserInput(): Displays a menu of options to the
    //user and collects their choice as an integer. If the input is less than 1
    //or more than 8, it prints &quot;Invalid input!&quot; and prompts the user to enter a valid choice again. The loop continues until a valid input is received.
    //The function then returns the valid user choice as an integer.

    @Override
    public int printMenuAndGetUserInput(){

            System.out.println("Press 1 to view employee ");
            System.out.println("Press 2 to add employee");
            System.out.println("Press 3 to modify employee");
            System.out.println("Press 4 to find or create department");
            System.out.println("Press 5 to sort employees by department");
            System.out.println("Press 6 to sort employees by salary ");
            System.out.println("Press 7 to apply bonus");
            System.out.println("Press 8 to logout");

            int result = input.nextInt();
        if(result< 1 || result > 9) {
            System.out.println("Invalid Input");
        }
        return result;


        }

    }





