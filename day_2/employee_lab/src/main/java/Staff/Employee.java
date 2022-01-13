package Staff;

public abstract class Employee {
    private String name;
    private String NInumber;
    private int salary;

    public Employee(String _name, String _NInumber, int _salary){
        this.name = _name;
        this.NInumber = _NInumber;
        this.salary = _salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(Double _payRise){
       salary += _payRise;
    }

    public double payBonus(){
        return salary * 0.01;
    }

}
