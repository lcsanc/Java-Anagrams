import java.util.*;

public class testing
{
   public static void main(String[] args)
   {
      String str1 = "test";
      String str2 = "Test"; 
      
      System.out.println(str1.equalsIgnoreCase(str2));
      
      char a1 = str1.charAt(0);
      System.out.println(a1);
      
      
      char a2 = str2.charAt(0);
      System.out.println(a2);
      
      //can not compare char with case insensitive
      System.out.println(a1==a2);  
   }
}