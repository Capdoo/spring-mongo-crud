package com.example.democrudmongo.service.api;

import com.example.democrudmongo.commons.GenericServiceAPI;
import com.example.democrudmongo.model.Persona;

import java.io.Serializable;

public interface PersonaServiceAPI extends GenericServiceAPI<Persona, Long> {

    //Crear metodos manuales para el guardado, eliminacion, consulta y busqueda
    //Replicar los metodos de MongoRepository
}
