package com.rouge.petclinic.bootstrap;

import com.rouge.petclinic.model.Owner;
import com.rouge.petclinic.model.Vet;
import com.rouge.petclinic.services.OwnerService;
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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started ******************");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Rohan");
        owner1.setLastName("Rawal");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Nikhil");
        owner2.setLastName("Debadwar");

        ownerService.save(owner2);

        System.out.println("Owner ******************");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Pratik");
        vet1.setLastName("Owner");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Pratik");
        vet2.setLastName("Owner");

        vetService.save(vet2);

        System.out.println("Vet ******************");

    }
}