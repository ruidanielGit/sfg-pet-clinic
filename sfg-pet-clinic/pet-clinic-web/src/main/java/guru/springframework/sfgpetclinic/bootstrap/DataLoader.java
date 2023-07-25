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

    public DataLoader(OwnerService ownerService) {
        this.ownerService = ownerService;

        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner(1, "John", "Doe");
        Owner owner2 = new Owner(2, "Jane", "Smith");
        Owner owner3 = new Owner(3, "Michael", "Johnson");
        Owner owner4 = new Owner(4, "Emily", "Brown");
        Owner owner5 = new Owner(5, "David", "Wilson");
        Owner owner6 = new Owner(6, "Sarah", "Lee");
        Owner owner7 = new Owner(7, "Robert", "Taylor");
        Owner owner8 = new Owner(8, "Emma", "Martinez");
        Owner owner9 = new Owner(9, "Christopher", "Anderson");
        Owner owner10 = new Owner(10, "Olivia", "Thomas");

        //10 Owner instances
        for (Owner owner : Arrays.asList(owner1, owner2, owner3, owner4, owner5, owner6, owner7, owner8, owner9, owner10)) {
            ownerService.save(owner);
        }

        System.out.println("Loaded Owners...");

        //10 Vet instances
        Vet vet1 = new Vet(101, "Dr. Jessica", "Robinson");
        Vet vet2 = new Vet(102, "Dr. Benjamin", "Garcia");
        Vet vet3 = new Vet(103, "Dr. Sophia", "Hernandez");
        Vet vet4 = new Vet(104, "Dr. William", "Lopez");
        Vet vet5 = new Vet(105, "Dr. Isabella", "Gonzalez");
        Vet vet6 = new Vet(106, "Dr. James", "Perez");
        Vet vet7 = new Vet(107, "Dr. Mia", "Sanchez");
        Vet vet8 = new Vet(108, "Dr. Alexander", "Rivera");
        Vet vet9 = new Vet(109, "Dr. Ava", "Torres");
        Vet vet10 = new Vet(110, "Dr. Ethan", "Ramirez");

        //10 Vet instances
        for (Vet vet : Arrays.asList(vet1, vet2, vet3, vet4, vet5, vet6, vet7, vet8, vet9, vet10)) {
            vetService.save(vet);
        }

        System.out.println("Loaded Vets...");
    }
}
