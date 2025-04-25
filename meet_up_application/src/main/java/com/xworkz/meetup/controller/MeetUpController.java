package com.xworkz.meetup.controller;

import com.xworkz.meetup.dto.MeetupDetailsDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@RequestMapping("/")
@Controller
public class MeetUpController {
    public MeetUpController(){
        System.out.println("MeetUpController  created");

    }

    // get and post methods
    @PostMapping("/submit")
    public String acceptPostMethod(@ModelAttribute MeetupDetailsDto dto){
        System.out.println("acceptPostMethod() invoked");
        dto.setCreatedby("bhavani");
        dto.setCreatedOn(LocalDateTime.now());
        System.out.println("dto is:"+dto);
        //save data into the database
        return "sucess.jsp";
    }
    @GetMapping()
    public String acceptGetMethod(){
        System.out.println("acceptGetMethod()  invoked");
        return "sucess.jsp";
    }
}
