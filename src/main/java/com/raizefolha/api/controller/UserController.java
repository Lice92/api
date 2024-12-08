package com.raizefolha.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.raizefolha.api.model.user.*;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UserController {
    
    @Autowired
    private UserRepository repository;

    @GetMapping("/listar")
    public List <UserModel> listar () {
        return repository.findAll();
    }

    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid RegisterUserData data) {
        repository.save(new UserModel(data));
    }

    @PutMapping
    @Transactional
    public void 

}
