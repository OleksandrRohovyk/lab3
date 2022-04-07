package com.company;
import java.util.Scanner;
public class z1{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if ((50<n) & (n<100)){
            System.out.println("Число " + n + " міститься в проміжку (25-100)");
        }else{
            System.out.print("Число " + n + " не міститься в проміжку (25-100)");
        }
    }
}