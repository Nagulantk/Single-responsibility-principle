public class Employee {
    String name;
    String empId;
    int age;
    int workingYears;
    String role;
    int salary;
    int workingHours;
    Employee(String name,String empId,int age,int workingYears,String role)
    {
        this.name=name;
        this.empId=empId;
        this.age=age;
        this.workingYears=workingYears;
        this.role=role;
    }
    public void getDetails()
    {
        System.out.println("Name:"+this.name);
        System.out.println("EmpID:"+this.empId);
        System.out.println("Age:"+this.age);
        System.out.println("Working years:"+this.workingYears);
        System.out.println("Role:"+this.role);
        System.out.println("working hours:"+this.workingHours);
        System.out.println("Salary:"+this.salary);

    }
}
