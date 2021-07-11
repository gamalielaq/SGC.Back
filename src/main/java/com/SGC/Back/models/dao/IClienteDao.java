package com.SGC.Back.models.dao;

import com.SGC.Back.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

// Spring data JPA de spring tiene todos los metos basicos para un crud
public interface IClienteDao extends CrudRepository<Cliente, Long> {
    
}
