package com.company;
/**A university grading system
 * @author Felix Ogbonnaya
 * @since 2019-01-01
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int score = 0;
        char grade;
        boolean isSussceesful = false;
        while (!isSussceesful){
            try {
                System.out.println("Enter the Student score");
                Scanner input = new Scanner(System.in);
                score = input.nextInt();
                if (score > 0 && score <= 100) {
                    isSussceesful = true;
                } else {
                    System.out.println("Please Enter a valid score");
                }

            }catch (Exception e){
                System.out.println("Please Enter a valid score");
               // e.printStackTrace();
             }
        }
        if(score >= 70){
            grade = 'A';
        }else if(score >= 60){
            grade = 'B';
        }
        else if(score >= 50 ){
            grade = 'C';
        }
        else if(score >= 45){
            grade = 'D';
        }
        else if(score >= 40){
            grade = 'E';
        }else{
            grade = 'F';
        }

        switch(grade){
            case 'A':
                System.out.println("Grade is A, EXCELLENT PERFORMANCE");
                break;
            case 'B':
                System.out.println("Grade is B");
                break;
            case 'C':
                System.out.println("Grade is C");
                break;
            case 'D':
                System.out.println("Grade is D");
                break;
            case 'E':
                System.out.println("Grade is E");
                break;
            default:
                System.out.println("Grade is F, YOU FAILED, TRY AGAIN NEXT YEAR");
        }
    }
}
