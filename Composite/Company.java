public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Jason Fedin", 100, "Pro Developer");
        Employee dev2 = new Developer("Myra Fedin", 101, "Entry Level Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager("Jennifer Fedin", 200, "SEO Manager");
        Employee man2 = new Manager("Ian Fedin", 201, "Myra's Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companDirectory = new Directory();
        companDirectory.addEmployee(engDirectory);
        companDirectory.addEmployee(accDirectory);
        companDirectory.showEmployeeDetails();
    }
}
