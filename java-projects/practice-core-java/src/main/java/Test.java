import com.skb.basics.Student;

public class Test {
    public static void main(String[] args) {

        Student student = new Student("Azad", 1234);
        String s = student.fetchDetails();
        System.out.println(s);

        int i = student.finalSalary(20000);
        System.out.println(i);

        String name = student.getName();
        System.out.println(name);

        String s1 = Student.m1("kamal..");
        System.out.println(s1);
    }

}
