package com.project.servletmain;

import com.project.model.User;
import com.project.service.UserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        if(id == null || name == null || email == null || phone == null){
            // return 404
        }

        User user = new User(id, name, email, phone);
        User newUser = userService.createUser(user);
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        String idParam = request.getParameter("id");

        if(idParam == null){

        }
    }
    @Override
    public void doPut(HttpServletRequest request, HttpServletResponse response){

    }
    @Override
    public void doDelete(HttpServletRequest request, HttpServletResponse response){

    }

}
