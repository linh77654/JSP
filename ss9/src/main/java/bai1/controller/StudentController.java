package bai1.controller;

import bai1.model.Student;
import bai1.service.IStudentService;
import bai1.service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentController", value = "/Student")
public class StudentController extends HttpServlet {
    private IStudentService studentService = new StudentService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                request.getRequestDispatcher("/view/Create.jsp").forward(request, response);
                break;
            case "edit":
                int id = Integer.parseInt(request.getParameter("id"));
                Student student = studentService.findById(id);
                request.setAttribute("student", student);
                request.getRequestDispatcher("/view/Edit.jsp").forward(request, response);
                break;
            case "delete":
                int studentId = Integer.parseInt(request.getParameter("id"));
                studentService.delete(studentId);
                response.sendRedirect(request.getContextPath() + "/Student");
                break;
            default:
                List<Student> students = studentService.getAll();
                request.setAttribute("students", students);
                request.getRequestDispatcher("/view/StudentList.jsp").forward(request, response);
                break;
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String action = req.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                String name = req.getParameter("name");
                String address = req.getParameter("address");

                if (name == null || name.trim().isEmpty()) {
                    req.setAttribute("error", "Tên không được để trống");
                    req.getRequestDispatcher("/view/Create.jsp").forward(req, resp);
                    return;
                }
                if (address == null || address.trim().isEmpty()) {
                    req.setAttribute("error", "Địa chỉ không được để trống");
                    req.getRequestDispatcher("/view/Create.jsp").forward(req, resp);
                    return;
                }

                Student student = new Student(0, name, address);
                studentService.add(student);
                resp.sendRedirect(req.getContextPath() + "/Student");
                break;
            case "edit":
                int id = Integer.parseInt(req.getParameter("id"));
                String newName = req.getParameter("name");
                String newAddress = req.getParameter("address");

                if (newName == null || newName.trim().isEmpty()) {
                    req.setAttribute("error", "Tên không được để trống");
                    req.getRequestDispatcher("/view/Edit.jsp").forward(req, resp);
                    return;
                }
                if (newAddress == null || newAddress.trim().isEmpty()) {
                    req.setAttribute("error", "Địa chỉ không được để trống");
                    req.getRequestDispatcher("/view/Edit.jsp").forward(req, resp);
                    return;
                }

                Student updatedStudent = new Student(id, newName, newAddress);
                studentService.update(id, updatedStudent);
                resp.sendRedirect(req.getContextPath() + "/Student");
                break;
        }
    }
}
