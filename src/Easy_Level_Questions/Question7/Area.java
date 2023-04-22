package Easy_Level_Questions.Question7;

public class Area {
//7.Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its
//length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the
//area of the rectangle. Length and breadth of rectangle are entered through keyboard.
   int len;
   int bre;
   public Area(int length, int breadth)
   {
       len = length;
       bre = breadth;
   }
   double returnArea()
   {
       return len*bre;
   }

}
