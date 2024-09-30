public class Student {
    // Field names
    private String name;
    private int studentNumber;
    private boolean passJava;
   //Constructor
    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.passJava = false;
    }
    //Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public boolean isPassJava() {
        return passJava;
    }

    public void setPassJava(boolean passJava) {
        this.passJava = passJava;
    }








}
