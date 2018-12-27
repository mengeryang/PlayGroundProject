package Demo.Async;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class AsyncDemo {
    public static CompletableFuture<Integer> asyncExample() {
        int local_var = new Random().nextInt();

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 100).thenApplyAsync(AsyncDemo::stage2);


        System.out.println(local_var);

        return future;
    }

    public static void asyncExample2() {
        int local_var = new Random().nextInt();

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 100).thenApplyAsync(AsyncDemo::stage2);

        try {
            future.get();
        } catch (Exception e) {

        }

        System.out.println(local_var);


    }

    public static void getFuture(CompletableFuture<Integer> future) {
        try {
            future.get();
        } catch (Exception e) {

        }
    }

    public static int stage1() {
        return 100;
    }

    public static int stage2(int a) {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        return a * 10;
    }

    public static void main(String[] args) {
//        CompletableFuture<Integer> f = asyncExample();
//        System.out.println("asyncExample finished");
//        getFuture(f);
        asyncExample2();
    }
}
