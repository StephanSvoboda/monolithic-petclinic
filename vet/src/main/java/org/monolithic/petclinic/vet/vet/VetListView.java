package org.monolithic.petclinic.vet.vet;

import java.util.List;

public interface VetListView {
    List<SpecialityListView> getSpecialties();

    int getNrOfSpecialties();

    String getFirstName();

    String getLastName();
}
