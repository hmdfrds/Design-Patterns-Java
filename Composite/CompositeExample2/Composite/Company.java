public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Jason Fedin", 100, "Pro Developer");
        Employee dev2 = new Developer("Myra Fedin", 101, "Entry Level Developer");

        Manager engDirectory = new Manager("Mike", 25000);
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee dev3 = new Developer("Tom", 102, "Developer");

        Manager generalManager = new Manager("Mark", 500000);

        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engDirectory);
        generalManager.showEmployeeDetails();
    }
}
