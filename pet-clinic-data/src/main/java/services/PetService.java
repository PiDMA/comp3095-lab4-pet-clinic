package services;

import com.example.petclinicdata.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet name);
    Set<Pet> findAll();

}
