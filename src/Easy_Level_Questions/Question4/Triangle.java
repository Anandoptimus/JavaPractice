package Easy_Level_Questions.Question4;

public class Triangle
{
//4.Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
//a class named 'Triangle' without any parameter in its constructor.
    int side1;
    int side2;
    int side3;

    double getArea()
    {
        int s = side1+side2+side3;
        return  Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
    }

    double getPerimeter()
    {
        return (side1+side2+side3)/2;
    }

}
