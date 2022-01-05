package com.estudojava.spring.controller;

import com.estudojava.spring.entities.Carro;
import com.estudojava.spring.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarroController {

    CarroRepository carroRepository;

    @GetMapping("/carro")
    public List<Carro> getAllCarros() {
        return carroRepository.findAll();
    }

    @GetMapping("/carro/{id}")
    public Carro getCarroById(@PathVariable Long id){
        return carroRepository.findById(id).get();
    }

    @PostMapping("/carro")
    public Carro saveCarro(@RequestBody Carro carro) {
        return carroRepository.save(carro);
    }

    @DeleteMapping("/carro/id")
    public void deleteCarro(@PathVariable Long id){
        carroRepository.deleteById(id);
    }

}
