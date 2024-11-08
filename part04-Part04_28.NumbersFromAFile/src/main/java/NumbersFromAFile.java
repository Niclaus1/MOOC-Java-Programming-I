
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();

        ArrayList <Integer> lists = new ArrayList <>();

        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {
                String data = scan.nextLine();

                lists.add(Integer.valueOf(data));
                
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int numbers = 0;
        for(int number : lists){
            if (number >= lowerBound && number <= upperBound){
                numbers = numbers + 1;
            } 
        }
        System.out.println("Numbers: "+ numbers);     
        
    }

}
