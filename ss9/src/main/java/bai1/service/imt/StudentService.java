package bai1.service.imt;

import bai1.model.Student;
import bai1.repository.IStudentRepository;
import bai1.repository.imt.StudentRepository;
import bai1.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository repository = new StudentRepository();

    @Override
    public List<Student> getAll() {
        return repository.getAll();
    }

    @Override
    public void add(Student student) {
        repository.save(student);
    }

    @Override
    public Student findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(int id, Student student) {
        repository.update(id, student);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
