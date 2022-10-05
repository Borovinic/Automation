public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        //niz staff - 3 objekta
        staff[0]= new Employee("Nina", 250);
        staff[1] = new Employee("Sonja", 250);
        staff[2] = new Employee("Ana", 250);

        for (Employee e:staff){
            e.raiseSalary(5);
    }
        for (Employee e: staff){
            System.out.println("Name is: " + e.getEmployeeName() + " ana salary is " + e.getEmployeeSalary());
        }

        Employee qa = new Employee();
        qa.setEmployeeName("Sonjaa ");
        System.out.println(qa.getEmployeeName());

    }
}
