package Staff.Management;


public class Director extends Manager {

    private double budget;

    public Director(String _name, String _NInumber, int _salary, String _deptName,
                    double _budget) {
        super(_name, _NInumber, _salary, _deptName);
        this.budget = _budget;

    }
    public double getBudget() {
        return budget;
    }
}
