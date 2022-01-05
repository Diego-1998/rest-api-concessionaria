package com.estudojava.spring.repository;


import com.estudojava.spring.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long > {
}
