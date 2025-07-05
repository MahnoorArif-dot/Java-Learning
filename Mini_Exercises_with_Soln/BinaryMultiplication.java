import java.util.*;

public class BinaryMultiplication{
	
	public static void main(String args []){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st binary number:");
		String binary1 = sc.nextLine();
		
		System.out.print("Enter 2nd binary number:");
		String binary2= sc.nextLine();
		
		int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        
        int mul = num1 * num2;
		
		String binaryMul = Integer.toBinaryString(mul);

        System.out.println("Multiplication of two binary numbers: " + binaryMul);
	}
}