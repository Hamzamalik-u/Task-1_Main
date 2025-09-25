// Task 2
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
    
        System.out.println("Please type your name");


        Scanner scanner = new Scanner(System.in);

 
        String name = scanner.nextLine();


        System.out.println("Hello " + name + "!");
        System.out.println("Please type your age");

        
        int age = scanner.nextInt();


        System.out.println("You are " + age + " years old");

        // udregn år til pension - e.ks. 67 
        int yearsToRetirement = 67 - age;
        System.out.println("You have " + yearsToRetirement + " years until retirement");


        scanner.close();
    }
}