package com.mezonworks.spring5petclinic.services.map;

import com.mezonworks.spring5petclinic.model.Owner;
import com.mezonworks.spring5petclinic.model.Vet;
import com.mezonworks.spring5petclinic.services.CrudService;
import com.mezonworks.spring5petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Long id,Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
