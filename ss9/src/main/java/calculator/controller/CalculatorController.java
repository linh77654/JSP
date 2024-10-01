package calculator.controller;

import calculator.model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", value = "/calculate")
public class CalculatorController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operator = request.getParameter("operator");

        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            Calculator calculator = new Calculator();
            double result = calculator.calculate(num1, num2, operator);

            out.println("<h1>Kết quả: " + num1 + " " + operator + " " + num2 + " = " + result + "</h1>");
        } catch (NumberFormatException e) {
            out.println("<h1>Lỗi: Vui lòng nhập số hợp lệ!</h1>");
        } catch (ArithmeticException e) {
            out.println("<h1>Lỗi: " + e.getMessage() + "</h1>");
        } finally {
            out.println("<a href='index.jsp'>Quay lại</a>");
            out.close();
        }
    }
}
