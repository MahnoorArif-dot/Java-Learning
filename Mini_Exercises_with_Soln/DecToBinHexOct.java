import java.util.Scanner;

public class DecToBinHexOct{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int dec = scanner.nextInt();
        String binary = Integer.toBinaryString(dec);
		
		String Hexadecimal = Integer.toHexString(dec);
		
		String Octal = Integer.toOctalString(dec);

        System.out.println("Binary representation: " + binary);
		System.out.println("Hexadecimal representation: " + Hexadecimal.toUpperCase());
		System.out.println("Octal representation: " + Octal);

        scanner.close();
    }
}
