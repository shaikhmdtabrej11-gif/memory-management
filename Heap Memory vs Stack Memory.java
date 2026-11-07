
public class HeapStackDemo {

    static void display() {
        int number = 100; // Local variable in stack

        Student s = new Student("Tabrej");
        // Object is in heap; reference is in stack

        System.out.println("Number: " + number);
        System.out.println("Student: " + s.name);
    }

    public static void main(String[] args) {
        display();
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
