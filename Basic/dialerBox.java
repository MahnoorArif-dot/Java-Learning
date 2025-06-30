import javax.swing.*;
 public class dialerBox{
     public static void main(String args[]){
	        String degree, batch, session, id;
            
            degree = JOptionPane.showInputDialog("What is your degree?");	
           	 
            batch = JOptionPane.showInputDialog("What is your batch?");		

            session = JOptionPane.showInputDialog("What is your session?");			
			 
			id = JOptionPane.showInputDialog("What is your id?");
			
			JOptionPane.showMessageDialog(null,"Your RollNo is " +degree+batch+session+id);
			 }
 
 }