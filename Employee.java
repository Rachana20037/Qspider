public class Employee {
     int emp_id;
     String emp_name;
     double emp_salary;

      Employee(){
          System.out.println("No Argument Constructor");
      }
      Employee(int emp_id){
          this.emp_id = emp_id;
      }
      Employee(int emp_id,String emp_name){
          this.emp_id = emp_id;
          this.emp_name = emp_name;
      }
      
      Employee(int emp_id,String emp_name,double emp_salary){
          this.emp_id = emp_id;
          this.emp_name = emp_name;
          this.emp_salary = emp_salary;
      }
      public void EmployeeDetails(){
          System.out.println("Emp ID: " + emp_id);
          System.out.println("Emp Name: " + emp_name);
          System.out.println("Emp Salary: " + emp_salary);
          System.out.println("------------------------------");
      }
     public static void main(String[] args) {
          Employee ee1 = new Employee();
          Employee ee2= new Employee(10);
          Employee ee3 = new Employee(20,"Sheela");
          Employee ee4 = new Employee(30,"Shakila",29999.99);
          ee1.EmployeeDetails();
          ee2.EmployeeDetails();
          ee3.EmployeeDetails();
          ee4.EmployeeDetails();
     }
}
