package getbmi;

import javax.swing.JOptionPane;
//getting the java API


public class GetBMI {
    
    
    

    public static void main(String[] args) {
    
        
        String strht;
        String strwt;
      //creating string variable to get weight & height
        
        
        
        
        // getting & storing user in put
        strht=JOptionPane.showInputDialog(null, "Please enter your heightt in m");
        strwt=JOptionPane.showInputDialog(null, "Please enter your weight in kg");
        
        
        // creating double variables for calcualting bmi
        double ht;
        double wt;
        double bmi;
        
        // converting string variables to double variables
        wt=Double.parseDouble(strwt);
        ht=Double.parseDouble(strht);
        
        
        // calcualting BMI
        bmi=(wt/(ht*ht));
        
        System.out.println("Your BMI is    "+bmi+  "kg/m2");
        
        
        if(bmi>30)
        {
            System.out.println("You are OBESE");
        
        }
        
        else if(25<=bmi)
        {
        
            System.out.println("You are OVERWEIGHT");
        
        }
        
        else if(18.5=<bmi)
        {
        
            System.out.println("You are NORMALWEIGHT ");
        
        }
     
        
        else if(bmi<18.5)
        {
        
            System.out.println("You are UNDERWEIGHT ");
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
