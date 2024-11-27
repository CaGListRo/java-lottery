
import java.util.Random;
import java.util.HashSet;

public class Lottery {

    public static void main(String[] args) {
        // Create a random object
        Random generator = new Random();
        // Create a set to store the lottery numbers
        HashSet<Integer> numbers = new HashSet<>();
        boolean validNumber;
        int number, count;
        count = 0;  // count the to the set added numbers

        System.out.println("\n");

        while (true) {
            // Generate a random number between 1 and 49
            number = generator.nextInt(50);
            // if number is 0 start over
            if (number == 0) {
                continue;
            }

            validNumber = numbers.add(number);  // add returns true if the number was added to the set, else false

            if (!validNumber) {  // if the number wasn't added to the set (duplicate number) start over
                continue;
            }

            count++;  // increment the number count

            System.out.printf("%d. Number = %d %n", count, number);  // print the number to the console

            if (count == 6) {  // if 6 valid numbers are in the set, break out of the while loop
                break;
            }

        }
        System.out.println("\n");

    }
}
