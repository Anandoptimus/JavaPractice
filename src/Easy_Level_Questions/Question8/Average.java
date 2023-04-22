package Easy_Level_Questions.Question8;

public class Average {
//8.Print the average of three numbers entered by user by creating a class named 'Average' having a method to
//calculate and print the average.
    int a;
    int b;
    int c;
    public Average(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int average()
    {
        return a+b+c;
    }

}
