package com.mercury.servlets;

import com.mercury.beans.User;
import com.mercury.beans.UserInfo;
import com.mercury.services.HrService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ts")
public class TrainingServlet extends HttpServlet {
    private  HrService hrService = new HrService();
    public TrainingServlet() {
        super();

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        hrService.register(request.getParameter("name"), Integer.parseInt(request.getParameter("age") ));
        List<User> users = hrService.getAll();
        UserInfo ui = new UserInfo(users);
        System.out.println(ui);
        request.setAttribute("userInfo", ui);

        String url = "/result.jsp";

        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");


        User user = hrService.search(name);


    }

}
