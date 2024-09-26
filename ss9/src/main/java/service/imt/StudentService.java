package service.imt;

import repository.IStudentRepository;
import repository.imt.StudentRepository;
import service.IStudentService;
import model.Student;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository repository = new StudentRepository();

    @Override
    public List<Student> getAllStudents() {
        return repository.getAll();
    }
}
