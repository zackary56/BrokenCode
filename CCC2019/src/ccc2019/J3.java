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
public class J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Read in a number
        int lines = in.nextInt();
        in.nextLine();
        String output="";
        //Loop
        for (int i = 0; i < lines; i++) {
            //Read in a string
            String input = in.nextLine();
            //Loop through the characters
            char currentChar='a';
            int currentCount=0;
            char previousChar;
            for (int j = 0; j < input.length(); j++) {
                //if this is the first pass through the loop
                if (j==0){
                    //current char = charAt(i)
                    currentChar = input.charAt(j);
                    //current count = 1
                    currentCount=1;
                }
                //else
                else{
                    //previousChar=currentChar
                    previousChar = currentChar;
                    //current character = charAt(i)
                    currentChar = input.charAt(j);
                    //if charAt(i)==previousChar
                    if (currentChar == previousChar){
                        //currentCount++
                        currentCount++;
                    }
                    //else
                    else{
                        //print current count + " " + previousChar
                        output+= currentCount + " " +previousChar+" ";
                        //currentCount = 1
                        currentCount=1;
                    }
                    if (j==input.length()-1){
                        output+= currentCount + " " +currentChar+" ";
                    }
                    
                }
            }
            //Print newline
            output+="\n";
        }
        System.out.println(output);
        in.close();
    }
}
