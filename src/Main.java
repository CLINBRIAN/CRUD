import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        Scanner st1 =  new Scanner(System.in);
        List<Employee> collection = new ArrayList<Employee>();
        int choice;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("Enter the EmpNo");
                    int empNo = sc.nextInt();
                    System.out.print("Enter the name if employee");
                    String eName = st1.nextLine();
                    System.out.print("Enter employee salary");
                    int salary  = sc.nextInt();
                    collection.add(new Employee(empNo, eName, salary));
                    break;
                case 2:
                    System.out.println("........................");
                    Iterator<Employee> iter = collection.iterator();
                    while (iter.hasNext()){
                        Employee e = iter.next();
                        System.out.println(e);
                    }
                    System.out.println("........................");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter the employee number to search :");
                    System.out.println("........................");
                    int empno = sc.nextInt();
                    iter = collection.iterator();
                    while (iter.hasNext()){
                        Employee e = iter.next();
                        if (empno == e.getEmpNo()){
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found");
                    }
                    System.out.println("........................");
                    break;
                case 4:
                    found = false;
                    System.out.println("Enter the employee number to DELETE :");
                    empno = sc.nextInt();
                    iter = collection.iterator();
                    while (iter.hasNext()){
                        Employee e = iter.next();
                        if (empno == e.getEmpNo()){
                            iter.remove();
                            found = true;
                        }
                    }
                    if (!found){
                        System.out.println("Record not found");
                    }else {
                        System.out.println("Deleted successfully");
                    }
                    break;
                case 5:
                    found = false;
                    System.out.println("Enter the number of employee to update :");
                    empno = sc.nextInt();
                    ListIterator<Employee> list = collection.listIterator();
                    while (list.hasNext()){
                        Employee e = list.next();
                        if (empno == e.getEmpNo()){
                            System.out.println("edit name");
                            eName = st1.nextLine();
                            System.out.println("edit salary");
                            salary = sc.nextInt();
                            found = true;
                            list.set(new Employee(empno, eName, salary ));
                        }
                    }
                    if (!found){
                        System.out.println("Record not found");
                    }else {
                        System.out.println("Record updated successfully");
                    }
                    break;
            }


        }while (choice != 0);
    }
}