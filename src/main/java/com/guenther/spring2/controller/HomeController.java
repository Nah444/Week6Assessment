package com.guenther.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        ModelAndView mv = new
                ModelAndView("Welcome");
        mv.addObject("message","Hello World!!!");
        mv.addObject("bob", "This is another string");
        mv.addObject("title", "Welcome Page");
        return mv;
    }

    @RequestMapping("/Welcome")
    public ModelAndView userform () {
        return new ModelAndView("form", "inst",
                "Please enter info: ");
    }

    @RequestMapping("/receipt")
    public ModelAndView receipt(
        ) {
        return receipt();
    }

    @RequestMapping("/receipt")
    public ModelAndView receipt (
            @RequestParam("name") String name,
    ) {

        //here's where the magic happens

        ModelAndView mv = new ModelAndView("receipt");
        mv.addObject("name", name);
        mv.addObject("", );
        return mv;
    }
}