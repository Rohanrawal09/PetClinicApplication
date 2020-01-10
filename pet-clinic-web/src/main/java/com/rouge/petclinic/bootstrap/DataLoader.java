package com.rouge.petclinic.bootstrap;

import com.rouge.petclinic.model.*;
import com.rouge.petclinic.services.OwnerService;
import com.rouge.petclinic.services.PetTypeService;
import com.rouge.petclinic.services.SpecialityService;
import com.rouge.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created By Rohan Rawal On 1/9/2020
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petType;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petType,
                      SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petType = petType;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count  = petType.findAll().size();
        if (count == 0) {
            loadData();
        }

    }

    private void loadData() {
        System.out.println("Started ******************");

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petType.save(cat);

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petType.save(dog);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Rohan");
        owner1.setLastName("Rawal");
        owner1.setAddress("Borivali");
        owner1.setCity("Mumbai");
        owner1.setTelephone("99892812131");

        Pet rohansPet = new Pet();
        rohansPet.setName("Zoro");
        rohansPet.setPetType(dog);
        rohansPet.setOwner(owner1);
        rohansPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(rohansPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Nikhil");
        owner2.setLastName("Debadwar");
        owner1.setAddress("Thane");
        owner1.setCity("Tahne");
        owner1.setTelephone("9987656541");


        Pet nikhilsPet = new Pet();
        nikhilsPet.setName("Dororo");
        nikhilsPet.setPetType(cat);
        nikhilsPet.setOwner(owner2);
        nikhilsPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(nikhilsPet);
        ownerService.save(owner2);

        System.out.println("Owner ******************");

        Vet vet1 = new Vet();
        vet1.setFirstName("Pratik");
        vet1.setLastName("Mhatre");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ejaz");
        vet2.setLastName("Shaikh");
        vet2.getSpecialities().add(savedDentistry);

        vetService.save(vet2);

        System.out.println("Vet ******************");
    }
}