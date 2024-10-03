class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        
        thread1.start(); // Start thread1
        thread2.start(); // Start thread2
    }
}
