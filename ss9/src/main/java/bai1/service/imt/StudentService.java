package bai1.service.imt;

import bai1.repository.IStudentRepository;
import bai1.repository.imt.StudentRepository;
import bai1.service.IStudentService;
import bai1.model.Student;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository repository = new StudentRepository();

    @Override
    public List<Student> getAllStudents() {
        return repository.getAll();
    }
}
