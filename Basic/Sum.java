import java.util.*;

public class Sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int counter =0;
        while (true) {
            System.out.println("Enter Value 1 :");
            int value1 = in.nextInt();

            System.out.println("Enter Value 2:");
            int value2 = in.nextInt();

            if (value1 == -1 || value2 == -1) {
                break;
            }

            int sum = value1 + value2;
            System.out.println("Sum: " + sum);
			counter++;
			System.out.println("Operstion performed"+counter);
        }

        in.close();
    }
}
