import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        //this the scanner object to call scanner from java util libraly
        Scanner input= new Scanner(System.in);
        System.out.println("the area will be shown here");
        //prompting the user to enter the length
        System.out.println("enter the length of rectangle here:");
        double a=input.nextDouble();
        //prompting the user to enter the breadth
        System.out.println("enter the breadth of rectangle here:");
        double b=input.nextDouble();
        //object to call AreaRectangle clas
        AreaRectangle area= new AreaRectangle(a,b);
        //calculating and displaying the raea of rectangle using returnArae method
        System.out.println("The Area of rectangle is: "+ area.returnArea());
    }
}