import java.util.Scanner;
public class WorkingHours {
  public void  CalculatingWorkingHours(Employee employee)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the working hours for "+employee.name+" :" +employee.empId);
        employee.workingHours=input.nextInt();
    }
}
