import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Console {

    // ******************************************************************************************** Welcome **********

    public void welcomeMessageRegions() {

        System.out.println("\n");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^   Hello  Welcome to MARCH MADNESS          ^");
        System.out.println("^--------------------------------------------^");
        System.out.println("^   Please select the Region by number       ^");
        System.out.println("^                                            ^");
        System.out.println("^   1. EAST                                  ^");
        System.out.println("^   2. WEST                                  ^");
        System.out.println("^   3. MIDWEST                               ^");
        System.out.println("^   4. SOUTH                                 ^");
        System.out.println("^                                            ^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(" Enter your input :");
//                char escCode = 0x1B;
//                int row = 10; int column = 10;
//                System.out.print(String.format("%c[%d;%df",escCode,row,column));
    }
    
    // ***************** Getting String input from User **********

    public Integer getUserInput() {

        int userInput = 0;
        Scanner readInput = new Scanner(System.in);
        try {
            userInput = Integer.parseInt(readInput.nextLine());

        } catch (NumberFormatException ex) {
            System.out.println("Invalid entry. Please enter a number from the menu" + "\n");
            userInput = Integer.parseInt(readInput.nextLine());
            return userInput;
        }
        return userInput;
    }

    // ******************** Main ****************

    public static void main(String[] args) {

//        GUI gui = new GUI();

        Console region = new Console();
        Boolean invalid = false;
        region.welcomeMessageRegions();

        do {
            //region.welcomeMessageRegions();
            Integer response = region.getUserInput();

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
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("\n");
            }

        } while (invalid);
    }
}


