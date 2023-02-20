import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting values
        List<Integer> numbers = Arrays.stream(inputValues.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // get power using power() method of Power class
        int power = Power.power(numbers.get(0), numbers.get(1));

        // printing power
        System.out.println(power);

        // closing resource
        sc.close();
    }
}