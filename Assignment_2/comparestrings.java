import java.util.Scanner;
public class comparestrings {
    
    public int compare(String f_string, String s_string){
        if(f_string == null || s_string == null || f_string.isEmpty() || s_string.isEmpty()){
            if(f_string==null || s_string==null)
            throw new NullPointerException("Argument strings can't be Empty.");
        else{
            if(f_string.isEmpty() && s_string.isEmpty()) return 0;
            else return -1;
        }
    }
        
        int cLength = Math.min(f_string.length(), s_string.length());
        
        for(int i=0; i<cLength; ++i)
            if(f_string.charAt(i) != s_string.charAt(i)) {return f_string.charAt(i) - s_string.charAt(i);}
        return f_string.length() - s_string.length();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Application Code
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program to compare two strings");
        System.out.print("Enter String 1: ");
        String a = sc.nextLine();
        System.out.print("Enter second String 2: ");
        String b = sc.nextLine();
        
        int res = (new comparestrings()).compare(a, b);
        System.out.println("First String is " + 
                ((res < 0)? "Smaller than ": (res > 0)? "Greater than ": "Equal to ") + 
                "second string");
    }
    
}
