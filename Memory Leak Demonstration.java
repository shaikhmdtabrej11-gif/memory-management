
import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {

    static List<byte[]> memoryList = new ArrayList<>();

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        for (int i = 1; i <= 100; i++) {

            byte[] data = new byte[1024 * 1024];

            memoryList.add(data);

            long usedMemory =
                    (runtime.totalMemory() - runtime.freeMemory())
                    / (1024 * 1024);

            System.out.println(
                    "Objects: " + i +
                    " | Used Memory: " + usedMemory + " MB"
            );
        }
    }
}
