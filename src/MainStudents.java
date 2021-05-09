public class MainStudents {
    public static void main(String[] args) {
        MyStack studStack = new MyStack();

        //push
        Student aStudent = new Student();
        aStudent.setName("Abigail");
        aStudent.setDob("04/06/1995");
        aStudent.setGender("Female");
        aStudent.setProgram("Accounting");

        Student bStudent = new Student();
        bStudent.setName("Bailey");
        bStudent.setDob("15/02/1998");
        bStudent.setGender("Male");
        bStudent.setProgram("ICT");

        Student cStudent = new Student();
        cStudent.setName("Cane");
        cStudent.setDob("25/12/1985");
        cStudent.setGender("Male");
        cStudent.setProgram("Law enforcement");

        Student dStudent = new Student();
        dStudent.setName("Zarah");
        dStudent.setDob("28/06/1998");
        dStudent.setGender("Female");
        dStudent.setProgram("Literature");

        studStack.push(aStudent);
        studStack.push(bStudent);
        studStack.push(cStudent);
        studStack.push(dStudent);

        System.out.println("Top element in Stack: "+ studStack.peak());
        System.out.println(studStack.isEmpty());


        //pop
        System.out.println(studStack.pop().toString());
        System.out.println(studStack.pop().toString());
        System.out.println(studStack.pop().toString());
        System.out.println(studStack.pop().toString());
    }
}
