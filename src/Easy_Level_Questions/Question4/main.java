package Easy_Level_Questions.Question4;

public class main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 5;

        System.out.println("Area of a Triangle: "+ triangle.getArea());
        System.out.println("Perimeter of a Triangle: "+ triangle.getPerimeter());


    }

}
