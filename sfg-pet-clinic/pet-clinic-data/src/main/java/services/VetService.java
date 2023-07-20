package services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String name);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
