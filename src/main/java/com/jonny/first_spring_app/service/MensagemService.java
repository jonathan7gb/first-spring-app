package com.jonny.first_spring_app.service;

import org.springframework.stereotype.Service;

import com.jonny.first_spring_app.repository.MensagemRepository;

@Service
public class MensagemService {
    
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public String getMensagem() {
        return mensagemRepository.getMensagem();
    }
}
