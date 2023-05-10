package com.anderson.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.dslist.models.Cliente;


public interface ClienteRepository  extends JpaRepository<Cliente, Long> {}
