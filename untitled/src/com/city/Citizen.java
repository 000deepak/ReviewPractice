package com.city;

import java.util.ArrayList;
import java.util.Scanner;

public class Citizen {

    static CitizenDetails citizen = new CitizenDetails();
    static ArrayList  register = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i=0;
        while (i<2){
            add();
            i++;
        }
        display(register);

    }



    static void add(){
        System.out.println("enter Fname");
        //fname = sc.next();
        System.out.println("enter Lname");
        citizen.setLName(sc.next());
        System.out.println("enter zip");
        citizen.setZip(sc.nextInt());

        register.add(citizen);
        //System.out.println(citizen);
    }

    static void display(ArrayList list){
        for(Object c:list){
            System.out.println(c);
        }


    }






}
