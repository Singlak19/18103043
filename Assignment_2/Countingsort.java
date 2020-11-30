import java.util.Arrays;
public class Countingsort {
    
    public void sort(int[] arr){
        int[] count = new int[21];
        
        for(int i: arr)
            count[i]++;
        
        int lo = 0;
        for(int i=0; i<21; ++i){
            int temp = lo;
            while(lo < temp+count[i])
                arr[lo++] = i;
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {2,4,1,5,7,2,4,6,1,0};
        System.out.print("Initial Array: ");
        System.out.println(Arrays.toString(a));
        (new Countingsort()).sort(a);
        System.out.print("After Counting Sort: ");
        System.out.println(Arrays.toString(a));
    }
    
}
