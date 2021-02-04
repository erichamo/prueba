package com.example.controller;

import com.example.model.Client;
import com.example.service.IService;
import com.example.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> list = clientService.getAll();
        return new ResponseEntity<List<Client>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable("id") Integer id) {
        Client client = (Client) clientService.getById(id);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Client> save(@Validated @RequestBody Client client) {
        Client cliente = (Client) clientService.save(client);
        return new ResponseEntity<Client>(client, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Client> update(@Validated @RequestBody Client client) {
        Client cliente = (Client) clientService.update(client);
        return new ResponseEntity<Client>(client, HttpStatus.CREATED);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Client> delete(@PathVariable("id") Integer id) {
        clientService.delete(id);
        return new ResponseEntity<Client>(HttpStatus.NO_CONTENT);
    }
}
