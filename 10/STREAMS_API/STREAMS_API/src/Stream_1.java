import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    int id;
    String name;
    String dept;

    public Employee(int id, String name, String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }

    public String toString(){
        return id+":"+name;
    }
}
public class Stream_1 {
    public static void main(String[] args) {
        List<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(501,"Helena", "Human Resource"));
        al.add(new Employee(502,"John", "Information Technology"));
        al.add(new Employee(503,"Kim", "Information Technology"));
        al.add(new Employee(504,"Parker", "Human Resource"));
        al.add(new Employee(505,"Tina", "Information Technology"));
        al.add(new Employee(506,"Bella", "Information Technology"));
        al.add(new Employee(507,"William", "Human Resource"));
        al.add(new Employee(508,"Lena", "Human Resource"));
        al.add(new Employee(509,"George", "Information Technology"));

        List<Employee> HRList ;
        List<Employee> ITList ;

        HRList=al.stream().filter((emp)->emp.dept.equals("Human Resource")).collect(Collectors.toList());
        ITList=al.stream().filter((emp)->emp.dept.equals("Human Resource")).collect(Collectors.toList());



        HRList.forEach((emp)-> System.out.println(emp));
        System.out.println("------------------");
        ITList.forEach((emp)-> System.out.println(emp));

        HRList.forEach((emp)-> System.out.println(emp));
        System.out.println("------------------");
        ITList.forEach((emp)-> System.out.println(emp));



    }
}
