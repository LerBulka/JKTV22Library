/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class KeyboardInput {
    public static int inputNumber(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.printf("Enter number from next range: %d...%d ", min, max);
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number < min || number > max) {
                System.out.println("Number out of range!");
            }
        } while (number < min || number > max);
        return number;
    }
}
