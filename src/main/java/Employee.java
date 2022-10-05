public class Employee {
    //fields

    private String employeeName;
    private int employeeSalary;
    //constructors - same name as class

    public Employee() {}

    public Employee(String name, int salary) {
        employeeName = name;
        employeeSalary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    //methods

    //raiseSalary(%)
    //employeeSalary

    public void raiseSalary(int percent) {
        int raise = employeeSalary * percent / 100;
        employeeSalary = employeeSalary + raise;
    }

    /* public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName= employeeName;
    }

    public int getEmployeeSalary(){
        return employeeSalary;
    }

     public void setEmployeeSalary(int employeeSalary){
        this.employeeSalary= employeeSalary;
     }
    */

    //fields
    //constructor
    //getter and setter
    //methods

}
