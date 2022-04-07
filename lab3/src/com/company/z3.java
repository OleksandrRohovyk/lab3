package com.company;

import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);
        System.out.println("вкажіть свій поверх ");
        int povv = q.nextInt();
        Scanner f = new Scanner(System.in);
        System.out.println("на який поверх піднятись/спуститись? ");
        int pov = f.nextInt();

        if ((0<pov) & (pov<10)){
            if (povv<pov){
                if(pov==2){
                    System.out.println("ви піднялись на 3 поверх");
                }else System.out.println("ви піднялись на " + pov + " поверх");
            }else if (povv>pov){
                if(pov==2){
                    System.out.println("ви спустились на 1 поверх");
                }else System.out.println("ви спустились на " + pov + " поверх");
            }else System.out.println("неіснуючий напрям");
        }else System.out.println("неіснуючий поверх");
    }
}