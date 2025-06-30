import java.util.*;
 
 public class Calculator{
   public static void main (String [] args){
	   
	   Scanner in = new Scanner(System.in);
	   
	   System.out.println("Enter Value 1");
	   int Value1 = in.nextInt();
	   
	   System.out.println("Enter Value 2");
	   int Value2 = in.nextInt();
	   
	   char oper =args[0].charAt(0);
	   
	   if (oper == '+'){
		   int addition = Value1+Value2;
		   System.out.println("Result:"+ addition);
	   }
	   else if (oper == '-'){
		   int minus = Value1-Value2;
		   System.out.println("Result:"+minus);
	   }
	   else if (oper == '/'){
		   int div = Value1/Value2;
		   System.out.println("Result:"+ div);
	   }
	   else if (oper == '*'){
		   int mul = Value1*Value2;
		   System.out.println("Result:"+mul);
	   }
	   
   }
 
 }