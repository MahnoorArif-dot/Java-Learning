import java.util.*;
 public class EvenOddCounter{
	 public static void main(String[] args){
		 
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("Enter the size array:");
	 int size = in.nextInt();
	 
	 int[] arr = new int[size];
	 System.out.println("Enter "+size+ " elements");
	 
	 for (int i=0;i<size;i++){
		 System.out.println("Element"+(i+1)+ " :");
		 arr[i]= in.nextInt();
	 }
	 System.out.println("Array elements: ");
	 for (int num:arr){
		 System.out.print(num+",");
	 }
	 
	 int ecounter=0,ocounter=0;
	 for (int num:arr){
	 if (num%2==0){
		 ecounter++; 
	 }
	 else
	 ocounter++;
        }
	System.out.println("Count Of Even Number: " + ecounter);
	System.out.println("Count Of Odd Number: " + ocounter);
	 }
 }