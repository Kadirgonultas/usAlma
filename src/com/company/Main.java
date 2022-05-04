package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int x,y,total = 1;

        System.out.print("1. sayıyı giriniz : ");
        x = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++ ){
            total *= x;
        }
        System.out.println("Cevap : " + total);
    }
}