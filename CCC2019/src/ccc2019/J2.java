/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc2019;
import java.util.Scanner;
/**
 *
 * @author SPH_SHSM
 */
public class J2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Read in a number
        int loopCounter = in.nextInt();
        in.nextLine();
        //Loop
        String output="";
        for (int x=0;x<loopCounter;x++){
            //Read in a line
            String input = in.nextLine();
            
            //Take the first part of the line, turn it into an int
            String num = input.substring(0,input.indexOf(" "));
            int innerCounter = Integer.parseInt(num);
            //Loop
            for (int i = 0; i < innerCounter; i++) {
                //Print out the last character
                output+=input.charAt(input.length()-1);
            }
            //Print a newline
            output+="\n";
            
        }
        System.out.println(output);
        
        in.close();
    }
}
