import java.util.Scanner;

public class userInput{
    public static  void main(String[] args)
    {
        Scanner myObject= new Scanner(System.in);
        System.out.println("Enter Your Name, Age Salary");

        String name=myObject.nextLine();
        int age =myObject.nextInt();
        double salary= myObject.nextDouble();
        
        //==========outputting

        System.out.println("My name is:" + name);
        System.out.println("My age is:" + name);
        System.out.println("My salary is:" + salary);

    }
    }