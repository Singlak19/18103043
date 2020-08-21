import java.util.*;

public class Q2 {
    private String paragraph;
    private Map<String,Integer> map;

    public Q2(String paragraph, Map<String,Integer> map){
        this.paragraph = paragraph;
        this.map = map;
    }

    public String replaceWords(){
    
        if(this.paragraph == null || this.paragraph.length() < 1)
            return null;
        
        StringBuilder new_paragraph = new StringBuilder();
        
        for(int i=0;i<this.paragraph.length();){
            int j=i;
            for(;j<this.paragraph.length();j++){
                if(this.paragraph.charAt(j)==' '){
                    break;
                }
            }
            String word=this.paragraph.substring(i,j);
            
            i=j+1;
            
            StringBuilder new_word;

            if(this.map.get(word)==null){
                
                new_paragraph.append(' ');
                new_paragraph.append(word);
            
            }
            else{

                new_word= new StringBuilder();
                new_word.append(word.charAt(0));
             
                for(int index=1;index<word.length();index++){
             
                    new_word.append('*');
             
                }
             
                new_paragraph.append(' ');
                new_paragraph.append(new_word.toString());
            }
        }
        
        return new_paragraph.toString();
    }

    public static void main(String[] args) {
        
        System.out.println("Enter paragraph:");
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        
        System.out.println("Enter number of words to be replaced:");
        int n = sc.nextInt();
        sc.nextLine();
        
        Map<String,Integer> words = new HashMap<>();
        
        if(n>0)
        	System.out.println("Words to be replaced are: ");
        
        for(int i=0; i<n; ++i){
        
        	System.out.println("Enter word number "+(i+1)+":");
            String word = sc.nextLine();
            words.put(word,1);
        
        }
        
        Q2 obj = new Q2(paragraph,words);
        String new_paragraph = obj.replaceWords();
        
        System.out.println("New paragraph is: "+ new_paragraph);
    
    }
    
}