package General;

public class Employee {
    protected int empid;
    private String ename;

    public void setDetails(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }

    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }
}
