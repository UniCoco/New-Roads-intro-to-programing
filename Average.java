//rember that when starting a java file the file must be named the same as your start aka "public class average.rember

//I would name this file like if i had public class dog, i would call the file dog.java
import java.util.Scanner;

public class Average{
  
   public static void main(String[] args){
    
    Scanenr input = new Scanner(System.in);
     
     System.out.println("Enter 3 numbers:  ");
     
      double num1 = input.nextdouble();
       double num2 = input.nextDouble();
       double num3 = input.nextDouble();
       
       double average = (num1 + num2 + num3)/3;
       
       System.out.println("this is the average" + average);
    
     
     //when error comes up '' what ever is in the quotes is what u need to do.  it also tells u the line like java7 
     
     /*
     int x=3;
     double number = 3.0;
     string word = "lskjdlk!!";
     char letter 
     */
       // dif data types java 
       //string word= "lskjdlk!!"; (this is a string of words hold texts like words)
       // double 
  }
} 
