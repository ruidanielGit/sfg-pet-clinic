package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetServiceMap vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner("John", "Doe");
        Owner owner2 = new Owner("Jane", "Smith");
        Owner owner3 = new Owner("Michael", "Johnson");
        Owner owner4 = new Owner("Emily", "Brown");
        Owner owner5 = new Owner("David", "Wilson");
        Owner owner6 = new Owner("Sarah", "Lee");
        Owner owner7 = new Owner("Robert", "Taylor");
        Owner owner8 = new Owner("Emma", "Martinez");
        Owner owner9 = new Owner("Christopher", "Anderson");
        Owner owner10 = new Owner("Olivia", "Thomas");

        //10 Owner instances
        for (Owner owner : Arrays.asList(owner1, owner2, owner3, owner4, owner5, owner6, owner7, owner8, owner9, owner10)) {
            ownerService.save(owner);
        }

        System.out.println("Loaded Owners... Size: " + ownerService.findAll().size());

        //10 Vet instances
        Vet vet1 = new Vet("Dr. Jessica", "Robinson");
        Vet vet2 = new Vet("Dr. Benjamin", "Garcia");
        Vet vet3 = new Vet("Dr. Sophia", "Hernandez");
        Vet vet4 = new Vet("Dr. William", "Lopez");
        Vet vet5 = new Vet("Dr. Isabella", "Gonzalez");
        Vet vet6 = new Vet("Dr. James", "Perez");
        Vet vet7 = new Vet("Dr. Mia", "Sanchez");
        Vet vet8 = new Vet("Dr. Alexander", "Rivera");
        Vet vet9 = new Vet("Dr. Ava", "Torres");
        Vet vet10 = new Vet("Dr. Ethan", "Ramirez");

        //10 Vet instances
        for (Vet vet : Arrays.asList(vet1, vet2, vet3, vet4, vet5, vet6, vet7, vet8, vet9, vet10)) {
            vetService.save(vet);
        }

        System.out.println("Loaded Vets... Size: " + vetService.findAll().size());


    }
}
