interface Motor {
    int capacity = 500;

    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("The washing machine is running.");
    }

    public void consume() {
        System.out.println("The washing machine consumes power efficiently.");
    }
}

class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        System.out.println("Capacity of the motor is " + Motor.capacity + " watts.");
    }
}
