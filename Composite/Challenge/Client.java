public class Client {
    public static void main(String[] args) {

        Supervisor dean = new Supervisor("Dr.S.Som", "Dean of Technology");

        Supervisor chair1 = new Supervisor("Mrs.S.Das", "Chair of Math Department");
        Supervisor chair2 = new Supervisor("Mr.V.Sarcar", "Chair of Computer Science Department");

        Professor mathProfessor1 = new Professor("Math Professor1", "Adjunct", "010294212");
        Professor mathProfessor2 = new Professor("Math Professor2", "Associate", "010294212");
        Professor cseProfessor1 = new Professor("CSE Professor1", "Adjunct", "010294212");
        Professor cseProfessor2 = new Professor("CSE Professor2", "Professor", "010294212");
        Professor cseProfessor3 = new Professor("CSE Professor3", "professor", "010294212");

        dean.addProfessor(chair1);
        dean.addProfessor(chair2);

        chair1.addProfessor(mathProfessor1);
        chair1.addProfessor(mathProfessor2);

        chair2.addProfessor(cseProfessor1);
        chair2.addProfessor(cseProfessor2);
        chair2.addProfessor(cseProfessor3);

        dean.getDetails();
    }

}
