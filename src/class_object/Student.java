package class_object;

public class Student {

    public Student(){}

    //Create a constructor that takes 2 args


    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }

    public static int numberOfStudent = 0;
    public static final String program = "Software Engineer in Test Program";

    public String firstName;
    public String lastName;
    public int age;

    public void study(){
        System.out.println("Student studies");
    }

    public void rest(){
        System.out.println("Student have rest");
    }

    public static void addStudent(){
        numberOfStudent++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
