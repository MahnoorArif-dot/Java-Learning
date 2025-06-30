import java.util.*;
public class rollNo{
   public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
		 
		 System.out.println("What is your Degree?");
		 String degree = sc.nextLine();
		 
		 System.out.println("What is your Batch?");
		 String batch = sc.nextLine();
		 
		 System.out.println("What is your Id?");
		 int Id = sc.nextInt();
		 
		 System.out.println("Your Rollno is :"+ degree+batch+Id);
		 	 
		 }
   }