import dev.yasint.http.MyHttpClient;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ExampleTests {

    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static class Obj {
        private String name;
        private short value;

        public Obj(String name, short value) {
            this.name = name;
            this.value = value;
        }
    }

    @Test
    public void perfTest() {
        ArrayList<Obj> myObjects = new ArrayList<>();
        for (short i = 0; i < 30000; i++) {
            myObjects.add(new Obj("name", i));
        }
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
    }

    @Test
    public void testWeatherAPI() {
        MyHttpClient.callWeatherAPI(52.663971, -8.618035);
    }

}
