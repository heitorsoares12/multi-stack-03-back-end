package br.com.treinaweb.adoteumpet.api.pet.mappers;

import org.springframework.stereotype.Component;

import br.com.treinaweb.adoteumpet.api.pet.dtos.PetResponse;
import br.com.treinaweb.adoteumpet.api.pet.dtos.PetResquest;
import br.com.treinaweb.adoteumpet.core.models.Pet;

@Component
public class PetMapper {
    
    public PetResponse toResponse( Pet pet ){
        return PetResponse.builder()
            .id(pet.getId())
            .nome(pet.getNome())
            .historia(pet.getHistoria())
            .foto(pet.getFoto())
            .build();
    }

    public Pet toModel(PetResquest petResquest) {
        return Pet.builder()
        .nome(petResquest.getNome())
        .historia(petResquest.getHistoria())
        .foto(petResquest.getFoto())
        .build();
    }

}
