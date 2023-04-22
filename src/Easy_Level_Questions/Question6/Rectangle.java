package Easy_Level_Questions.Question6;

public class Rectangle {
// 6.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating
//a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as
//parameters to its constructor.
    int len;//length
    int bre;//breadth

    public Rectangle(int length, int breadth)
    {
        len = length;
        bre = breadth;
    }

    double Area()
    {
        return len*bre;
    }


}
