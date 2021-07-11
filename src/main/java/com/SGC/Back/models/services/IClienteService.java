package com.SGC.Back.models.services;

import java.util.List;

import com.SGC.Back.models.entity.Cliente;

public interface IClienteService {
    
    public List<Cliente> findAll();
    
}
