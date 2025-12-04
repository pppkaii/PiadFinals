
/**
 * Write a description of class kaii6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class kaii6{
    public static void main(String [] args){
        int[] arr = {3, 8, 1, 6, 5};
        int sum = 0;
        int count = 0;
        
        for (int n : arr) {
        if (n % 2 !=0) {
            sum += n;
            count++;
        }
        }
        System.out.println("Average odd = " + (sum / (double) count));
    }
}