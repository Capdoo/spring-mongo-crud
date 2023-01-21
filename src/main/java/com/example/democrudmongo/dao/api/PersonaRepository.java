package com.example.democrudmongo.dao.api;

import com.example.democrudmongo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona, Long> {



}
