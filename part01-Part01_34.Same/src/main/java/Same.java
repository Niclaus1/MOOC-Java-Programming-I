
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string: "); 
        String value1 = scan.nextLine();
        
        System.out.println("Enter the second string: ");
        String value2 = scan.nextLine();
        
        if (value1.equals(value2)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
