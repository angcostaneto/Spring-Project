package com.alura.mvc.mudi.controller;

import com.alura.mvc.mudi.model.Pedido;
import com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired // Dependency Injection, using factory method
    private PedidoRepository repository;

    @GetMapping("/home")
    public String home(Model model) {
        List<Pedido> pedidos = repository.findAll();

        model.addAttribute("pedidos", pedidos);
        return "home";
    }

    /*
    Another way
    @GetMapping("/home")
    public ModelAndView home() {
        List<Pedido> pedidos = repository.findAll();
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("pedidos", pedidos);
        return mv;
    }*/
}
