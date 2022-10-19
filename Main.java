public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee("nagul","fghj001",20,2,"Junior");
        WorkingHours workingHours=new WorkingHours();
        workingHours.CalculatingWorkingHours(employee);
        Salary salary=new Salary();
        salary.salaryCalculation(employee);
        Promotion promotion=new Promotion();
        promotion.promotion(employee);
        employee.getDetails();

    }
}