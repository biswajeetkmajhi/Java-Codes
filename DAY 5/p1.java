import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput(int r, long reg) {
        rollNo = r;
        regNo = reg;
    }

    abstract String course();
}

class Kiitian extends Student {
    String course() {
        return "B.Tech. (Computer Science & Engg)";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kiitian student = new Kiitian();

        System.out.print("Enter Rollno: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Registration no: ");
        long regNo = scanner.nextLong();

        student.getInput(rollNo, regNo);

        System.out.println("Rollno - " + student.rollNo);
        System.out.println("Registration no - " + student.regNo);
        System.out.println("Course - " + student.course());

        scanner.close();
    }
}
