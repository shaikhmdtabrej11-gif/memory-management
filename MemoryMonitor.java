
public class MemoryMonitor {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();

        long usedMemory = totalMemory - freeMemory;

        System.out.println("===== JVM MEMORY STATUS =====");

        System.out.println("Total Memory: "
                + totalMemory / (1024 * 1024) + " MB");

        System.out.println("Free Memory: "
                + freeMemory / (1024 * 1024) + " MB");

        System.out.println("Used Memory: "
                + usedMemory / (1024 * 1024) + " MB");

        System.out.println("Maximum Memory: "
                + maxMemory / (1024 * 1024) + " MB");
    }
}
