package functionalInterfaces;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age = scanner.nextInt();

        Predicate<Integer> isEligible = a -> a >= 18;

        if (isEligible.test(age)) {
            System.out.println("Eligible for voting..!");
        } else {
            System.out.println("Not Elidgible for voting..!");
        }
        scanner.close();



       Consumer<String> consumer = x ->{
            return "";
         };

    }
}
