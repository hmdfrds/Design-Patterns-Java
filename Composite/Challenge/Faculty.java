import java.util.ArrayList;
import java.util.List;

interface Faculty {
    void getDetails();
}

class Supervisor implements Faculty {
    private String name;
    private String departmentName;
    private List<Faculty> professorList;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        professorList = new ArrayList<>();
    }

    public void addProfessor(Faculty faculty) {
        professorList.add(faculty);
    }

    public void removeProfessor(Faculty faculty) {
        professorList.remove(faculty);
    }

    @Override
    public void getDetails() {
        System.out.println(name + " is the " + departmentName);
        for (Faculty professor : professorList) {
            System.out.print("\t");
            professor.getDetails();
        }

    }
}

class Professor implements Faculty {
    private String name;
    private String position;
    private String officeNumber;

    public Professor(String name, String position, String officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public void getDetails() {
        System.out.println("\t\t" + name + " is the " + position);
    }
}