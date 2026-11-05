public class MemoryDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Tabrej";

        System.out.println(s1.name);
    }
}

class Student {
    String name;
}
