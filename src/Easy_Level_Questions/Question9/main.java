package Easy_Level_Questions.Question9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        System.out.println("Enter the value for reaL");
        a = val.nextInt();
        System.out.println("Enter the value for img");
        b = val.nextInt();
        System.out.println("Enter the value for real");
        c = val.nextInt();
        System.out.println("Enter the value for img");
        d = val.nextInt();

        Complex a1 = new Complex(a,b);
        Complex a2 = new Complex(c,d);

        Complex b1 = Complex.sum(a1,a2);
        Complex b2 = Complex.difference(a1,a2);
        Complex b3 = Complex.product(a1,a2);


        b1.printvalue();
        b2.printvalue();
        b3.printvalue();

    }
}
