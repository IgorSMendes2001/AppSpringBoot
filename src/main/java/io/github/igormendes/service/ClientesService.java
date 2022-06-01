package io.github.igormendes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.igormendes.model.Cliente;
import io.github.igormendes.repository.ClientesRepository;

@Service
public class ClientesService {

    private ClientesRepository repository;
    //Injeção de dependências com a classe Repository, invocando um construtor pelas anotações @Autowired e Repository.
    public ClientesService(ClientesRepository repository){
        this.repository=repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }
    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
