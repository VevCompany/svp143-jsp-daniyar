package controller;

import dao.Students;
import model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by НургалиевД on 20.02.2017.
 */
@WebServlet(name = "StudentController")
public class StudentController extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("student.jsp");

        System.out.println("Method = " + req.getMethod());
        System.out.println("Parameter Name = " + req.getParameter("name"));

        ArrayList<Student> st = Students.getbyname(req.getParameter("name"));

        req.setAttribute("students", st);

        rd.forward(req,resp);
    }
}
