package bai1.repository;

import bai1.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
    void save(Student student);
    Student findById(int id);
    void update(int id, Student student);
    void delete(int id);
}
