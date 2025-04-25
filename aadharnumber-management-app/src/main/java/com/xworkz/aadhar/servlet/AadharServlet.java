package com.xworkz.aadhar.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.script.ScriptContext;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")

public class AadharServlet  extends HttpServlet {

    private ScriptContext resp;

    public AadharServlet(){
        System.out.println("AadharServlet created now it can handle the" +
                "request  and response");
    }
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doGet  method invoked");

    }
    @Override
    public  void doPost(HttpServletRequest req, HttpServletResponse rep) throws IOException {
        System.out.println("doPost method invoked");
        String userName = req.getParameter("username");
        System.out.println("user name is:"+userName);

        //display aadhar number
        String aadharNumber=req.getParameter("aadharnumber");
        System.out.println("AadharCard  numbar is:" +aadharNumber);

        // send the response back to the browser
        PrintWriter write =rep.getWriter();
        rep.setContentType("text/html");
        write.print("<html>");
        write.print("<head>");
        write.print("<title>"+"Aadhar card"+"</title>");
        write.print("<head>");
        write.print("<body>");

        write.print("<h1>"+"Entered details are:"+"</h1>");
        write.print("<h2>"+userName+"</h2>");
        write.print("<h2>"+aadharNumber+"</h2>");
        write.print("<body>");
        write.print("<html>");





    }

    }

