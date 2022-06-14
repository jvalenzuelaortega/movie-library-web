package cl.mycompany.movielibraryweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {

    @GetMapping("/new-register")
    public ModelAndView getNewMoviePage(){
        return new ModelAndView("new-register");
    }

    @GetMapping("/list-movies")
    public ModelAndView getListMoviesPage(){
        return new ModelAndView("list-movies");
    }

}
