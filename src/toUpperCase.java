/*  Programmer:   Zachary Champion
 *  Project:      Sandbox
 *  Description:  A java project/program to play/explore/figure out java again.
 *                  At the moment, all this does is...
 *                  ...continually return input from the user as uppercase strings until flag phrases are received.
 *  Date Last Updated:  31 May 2017
 */

import java.util.Scanner;

public class toUpperCase {
    private static Scanner Console = new Scanner(System.in);

    public static void main(String[] args) {
        String Input = askForUserInput();

        while(!((Input.equals("Bye.")) || Input.equals("Fuck off."))) {
            System.out.println(Input.toUpperCase());
            Input = askForUserInput();
        }
    }

    private static String askForUserInput() {
        System.out.print(">  ");
        return Console.nextLine();
    }
}
