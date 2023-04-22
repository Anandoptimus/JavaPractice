package Easy_Level_Questions.Question7;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter the value for length: " );
        int length = val.nextInt();
        System.out.println("Enter the value for Breadth: ");
        int breadth = val.nextInt();
        Area area = new Area(length,breadth);
        System.out.println("Area of a rectangle: "+ area.returnArea());

    }
}
