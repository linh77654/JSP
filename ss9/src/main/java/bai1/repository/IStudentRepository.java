package bai1.repository;

import bai1.model.Student;
import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
}
