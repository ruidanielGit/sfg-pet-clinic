package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.PetService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.PetServiceMap;
import services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {


        //10 Owner instances
        ownerService.save(new Owner(1, "John", "Doe"));
        ownerService.save(new Owner(2, "Jane", "Smith"));
        ownerService.save(new Owner(3, "Michael", "Johnson"));
        ownerService.save(new Owner(4, "Emily", "Brown"));
        ownerService.save(new Owner(5, "David", "Wilson"));
        ownerService.save(new Owner(6, "Sarah", "Lee"));
        ownerService.save(new Owner(7, "Robert", "Taylor"));
        ownerService.save(new Owner(8, "Emma", "Martinez"));
        ownerService.save(new Owner(9, "Christopher", "Anderson"));
        ownerService.save(new Owner(10, "Olivia", "Thomas"));

        System.out.println("Loaded Owners...");

        //10 Vet instances
        vetService.save(new Vet(101, "Dr. Jessica", "Robinson"));
        vetService.save(new Vet(102, "Dr. Benjamin", "Garcia"));
        vetService.save(new Vet(103, "Dr. Sophia", "Hernandez"));
        vetService.save(new Vet(104, "Dr. William", "Lopez"));
        vetService.save(new Vet(105, "Dr. Isabella", "Gonzalez"));
        vetService.save(new Vet(106, "Dr. James", "Perez"));
        vetService.save(new Vet(107, "Dr. Mia", "Sanchez"));
        vetService.save(new Vet(108, "Dr. Alexander", "Rivera"));
        vetService.save(new Vet(109, "Dr. Ava", "Torres"));
        vetService.save(new Vet(110, "Dr. Ethan", "Ramirez"));

        System.out.println("Loaded Vets...");
    }
}
