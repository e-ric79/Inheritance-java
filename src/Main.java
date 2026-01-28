class Employee{
    int EmployeeID;
    String name;
    int salary;

    //constructor
    Employee(int EmployeeID,String name,int salary){
        this.EmployeeID=EmployeeID;
        this.name=name;
        this.salary=salary;
    }

    //compute salary method
    void computesalary(){
        System.out.println("Salary: " + salary);
    }

    //display employee details method
    void displayemployeedetails(){
        System.out.println("--------------------------------");
        System.out.println("EmployeeID: "+EmployeeID);
        System.out.println("Name: "+name);
        computesalary();
        System.out.println("--------------------------------");
    }
}
class permanentEmployee extends Employee{
    double bonus;

    //constructor
    permanentEmployee(int EmployeeID,String name,int salary,double bonus){
        super(EmployeeID,name,salary);
        this.bonus=bonus;
    }

    //method to compute salary + bonus
    void computesalary(){
        double totalSalary = salary + (bonus * salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary: " + totalSalary);
    }

}
public class Main{
    public static void main(String[] args){
        Employee c1=new Employee(101,"Rahul",20000);
        c1.displayemployeedetails();
        permanentEmployee c2=new permanentEmployee(102,"Rahul",20000,0.02);
        c2.displayemployeedetails();
    }
}