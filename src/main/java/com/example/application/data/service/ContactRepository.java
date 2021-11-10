package com.example.application.data.service;

import com.example.application.data.entity.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    List<Contact> findAll();
}
