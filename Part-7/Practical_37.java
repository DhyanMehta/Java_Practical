
    class SharedBuffer {
        int item;
        boolean isProduced = false;
    
        public synchronized void produce() throws InterruptedException {
            if (isProduced) {
                return;
            }
            item = (int) (Math.random() * 100);
            System.out.println("Produced: " + item);
            isProduced = true;
            notify();
        }
    
        public synchronized void consume() throws InterruptedException {
            if (!isProduced) {
                return;
            }
            System.out.println("Consumed: " + item);
            isProduced = false;
            notify();
        }
    }
    
    class Producer extends Thread {
        SharedBuffer buffer;
    
        public Producer(SharedBuffer buffer) {
            this.buffer = buffer;
        }
    
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.produce();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    class Consumer extends Thread {
        SharedBuffer buffer;
    
        public Consumer(SharedBuffer buffer) {
            this.buffer = buffer;
        }
    
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    buffer.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public class Practical_37 {
        public static void main(String[] args) throws InterruptedException {
            SharedBuffer buffer = new SharedBuffer();
    
            Producer producerThread = new Producer(buffer);
            Consumer consumerThread = new Consumer(buffer);
    
            producerThread.start();
            consumerThread.start();
    
            producerThread.join();
            consumerThread.join();
    
            System.out.println("Producer and Consumer have finished execution.");
        }
    }
    

