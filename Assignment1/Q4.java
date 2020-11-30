
import java.util.*;

public class Q4 {

    private String str1;
    private String str2; 
    
    public Q4(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public boolean areAnagrams(){
        if(this.str1 == null || this.str2 == null || this.str1.length()!=this.str2.length())
            return false;
        
        Map<Character, Integer> str1_map = new HashMap<Character, Integer>();
        Map<Character, Integer> str2_map = new HashMap<Character, Integer>();
        
        char[] str1_array = str1.toCharArray();
        char[] str2_array = str2.toCharArray();


        for(int i=0;i<this.str1.length();i++){
        	if(str1_map.get(str1_array[i])!=null){
	            str1_map.replace(str1_array[i],((Integer)str1_map.get(str1_array[i]))+1);
	        }
	        else{
	        	str1_map.put(str1_array[i],1);
	        }
	        if(str2_map.get(str2_array[i])!=null){
	            str2_map.replace(str2_array[i],((Integer)str2_map.get(str2_array[i]))+1);
        	}
        	else{
        		str2_map.put(str2_array[i],1);
        	}
        }
        
        for(Map.Entry mapElement : str1_map.entrySet()){
            char key = (char)mapElement.getKey();
            int value = (int)mapElement.getValue();
            if(str2_map.get(key)==null || str2_map.get(key)!=value){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string:");
        String a = sc.nextLine();
        System.out.println("Enter Second string:");
        String b = sc.nextLine();

        Q4 obj = new Q4(a,b);
        boolean answer = obj.areAnagrams();
        if(answer){
            System.out.println("Strings are anagrams.");
        }
        else{
            System.out.println("Strings are NOT anagrams.");
        }
    }
    
}