
/**
 * Write a description of class kaii4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class kaii4
{
public static void main(String[] args){
    int numbers[]={34,43,2,6,3,76,73,45,87,34,54,89,52};
    int smallest=numbers[0];
    int largest=0;
    for(int x=0;x<numbers.length;x++){

    if(numbers[x]<smallest){
        smallest=numbers[x];
        }
        if(numbers[x]>largest){
            largest=numbers[x];
            
    }
    }
    System.out.println("Smallest: "+smallest);
    System.out.println("largest: "+largest);
    
}
}