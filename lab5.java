package saumya;

import java.util.Scanner;

public class positivenegative {
        public static void main(String[]args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the number");
                int a=sc.nextInt();
                int number = 18;
                if (number>0) {
                        System.out.println(number + "is positive.");
                }
                else if(number<0) {
                        System.out.println(number +"is negative.");
                        sc.close();
                }
        }

}
