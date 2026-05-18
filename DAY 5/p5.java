import java.util.Scanner;
import Marketing.Sales;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sales salesPerson = new Sales();

        System.out.print("Enter the employee id: ");
        int empid = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.print("Enter the employee name: ");
        String ename = scanner.nextLine();

        salesPerson.setDetails(empid, ename);

        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        double totalEarnings = salesPerson.totalEarnings(basic);
        System.out.println("The emp id of the employee is " + salesPerson.getEmpid());
        System.out.println("The total earning is " + totalEarnings);

        scanner.close();
    }
}
