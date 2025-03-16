import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class w1 {
    public static void main(String[] args){
        //1. Declare a variable for your name and print a greeting message.
        String fname="Marc Joshua C. Vigilia";
        System.out.println("Welcome "+fname);


        
        System.out.println(" ");
        //2. Create a program that calculates the area of a rectangle (length × width).
        int length = 10;
        int width = 5;
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("The area of the rectangle is: "+length*width);


        
        System.out.println(" ");
        //3. Print today's date and time using Java’s built-in libraries.
        LocalDateTime currentdate = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Today's date and time: "+currentdate.format(format));


        
        System.out.println(" ");
        //1. Modify the code to take user input for name and age.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fullname: ");
        String fullName = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your name is " + fullName + " " + age + "years old");


        
        System.out.println(" ");
        //2. Use LocalDateTime to print the current time along with the date.
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);
    }
}
