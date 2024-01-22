package com.reva.course;

import java.util.Scanner;

public class Prg1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name");
        String name= sc.nextLine();

        System.out.println("Enter source");
        String source= sc.nextLine();

        System.out.println("Enter Destination");
        String Destination= sc.nextLine();

        System.out.println("hii "+name+" welcome onboard from "+source+" to "+Destination+".thankyou for choosing airlines.Enjoy your flight");



    }
}
