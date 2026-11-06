
class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " object is being collected");
    }
}

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Tabrej");
        Employee e2 = new Employee(102, "Rahul");

        e1 = null;
        e2 = null;

        System.out.println("Objects are now eligible for GC");

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
