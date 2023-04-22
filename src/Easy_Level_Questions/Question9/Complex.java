package Easy_Level_Questions.Question9;

public class Complex {
//9.Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with
//separate methods for each operation whose real and imaginary parts are entered by user.
    int real;
    int img;
    public Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }
    public static Complex sum(Complex a, Complex b)
    {
        return new Complex(a.real+b.real,a.img+b.img);
    }
    public static Complex difference(Complex a, Complex b)
    {
        return new Complex(a.real - b.real,a.img - b.img);
    }
    public static Complex product(Complex a, Complex b)
    {
        return new Complex((a.real*b.real)-(a.img * b.img),(a.real*b.img)- (a.img * b.real));
    }

    public void printvalue()
    {
        if(real == 0 && img!=0)
        {
            System.out.println(img + "i");
        }
        else if (real != 0 && img==0)
        {
            System.out.println(real);
        }
        else
        {
            System.out.println(real +","+ img+"i");
        }
    }

}
