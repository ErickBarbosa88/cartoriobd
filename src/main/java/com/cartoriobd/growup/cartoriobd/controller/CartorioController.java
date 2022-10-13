package com.cartoriobd.growup.cartoriobd.controller;

import com.cartoriobd.growup.cartoriobd.model.Usuario;
import com.cartoriobd.growup.cartoriobd.repository.CartorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class CartorioController {

    @Autowired
    CartorioRepository cartorioRepository;

    @PostMapping
    public Usuario criar (@RequestBody Usuario usuario){
        return cartorioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar(){
        return cartorioRepository.findAll();
    }
}
