package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String _name, String _NInumber, int _salary,
                   String _deptName ) {
        super(_name, _NInumber, _salary);
        this.deptName = _deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void raiseSalary() {
    }


}
