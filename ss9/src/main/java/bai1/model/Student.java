package bai1.model;

public class Student {
    private int id;
    private String name;
    private String classID;

    public Student() {}

    public Student(int id, String name, String classID) {
        this.id = id;
        this.name = name;
        this.classID = classID;
    }

    public Student(String name, String classID) {
        this.name = name;
        this.classID = classID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
}
