
import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {

    private static final List<byte[]> memory =
            new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            memory.add(new byte[1024 * 1024]);

            System.out.println(
                "Allocated memory: " + i + " MB"
            );
        }

        System.out.println("Total objects: " + memory.size());
    }
}
