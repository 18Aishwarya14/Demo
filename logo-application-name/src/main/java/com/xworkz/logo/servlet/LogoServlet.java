package com.xworkz.logo.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class LogoServlet extends HttpServlet {

    public LogoServlet() {
        System.out.println("LogoServlet created, ready to handle request and response");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("doGet method invoked");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<html><body><h1>Use POST to submit player details.</h1></body></html>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse rep) throws IOException {
        System.out.println("doPost method invoked");

        // Extract parameters
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String contactNumber = req.getParameter("contactnumber");
        String numberOfPlayers = req.getParameter("numberofplayer");
        String costOfPlayer = req.getParameter("costofplayer");

        // Log details
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Number of Players: " + numberOfPlayers);
        System.out.println("Cost of Player: " + costOfPlayer);

        // Send response to browser
        rep.setContentType("text/html");
        PrintWriter write = rep.getWriter();

        write.print("<html>");
        write.print("<head><title>Player Details</title></head>");
        write.print("<body>");
        write.print("<h1>Entered Player Details:</h1>");
        write.print("<h2>Name: " +name + "</h2>");
        write.print("<h2>Email: " + email + "</h2>");
        write.print("<h2>Contact Number: " + contactNumber + "</h2>");
        write.print("<h2>Number of Players: " + numberOfPlayers + "</h2>");
        write.print("<h2>Cost of Player: " + costOfPlayer + "</h2>");
        write.print("</body>");
        write.print("</html>");
    }
}







