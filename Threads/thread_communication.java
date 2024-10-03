class SharedResource {
    private int number;
    private boolean isAvailable = false;

    public synchronized int getNumber() throws InterruptedException {
        while (!isAvailable) {
            wait(); // Wait until number is available
        }
        isAvailable = false;
        notify(); // Notify the producer
        return number;
    }

    public synchronized void setNumber(int number) throws InterruptedException {
        while (isAvailable) {
            wait(); // Wait until number is consumed
        }
        this.number = number;
        isAvailable = true;
        notify(); // Notify the consumer
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    resource.setNumber(i);
                    System.out.println("Produced: " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    int value = resource.getNumber();
                    System.out.println("Consumed: " + value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
