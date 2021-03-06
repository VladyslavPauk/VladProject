package com.example.VladProject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Student student = StudentRepository.getStudent(id);

        request.setAttribute("student", student);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SomeStudent.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("Add Student") == null) {
            RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("/CreateAndAddStudent.jsp");
            requestDispatcher1.forward(request,response);
            String name =  request.getParameter("name");
            String surname = request.getParameter("surname");
            int age =  Integer.parseInt(request.getParameter("age"));
            int groupId = Integer.parseInt(request.getParameter("groupId"));
            int id = Integer.parseInt(request.getParameter("id"));
            StudentRepository.addStudent(id,name,surname,age,groupId);
        }
    }
}
