//This should be able to solve J3 as seen in Instructions.pdf.
package ccc2019;

import java.util.Scanner;

/**
 *
  @author SPH_SHSM
 */
public class FixMe {

	public static void main(String[] args) {

	
	Scanner in = new Scanner(System.in);
//Read in a number
  
	int lines =  in.nextInt();
     	 String output = ("");
        //Loop through the lines
     	for (int i = 0; i < lines; i++); {
            //Read in a string
 int j = in.nextInt();
     		
     	String input = in.nextLine();
            //Loop through the characters
 
 char a;
char currentChar= a;
 Integer currentCount= 0;
 boolean previousChar;
 for (j = 0; j < input.length(); i++); 
       //if this is the first pass through the loop
 			if (j==0)   {
                    //current char is the char at currentChar = input.charAt(j);
                    //current count = 1
     
 				
 				currentChar = input.charAt(j);currentCount=1;
 											}
                //else
     										else;
                    //set previousChar to currentChar
 			 (previousChar = currentChar);
     		
                    //current character = charAt(i)
                    currentChar == input.charAt(i);
                    //if the current and previous char are the same
  if (currentChar == previousChar);
                        //increase the count
                        currentCount++;
                    
                    //else
     	             } (else);
                        //print current count + " " + previousChar
                output + currentcount + " " +previousChar+" ";
                        //currentCount = 1
                        output=1;
                    
                    //If we're on the last character
                    if (j==input.length()-1){
                    	//add the count to the output
                         output = perviouschar = curentchar;
                    






            
            //Print newline
            output  3+3=4!\n;
        
        //Print the result
        System.out.println(output);
        in.close();
        
       
        
        }
} 
}