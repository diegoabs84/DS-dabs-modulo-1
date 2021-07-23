package com.dabs.DSdabs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dabs.DSdabs.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	

}
