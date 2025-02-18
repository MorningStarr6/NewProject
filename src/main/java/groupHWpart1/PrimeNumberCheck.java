package groupHWpart1;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Add the number to check if is prime");
        int num=input.nextInt();

        if (num%2!=0 || num==2){
            System.out.println("Number "+num+" is prime ");
        }else
            System.out.println("Number "+num+" is not prime");
    }
}
