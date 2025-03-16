package gradeCalculator;

import java.util.Scanner;

public class gradeCalculator {

    public static void main(String[] args) {

        int marks;
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Grade calculator do you want to continue : ");
        if(scanInput.hasNext()){
            System.out.println("Enter the marks : ");
            marks = scanInput.nextInt();
            if(marks > 90 && marks < 100){
                System.out.println("A Grade");
            }else{
                System.out.println("Grade not found");
            }
       }


    }
}
