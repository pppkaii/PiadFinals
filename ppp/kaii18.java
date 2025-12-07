
/**
 * Write a description of class kaii18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class kaii18
{
    public static void main(String [] args){
        int[] numbers = {5, 7, 2, 9, 5};
        boolean hasDuplicate = false;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
            hasDuplicate = true;
            break;
            }
            }
            if (hasDuplicate) break;
        }
        
        if (hasDuplicate) {
            System.out.println("Array contains duplicate values.");
        } else {    
            System.out.println("No duplicates found.");
        }
}
}
