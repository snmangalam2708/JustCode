import java.util.Scanner;

public class Console {

    // ******************************************************************************************** Welcome **********

    public void welcomeMessage() {

        System.out.println("\n");
        System.out.println("Hello  Welcome to MARCH MADNESS    " + "\n");
        System.out.println("Please select the Region by number" + "\n");
        System.out.println("1. EAST");
        System.out.println("2. WEST");
        System.out.println("3. MIDWEST");
        System.out.println("4. SOUTH" + "\n");
        System.out.println(" Enter your input :");
//                char escCode = 0x1B;
//                int row = 10; int column = 10;
//                System.out.print(String.format("%c[%d;%df",escCode,row,column));
    }


    // ***************** Getting String input from User **********

    public Integer getUserInput() {
        Scanner readInput = new Scanner(System.in);
        int userInput = Integer.parseInt(readInput.nextLine());
        return userInput;
    }

    // ******************** Main ****************

    public static void main(String[] args) {

//        GUI gui = new GUI();

        Console console1 = new Console();
        Boolean invalid = false;

        do {
            console1.welcomeMessage();
            Integer response = console1.getUserInput();


            if (response == 1) {

                System.out.println("You selected EAST" + "\n\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Redirecting.........");
                invalid = false;
                // Call region.east();

            }

            else if (response == 2) {

                System.out.println("You selected WEST" + "\n\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Redirecting.........");
                invalid = false;
                // Call region.west();
            }

            else if (response == 3) {

                System.out.println("You selected MIDWEST" + "\n\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Redirecting.........");
                invalid = false;
                // Call region.midwest();
            }

            else if (response == 4) {
                System.out.println("You selected SOUTH" + "\n\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Redirecting.........");
                invalid = false;
                // Call region.south();
            }

            else {
                System.out.println(" Invalid Entry ! Please enter a valid response from the menu  ");
                invalid = true;

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("\n");
            }

        } while (invalid);
    }
}


