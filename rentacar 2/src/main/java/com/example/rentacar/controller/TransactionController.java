package com.example.rentacar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Transaction save(@RequestBody Transaction transaction) {
        return service.save(transaction);
    }

    @GetMapping("/user/{userId}")
    public List<Transaction> getByUserId(@PathVariable Long userId) {
        return service.getByUserId(userId);
    }
}

