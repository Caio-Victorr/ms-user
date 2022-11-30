package com.example.restapicrud.controllers;

import com.example.restapicrud.repositories.UserRepository;
import com.example.restapicrud.models.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    UserRepository repository;

    @GetMapping("/user")
    public List<UserModel> getAllCarros(){
        return repository.findAll();
    }

    @GetMapping("/user/{id}")
    public UserModel getCarroById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/user")
    public UserModel saveCarro(@RequestBody UserModel userModel) {
        return repository.save(userModel);
    }

    @DeleteMapping("/user/{id}")
    public void deleteCarro(@PathVariable Long id) {
        repository.deleteById(id);
    }


}
