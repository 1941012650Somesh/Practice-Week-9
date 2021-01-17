import java.util.*;
public class remove  
{ 
    static final int NO_OF_CHARS = 256;
    static int[] getCharCountArray(String str) 
    { 
       int count[] = new int[NO_OF_CHARS]; 
       for (int i = 0; i<str.length();  i++) 
          count[str.charAt(i)]++; 
         
       return count; 
    } 
    static String removeChars(String str, String str1) 
    { 
      int count[]  = getCharCountArray(str1); 
      int a  = 0, b = 0; 
        
      char arr[] = str.toCharArray(); 
        
      while (a != arr.length) 
      { 
        char temp = arr[a]; 
        if(count[temp] == 0) 
        { 
            arr[b] = arr[a]; 
            b++; 
        } 
            a++; 
          
      }     
  
      str = new String(arr); 
      return str.substring(0, b); 
        
    }
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine(); 
        String mask_str = sc.nextLine(); 
        System.out.println(removeChars(str, str1)); 
    } 
}
