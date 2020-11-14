/*
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
*/


import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        //my previous idea was to compare char but char can't be compare with case insensitive. 
        //in that case I will have to use substring to compare with case insensitive. 
        // my idea is to go one by one in the compariso with a for loop. 
        //first first lets make sure that they are the same size, otherwise it will not work
        if(a.length()!=b.length())
            return false; 
        //first lets create an array, it could be the length of either one, and fill it up with the second string
        String[] stringArray = new String[a.length()];  
        for(int i=0; i<b.length();i++)
        {
            stringArray[i] = b.substring(i,i+1);
        }
        
        //we also have to keep track of how many times a letter is found
        int foundA = 0; 
            
        //now lets do the forloop
        for(int i=0; i<a.length(); i++)
        {
            //now i'm comparing each substring of a to be. 
            String tempA = a.substring(i,i+1);
            
            //now send tempA to a second for loop
            for(int j=0; j<a.length(); j++)
            {
               if(tempA.equalsIgnoreCase(stringArray[j]))
               {
                  stringArray[j]="zz"; 
                  foundA++;       
                  j=a.length(); 
               }
            }
        }
        
        
        if (foundA==a.length())
        {
            return true; 
        }
        else
            return false; 
         
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}