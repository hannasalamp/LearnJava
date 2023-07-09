package JavaKodnest;

public class Teacher {
    String name;
    String sub;
    int sal;
    void teach() {
        System.out.println("A teacher teaches");
    }
    Teacher(String name, String sub, int sal) {
        this.name = name;
        this.sub = sub;
        this.sal = sal;
    }
}
class TeacherApp {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("hanna", "java", 120000);
        Teacher t2 = new Teacher("shamil", "python", 150000);
        System.out.println(t1);
        System.out.println(t2);
    }
}