package com.mezonworks.spring5petclinic.services;


import com.mezonworks.spring5petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Vet id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
