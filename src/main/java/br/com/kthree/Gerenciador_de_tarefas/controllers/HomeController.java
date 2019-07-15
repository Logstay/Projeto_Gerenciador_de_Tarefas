package br.com.kthree.Gerenciador_de_tarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/home");
        mav.addObject("mensagem","mensagem do controller");
        return mav;

    }
}
