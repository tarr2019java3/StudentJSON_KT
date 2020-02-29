package pl.sda.student;

public class Student {
    private String name;

    private String lastname;

    private int index;

    Student(){

    }

    Student(String name, String lastname, int index){
        this.name = name;
        this.lastname = lastname;
        this.index = index;

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
