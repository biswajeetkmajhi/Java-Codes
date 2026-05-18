package Marketing;

import General.Employee;

public class Sales extends Employee {

    public double tallowance(double totalEarnings) {
        return 0.05 * totalEarnings;
    }

    public double totalEarnings(double basic) {
        return earnings(basic) + tallowance(earnings(basic));
    }
}
