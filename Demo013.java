import java.util.Scanner;
public class Demo013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of Triangle: "+ area);
    }
} 
