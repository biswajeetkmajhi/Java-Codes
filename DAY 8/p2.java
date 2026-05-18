class MessagePrinter extends Thread {
    private String[] messages;
    private String threadName;
    
    public MessagePrinter(String threadName, String[] messages) {
        this.threadName = threadName;
        this.messages = messages;
    }
    
    public void run() {
        for (String msg : messages) {
            System.out.println(threadName + ": " + msg);
            try {
                Thread.sleep(500); // Simulating delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class p2 {
    public static void main(String[] args) {
        String[] messages = {"I", "Love", "java", "Very", "Much"};
        
        MessagePrinter t1 = new MessagePrinter("Thread 1", messages);
        MessagePrinter t2 = new MessagePrinter("Thread 2", messages);
        
        t1.start();
        try {
            t1.join(); // Ensuring t1 finishes before t2 starts
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        t2.start();
    }
}
