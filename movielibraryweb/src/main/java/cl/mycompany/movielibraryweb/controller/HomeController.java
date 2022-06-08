package cl.mycompany.movielibraryweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView getHomePage(){
        return new ModelAndView("home");
    }

    @GetMapping("/new-register")
    public ModelAndView getNewFormMovie(){
        return new ModelAndView("new-register");
    }

    @GetMapping("/list-movies")
    public ModelAndView getListMovies(){
        return new ModelAndView("list-movies");
    }
}
