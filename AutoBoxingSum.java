import java.util.*;

public class AutoBoxingSum {
    public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("10", "20", "30", "40", "50");
        
        List<Integer> numbers = parseStringsToIntegers(numberStrings);
        int sum = calculateSum(numbers);
        
        System.out.println("The sum of the numbers is: " + sum);
    }

    // Method to parse list of string numbers into a list of Integer objects
    public static List<Integer> parseStringsToIntegers(List<String> strNumbers) {
        List<Integer> intNumbers = new ArrayList<>();
        for (String str : strNumbers) {
            intNumbers.add(Integer.parseInt(str)); // Autoboxing
        }
        return intNumbers;
    }

    // Method to calculate the sum of integers
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }
}
