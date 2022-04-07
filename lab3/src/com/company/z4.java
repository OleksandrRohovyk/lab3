package com.company;

import java.util.Scanner;

public class z4 {
        public static void main(String[] args){
            Scanner q = new Scanner(System.in);
            String x;
            x = q.nextLine();
            switch (x){
                case "Так":
                case "Yes":
                case "OK":
                case "Y":
                case "Ok":
                case"+":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "Ні":
                case "NO":
                case "N":
                case "No":
                case"-":
                    System.out.println("Я відмовляють!");
                    break;
                default: System.out.println("шось зле");
            }
        }
}

