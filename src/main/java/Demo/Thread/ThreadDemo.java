package Demo.Thread;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        int c = 0;
        for(int i = 0;i < (1 << 30); i++) {
            c = (c + 1) % 100;
        }
    }
}
