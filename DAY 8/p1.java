import java.util.Scanner;

class CounterThread extends Thread {
    private int lower, upper;
    
    public CounterThread(String name, int lower, int upper) {
        super(name); // Setting thread name
        this.lower = lower;
        this.upper = upper;
    }
    
    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lower; i <= upper; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(5); // 5 milliseconds delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter thread name: ");
        String threadName = scanner.nextLine();
        
        System.out.print("Enter lower range of counter: ");
        int lower = scanner.nextInt();
        
        System.out.print("Enter upper range of counter: ");
        int upper = scanner.nextInt();
        
        scanner.close();
        
        // Creating and starting the thread
        CounterThread counterThread = new CounterThread(threadName, lower, upper);
        counterThread.start();
    }
}
