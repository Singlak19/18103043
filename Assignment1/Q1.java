
import java.util.Scanner;

public class Q1 {
    
    private int[] substr_array;

    public Q1(int [] substr_array){
        this.substr_array = substr_array;
    }
    
    private boolean check_match(int[] char_array){
        for(int i=0;i<26;i++){
            if(char_array[i]!=this.substr_array[i]){
                return false;
            }
        }
        return true;
    }
    
    public int substringCount(String str, String subStr){
        if(str == null || str.length() < 1 || subStr == null || subStr.length() < 1)
            return 0;
        
        if(str.length() < subStr.length())
            return 0;
        
        int count=0;
            
        int[] char_array = new int[26];
            
        for(int i=0;i<subStr.length();i++){
            char_array[str.charAt(i)-'a']++;    
        }
            
        if(check_match(char_array)){
            count++;
        }
            
        for(int i=subStr.length();i<str.length();i++){
            char_array[str.charAt(i)-'a']++;
            char_array[str.charAt(i-subStr.length())-'a']--;
            if(check_match(char_array)){
                count++;
            }
        }
    
        
        return count;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        System.out.println("Enter sub-string:");
        String substr = sc.nextLine();
        
        int[] substr_array = new int[26];
            
        for(int i=0;i<substr.length();i++){
            substr_array[substr.charAt(i)-'a']++;            
        }

        Q1 obj = new Q1(substr_array);
        int count = obj.substringCount(str.toLowerCase(), substr.toLowerCase());
        System.out.print("No. of substrings in the given string are ");
        System.out.println(count);
        
    }
    
}