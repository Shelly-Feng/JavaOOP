import model.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("001", "James", "male", 20);
        System.out.println(s.getID());
        System.out.println(s.getName());
        System.out.println(s.getSex());
        System.out.println(s.getAge());
    }
}
