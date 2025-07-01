import java.util.*;
public class MinMax{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size =in.nextInt();
		
		int[] arr = new int[size];
		
		for (int i=0; i<size; i++){
			System.out.println("Eelement");
			arr[i]=in.nextInt();
		}
		System.out.println("ArrayElements are:");
		
		for (int num: arr){
			System.out.print(num+",");
		}
		
		int min=arr[0];
		int max=arr[0];
		for (int num:arr){
			if (num<min){
				min=num;
			}
			if (num>max){
				max=num;
			}				
		}
		System.out.println("Maximum number in array: " + max);
        System.out.println("Minimum number in array: " + min);
	}

}