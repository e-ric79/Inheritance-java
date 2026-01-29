📌 Overview
This project demonstrates inheritance in Java using an Employee class and a derived permanentEmployee class.
It highlights:
 -Class constructors
 -Method overriding
 -Displaying employee details
 -Salary computation with and without bonuses

🛠️ Classes
1.Employee
Fields:
 -EmployeeID (int)
 -name (String)
 -salary (int)
Methods:
-computesalary() → Prints base salary.
-displayemployeedetails() → Displays employee details and salary.

2.permanentEmployee (extends Employee)
Additional Field:
-bonus (double)
-Overridden Method:
-computesalary() → Calculates salary including bonus (salary + bonus * salary).

▶️ How to Run
Clone the repository:
-bash
-git clone https://github.com/your-username/Inheritance-java.git
-cd Inheritance-java/src
-Compile the code:

bash
-javac Main.java
-Run the program:

bash
-java Main

📊 Expected Output
text
--------------------------------
EmployeeID: 101
Name: Rahul
Salary: 20000
--------------------------------
--------------------------------
EmployeeID: 102
Name: Rahul
Bonus: 0.02
Salary: 20400.0
--------------------------------
🎯 Learning Points
Inheritance: permanentEmployee inherits from Employee.

Method Overriding: computesalary() is redefined in permanentEmployee.

Encapsulation: Employee details are bundled within the class.
