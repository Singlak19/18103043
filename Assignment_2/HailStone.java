import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class HailStone {
    
    public Integer[] hailstone(int n){
        if(n <= 0) throw new IllegalArgumentException("Input must be Positive");
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 1){
            arr.add(n);
            if(n%2==0){n=n/2;}
            else{n=n*3+1;}
        }
        arr.add(n);
        return arr.toArray(new Integer[arr.size()]);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a Positive Integer: ");
        int n=Integer.parseInt(scan.nextLine());
        Integer[] arr=(new HailStone()).hailstone(n);
        System.out.println("HailStone Sequence is ");
        System.out.println(Arrays.toString(arr));
    }
    
}
