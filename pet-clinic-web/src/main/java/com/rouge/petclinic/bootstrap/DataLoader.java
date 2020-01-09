package com.rouge.petclinic.bootstrap;

import com.rouge.petclinic.model.Owner;
import com.rouge.petclinic.model.PetType;
import com.rouge.petclinic.model.Vet;
import com.rouge.petclinic.services.OwnerService;
import com.rouge.petclinic.services.PetTypeService;
import com.rouge.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created By Rohan Rawal On 1/9/2020
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petType;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petType) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petType = petType;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started ******************");

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petType.save(cat);

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petType.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Rohan");
        owner1.setLastName("Rawal");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Nikhil");
        owner2.setLastName("Debadwar");

        ownerService.save(owner2);

        System.out.println("Owner ******************");

        Vet vet1 = new Vet();
        vet1.setFirstName("Pratik");
        vet1.setLastName("Mhatre");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ejaz");
        vet2.setLastName("Shaikh");

        vetService.save(vet2);

        System.out.println("Vet ******************");

    }
}