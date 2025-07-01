import java.util.*;
class ARGS{
   public static void main(String[] args){
      System.out.println("The following commands were passed:");
	  for (int i=0; i < args.length; i++){
	   System.out.println("arg[" + i + "]: " + args[i]);}
   }
   
   
}