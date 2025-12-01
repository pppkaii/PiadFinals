
/**
 * Write a description of class kaii here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class kaii
{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
    while(true){
        System.out.print("Please input a number Between (1-100): ");
        int userInput=input.nextInt();
        if(userInput>=1 && userInput<=100){
        break;
    }
}
}
}
