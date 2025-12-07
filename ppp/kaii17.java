
/**
 * Write a description of class kaii17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class kaii17
{
   public static void main(String [] args){
       int[] numbers = {15, 42, 7, 23, 89, 42};
       int highest = Integer.MIN_VALUE;
       int secondHighest = Integer.MIN_VALUE;
       
       for (int num : numbers) {
           if (num > highest) {
       secondHighest = highest;
       highest = num;
       } else if (num > secondHighest && num != highest) {
       secondHighest = num;
       }
    }
    
    if (secondHighest != Integer.MIN_VALUE) {
    System.out.println("Second highest number: " + secondHighest);
} else {
    System.out.println("No second highest number found.");
    }
  }
}
