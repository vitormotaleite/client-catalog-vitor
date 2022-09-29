package com.vitor.clientcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitor.clientcatalog.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{

}
