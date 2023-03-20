interface Employee {
    public void showEmployeeDetails();
}

class Developer implements Employee {
    private String name;
    private long employeeId;
    private String position;

    public Developer(String name, long employeeId, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(employeeId + " " + name + " " + position);
    }
}
