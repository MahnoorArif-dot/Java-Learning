import java.util.*;
public class Student{
	
	private String name;
	private String rollno;
	private String email;
	private String address;
	
	public Student(){
		this.name="unknown";
		this.rollno="unknown";
		this.email="unknown";
		this.address="unknown";
	}
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public String getrollno(){
		return rollno;
	}
	
	public void setrollno(String rollno){
		this.rollno=rollno;
	}
	
	public String getemail(){
		return email;
	}
	
	public void setemail(String email){
		this.email=email;
	}
	
	public String getaddress(){
		return address;
	}
	
	public void setaddress(String address){
		this.address=address;
	}
	Scanner in = new Scanner(System.in);
	public void InputData(){
	
		System.out.println("Enter name:");
		name= in.nextLine();
		
		System.out.println("Enter rollno:");
		rollno= in.nextLine();
		
		System.out.println("Enter email:");
		email= in.nextLine();
		
		System.out.println("Enter address:");
		address= in.nextLine();
		
	}
	
	public void showinfo(){
		System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("Email: " + email);
        System.out.println("Address: $" + address);
	}
}