package com.rouge.petclinic.services.map;

import com.rouge.petclinic.model.Speciality;
import com.rouge.petclinic.model.Vet;
import com.rouge.petclinic.services.SpecialityService;
import com.rouge.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created By Rohan Rawal On 1/8/2020
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long>implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
    }

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
}