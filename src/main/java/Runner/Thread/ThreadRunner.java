package Runner.Thread;

import Demo.Thread.ThreadDemo;

public class ThreadRunner {
    public static void main(String[] args) {
        ThreadDemo myThread = new ThreadDemo();
        myThread.start();

        try {
            myThread.sleep(2000);
        } catch (Exception e) {

        }

    }
}
