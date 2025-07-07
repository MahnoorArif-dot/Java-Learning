import java.util.*;
public class Employee{
	
		private String name;
		private String email;
		private int salary;
		private String companyName;
		
		public Employee(String name, String email, int salary, String companyName){
			this.name = name;
			this.email = email;
			this.salary = salary;
			this.companyName = companyName;
		}
		public void displayInfo(){
			System.out.println("Name: " + name);
			System.out.println("Email: " + email);
			System.out.println("Salary: " + salary);
			System.out.println("Company: " + companyName);
		}
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
	
			System.out.println("Enter Name:");
			String name = in.nextLine();

			System.out.println("Enter Email:");
			String email = in.nextLine();
			
			System.out.println("Enter CompanyName:");
			String companyName = in.nextLine();
			
			System.out.println("Enter Salary:");
			int Salary = in.nextInt();
			Employee emp1 = new Employee(name,email,Salary,companyName);
			emp1.displayInfo();
			
	}
	
 
}