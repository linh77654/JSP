package bai1.repository.impl;

import bai1.model.Student;
import bai1.repository.IStudentRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepository.getConnection()
                    .prepareStatement("SELECT * FROM student");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id_student"));
                student.setName(resultSet.getString("student_name"));
                student.setAddress(resultSet.getString("address"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void save(Student student) {
        try {
            PreparedStatement statement = BaseRepository.getConnection()
                    .prepareStatement("INSERT INTO student (student_name, address) VALUES (?, ?)");
            statement.setString(1, student.getName());
            statement.setString(2, student.getAddress());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student findById(int id) {
        Student student = null;
        try {
            PreparedStatement statement = BaseRepository.getConnection()
                    .prepareStatement("SELECT * FROM student WHERE id_student = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                student = new Student();
                student.setId(resultSet.getInt("id_student"));
                student.setName(resultSet.getString("student_name"));
                student.setAddress(resultSet.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public void update(int id, Student student) {
        try {
            PreparedStatement statement = BaseRepository.getConnection()
                    .prepareStatement("UPDATE student SET student_name = ?, address = ? WHERE id_student = ?");
            statement.setString(1, student.getName());
            statement.setString(2, student.getAddress());
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement statement = BaseRepository.getConnection()
                    .prepareStatement("DELETE FROM student WHERE id_student = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
