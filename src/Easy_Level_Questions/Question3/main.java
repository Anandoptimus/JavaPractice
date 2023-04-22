package Easy_Level_Questions.Question3;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "sam";
        student.roll_number = 94;
        student.phone_number = "9498021212";
        student.address = "Unknown";
        System.out.println("Student Name: "+student.name +"\nRollnumber: "+student.roll_number+"\nPhoneNumber: "+student.phone_number+"\nAddress: "+ student.address);

        student.name = "jhon";
        student.roll_number = 95;
        student.phone_number = "1212121212";
        student.address = "Unknown";
        System.out.println("Student Name: "+student.name+"\nRollnumber: "+student.roll_number+"\nPhoneNumber: "+student.phone_number+"\nAddress: "+ student.address);

    }
}
