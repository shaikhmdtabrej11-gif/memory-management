
import java.lang.ref.WeakReference;

public class WeakReferenceDemo {

    public static void main(String[] args) {

        StringBuilder data =
                new StringBuilder("Advanced Java");

        WeakReference<StringBuilder> weak =
                new WeakReference<>(data);

        System.out.println("Before GC: " + weak.get());

        data = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("After GC: " + weak.get());
    }
}
