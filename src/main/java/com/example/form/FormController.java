package com.example.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    CustomerRepo repo;



    @RequestMapping ("/")
    public String details(){

        return "forms";

    }

    @RequestMapping ("/details")
    public String details(Customers customers){

        repo.save(customers);
        return "forms";

    }

    /*@RequestMapping ("/GetDetails")
    public String GetDetails(){

        return "view";

    }*/
    
    @GetMapping("/getCustomers")
    public ModelAndView GetDetails(){
        ModelAndView mv = new ModelAndView("Retrieve");
        Iterable<Customers> customers = repo.findAll();
        mv.addObject("Customers", customers);
        return mv;
    }

    @PostMapping("/GetDetails")
    public  ModelAndView GetDetails(@RequestParam  int id)
    {
        ModelAndView mv = new ModelAndView("Retrieve");
        Customers customers = repo.findById(id).orElse(null);
        mv.addObject(customers);
        return mv;
    }


}
