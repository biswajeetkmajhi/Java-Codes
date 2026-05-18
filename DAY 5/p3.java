import java.util.Scanner;

interface Salary {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

class Manager implements Salary {
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

    public double bonus(double basic) {
        return 0;
    }
}

class Substaff extends Manager {
    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Substaff staff = new Substaff();

        System.out.print("Enter basic salary: ");
        double basic = scanner.nextDouble();

        System.out.println("Earnings - " + staff.earnings(basic));
        System.out.println("Deduction - " + staff.deductions(basic));
        System.out.println("Bonus - " + staff.bonus(basic));

        scanner.close();
    }
}
