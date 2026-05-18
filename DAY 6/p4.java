import java.util.Scanner;

// User-defined exceptions
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours, minutes, seconds;

    public void inputTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours < 0 || hours > 24) {
            throw new HrsException("hour is not in the range 0-24");
        }

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes < 0 || minutes > 60) {
            throw new MinException("minute is not in the range 0-60");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds < 0 || seconds > 60) {
            throw new SecException("second is not in the range 0-60");
        }

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

class p4 {
    public static void main(String[] args) {
        Time t = new Time();
        try {
            t.inputTime();
        } catch (HrsException e) {
            System.out.println("Exception occurred: InvalidHourException: " + e.getMessage());
        } catch (MinException e) {
            System.out.println("Exception occurred: InvalidMinuteException: " + e.getMessage());
        } catch (SecException e) {
            System.out.println("Exception occurred: InvalidSecondException: " + e.getMessage());
        }
    }
}
