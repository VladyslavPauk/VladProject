package com.example.VladProject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ShowDeleteAddSomeStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("delete") != null) {
            int id = Integer.parseInt(request.getParameter("id"));
            StudentService.removeStudent(id);

        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            Student student = StudentService.getStudent(id);
            request.setAttribute("student", student);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SomeStudent.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            int age = Integer.parseInt(request.getParameter("age"));
            int groupId = Integer.parseInt(request.getParameter("groupId"));
            int id = Integer.parseInt(request.getParameter("id"));

            StudentService.addStudent(id, name, surname, age, groupId);
    }
}