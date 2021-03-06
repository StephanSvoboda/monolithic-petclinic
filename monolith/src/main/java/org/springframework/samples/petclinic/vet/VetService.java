package org.springframework.samples.petclinic.vet;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VetService {


    private final VetRepository vets;

    public VetService(
            VetRepository vets
    ) {
        this.vets = vets;
    }

    public Collection<? extends VetListView> allVets() {
        return this.vets.findAll();
    }
}
