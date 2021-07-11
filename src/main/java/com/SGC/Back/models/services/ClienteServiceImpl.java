package com.SGC.Back.models.services;

import java.util.List;

import com.SGC.Back.models.dao.IClienteDao;
import com.SGC.Back.models.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired  // Autowired --> me permite inyectar el ClienteDao
    private IClienteDao  clienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
