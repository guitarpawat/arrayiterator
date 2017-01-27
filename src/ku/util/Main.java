package ku.util;
import java.util.Scanner;
/**
 * This main class is for checking that ArrayIterator class is working correctly.
 * @author Pawat Nakpiphatkul
 * @version 1.0
 * @since Jan 27, 2017
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements in String[] : ");
        int length = Integer.parseInt(in.nextLine());
        String[] array = new String[length];
        for(int i=0;i<length;i++){
            System.out.print("array["+i+"] : ");
            array[i] = in.nextLine();
        }
        char choice = '\0';
        ArrayIterator test = new ArrayIterator(array);
        while(choice!='q'){
            System.out.print("[s]how  [n]ext  [r]emove  [q]uit : ");
            choice = in.nextLine().charAt(0);
            switch(choice){
                case 's': case 'S':
                    String[] arr = (String[]) test.getArray();
                     System.out.print("[");
                    for(int i=0;i<length;i++){
                        System.out.print(arr[i]);
                        if(i!=length-1){
                            System.out.print(" | ");
                        }
                    }
                    System.out.println("]");
                    break;
                case 'n': case 'N':
                    System.out.println("Current : "+test.next());
                    break;
                case 'r': case 'R':
                    test.remove();
                    break;
                case 'q': case 'Q':
                    break;
                default :
                    System.out.println("You entered wrong choice!");
                    break;
            }
        }
    }

}
