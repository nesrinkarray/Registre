package net.javaguides.login.web;

import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import net.javaguides.login.bean.LoginBean;
import net.javaguides.login.database.LoginDao;

/**
 * Créons LoginServlet pour traiter les paramètres de requête HTTP et rediriger vers la page JSP 
 * appropriée en fonction du statut de connexion de l'employé

 * 
 */

@WebServlet("/login")

/**
 * Servlet implementation class AuthServlet
 */

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        HttpSession session = request.getSession();
        session.setAttribute("session", "off");
        System.out.println("Session off");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        session.setAttribute("session", "on");
        LoginBean authenticate = new LoginBean(username, password);
         
        System.out.println("Session on");
         
        if(username!= authenticate.username||password != authenticate.password) {
            System.out.println("Error1");
            request.setAttribute("message", "Wrong login or password");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } else if(username == authenticate.username & password == authenticate.password) {
            System.out.println("Ok");
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        } else if(username == null || password == null){
            System.out.println("Error3");
            request.setAttribute("message", "All the fields are not completed");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
 
        }
    }
 
}