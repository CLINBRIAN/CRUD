public class Employee {
    private int empNo;
    private String name;
    private int salary;
    public Employee(int empNo, String name, int salary){
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;

    }


    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public String toString(){
        return empNo+ " "+ name+ " "+ salary;
    }
}
