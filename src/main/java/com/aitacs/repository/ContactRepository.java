package com.aitacs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitacs.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
