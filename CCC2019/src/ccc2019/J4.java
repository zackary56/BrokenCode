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
public class J4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Variables
        int num1=1;
        int num2=2;
        int num3=3;
        int num4=4;
        int hCount=0;
        int vCount=0;
        //Read in a line
        String input=in.nextLine();
        //Loop through the characters
        for (int i = 0; i < input.length(); i++) {
            //if the character is a V
            if (input.charAt(i)=='V'){
                //add to Vcount
                vCount++;
            }
            //else
            else{
                //add to Hcount
                hCount++;
            }
        }
        //If H is odd
        if (hCount%2==1){
            //switch 1 with 3
            int temp = num1;
            num1=num3;
            num3=temp;
            //switch 2 with 4
            temp=num2;
            num2=num4;
            num4=temp;
        }
        //If V is odd
        if (vCount%2==1){
            //switch 1 with 2
            num1+=num2;
            num2=num1-num2;
            num1=num1-num2;
            //switch 3 with 4
            num3+=num4;
            num4=num3-num4;
            num3=num3-num4;
        }
        //Print 1 2
        System.out.println(num1+ " "+num2);
        //Print 3 4
        System.out.println(num3+" "+num4);
        in.close();
    }
}
