package com.example.VladProject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class FirsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       List<Student> studentsList = StudentRepository.getAllStudent();

       request.setAttribute("studentsList", studentsList);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ListStudents.jsp");
        requestDispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
