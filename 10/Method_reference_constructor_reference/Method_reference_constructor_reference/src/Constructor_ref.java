import java.util.function.Function;

@FunctionalInterface
interface F{
    Student getStudent(String name); // SAM
}
class Student{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
public class Constructor_ref {
    public static void main(String[] args) {
        F myInterface= Student::new;

        Function<String, Student> fc1=Student::new;// internally it is going to create a lambda expression
        Function<String, Student> fc2=Student::new;

        System.out.println(fc1.apply("Kim").getName());
        System.out.println(fc1.apply("William").getName());
    }
}
