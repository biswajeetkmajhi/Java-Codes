import java.util.Scanner;

interface Employee {
    void getDetails(int empId, String empName);
}

interface Manager extends Employee {
    void getDeptDetails(int deptId, String deptName);
}

class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    public void getDetails(int id, String name) {
        empId = id;
        empName = name;
    }

    public void getDeptDetails(int id, String name) {
        deptId = id;
        deptName = name;
    }

    public void displayDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Head head = new Head();

        System.out.print("Enter employee id: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter department id: ");
        int deptId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();

        head.getDetails(empId, empName);
        head.getDeptDetails(deptId, deptName);
        head.displayDetails();

        scanner.close();
    }
}
