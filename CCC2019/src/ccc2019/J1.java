package ccc2019;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SPH_SHSM
 */
public class J1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Read in A 3pts
        int a3 = in.nextInt();
        //Read in A 2 pts
        int a2 = in.nextInt();
        //Read in A 1pt
        int a1 = in.nextInt();
        //Read in B 3pts
        int b3 = in.nextInt();
        //Read in B 2pts
        int b2 = in.nextInt();
        //Read in B 1pt
        int b1 = in.nextInt();
        //Find A score
        int aScore = a3 * 3 + a2 * 2 + a1;
        //Find B score
        int bScore = b3 * 3 + b2 * 2 + b1;
        //If A>B
        if (aScore > bScore) {
            //Print A
            System.out.println("A");
        } //Else If B>A
        else if (bScore > aScore) {
            //Print B
            System.out.println("B");
        } //Else
        else {
            //Print T
            System.out.println("T");

        }
        in.close();
    }
}
