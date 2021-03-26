package com.alura.mvc.mudi.controller;

import com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Xiaomi Redmi Note 9 128GB 4GB RAM");
        pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-128GB-4GB/dp/B088HJ3FCX?ref_=Oct_s9_apbd_otopr_hd_bw_bHjJLCl&pf_rd_r=R4GJHD5231AHDHZT371S&pf_rd_p=1da659a0-948a-52ba-a216-243433981446&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=16243803011");
        pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61VmUpCs7PL._AC_SL1000_.jpg");
        pedido.setDescricao("uma descrição");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
