package com.example.week4_day3_ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WelcomeController {


    @GetMapping("/name")
    public String name()
    {
        return "Muteb almoreb";
    }

    @GetMapping("/age")
    public String age()
    {
        return "My age is 24";
    }

    @GetMapping("/check/status")
    public String check()
    {
        return "Every thing is OK ";

    }

    @GetMapping("/health")
    public String health ()
    {
        return "Server health is up and running";
    }

    @GetMapping("/names")
    public ArrayList<String> nameA ()
    {
        ArrayList<String> namea = new ArrayList<>();
        namea.add("Muteb");
        namea.add("khaled");
        namea.add("ahmed");
        return namea;
    }

}
