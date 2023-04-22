package Easy_Level_Questions.Question5;

public class Triangle
{
//    5.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
//a class named 'Triangle' with constructor having the three sides as its parameters.
    int side1;
    int side2;
    int side3;
    public Triangle(int a,int b,int c)
    {
        side1 = a;
        side2 = b;
        side3 = c;
    }
    double getArea()
    {
        int s = side1+side2+side3;
        return Math.pow((s*(s-side1)*(s-side2)*(s-side3)),.5);
    }
    double getPerimeter()
    {
        return (side1+side2+side3)/2;
    }



}
