/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestgrade;

/**
 *
 * @author brcas1396
 */
import java.util.Scanner;
import java.util.ArrayList;

public class HighestGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int grade, element;
        int numGrades = 0;
        int highest = 0;
        Scanner input = new Scanner(System.in);

        ArrayList grades = new ArrayList();

        while (numGrades < 5) {
            System.out.print("Please enter a grade: ");
            grade = input.nextInt();
            grades.add(grade);

            numGrades += 1;
        }
        for (Object num : grades) {
            element = (Integer) num;
            if (element > highest) {
                highest = element;
            }
        }
        System.out.println("Your highest grade is " + highest);
    }

}
