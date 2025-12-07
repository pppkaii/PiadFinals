
/**
 * Write a description of class kaii20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class kaii20
{
    public static void main(String [] args){
        int[] numbers = {10, 25, 30, 17, 40, 21, 50};
        
        System.out.println("Even numbers greater than 20:");
        for (int num : numbers) {
            if (num > 20 && num % 2 == 0) {
                System.out.println(num);
            }
        }
}
}
