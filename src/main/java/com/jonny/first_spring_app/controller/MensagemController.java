package com.jonny.first_spring_app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jonny.first_spring_app.service.MensagemService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class MensagemController {
    
    private final MensagemService mensagemService;

    public MensagemController(MensagemService mensagemService){
        this.mensagemService = mensagemService;
    }

    @GetMapping("/mensagem")
    public String mensagem(){
        return mensagemService.getMensagem();
    }

    
}
