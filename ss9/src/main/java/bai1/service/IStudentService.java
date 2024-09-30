package bai1.service;

import bai1.model.Student;
import java.util.List;

public interface IStudentService {
    List<Student> getAll();
    void add(Student student);
    Student findById(int id);
    void update(int id, Student student);
    void delete(int id);
}
