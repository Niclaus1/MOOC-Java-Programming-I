
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLine = 0;

        while (true) {
            String words = scanner.nextLine();
            
            if (words.equals("end")) {
                break;
            }
            numberOfLine++;
        }
        System.out.println(numberOfLine);
    }
}
