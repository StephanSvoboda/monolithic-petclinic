package org.springframework.samples.petclinic.vet;

import java.util.List;

public interface VetListView {
    List<SpecialityListView> getSpecialties();

    int getNrOfSpecialties();

    String getFirstName();

    String getLastName();
}
