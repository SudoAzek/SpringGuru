package com.mezonworks.spring5petclinic.services;

import com.mezonworks.spring5petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
