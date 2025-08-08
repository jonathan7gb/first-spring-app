package com.jonny.first_spring_app.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    
    public String getMensagem() {
        return "Hello, World! Repository Hello!";
    }
}
