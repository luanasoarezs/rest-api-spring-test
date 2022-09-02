package com.example.crm.api.demoapi;

import com.example.crm.api.demoapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {
}
