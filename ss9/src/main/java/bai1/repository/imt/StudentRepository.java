package bai1.repository.imt;

import bai1.model.Student;
import bai1.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.add(new Student(1, "Mai Văn Hoàn", "C0624"));
        students.add(new Student(2, "Nguyễn Văn Nam", "C0524"));
        students.add(new Student(3, "Nguyễn Thái Hòa", "C0624"));
        students.add(new Student(4, "Nguyễn Đình Thi", "C0421"));
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
