package guru.springframework.sfgpetclinic.model;

import lombok.Data;

@Data
public class Vet extends Person {

    private String firstName;

    private String lastName;

    public Vet(int i, String s, String ramirez) {
        super();
        super.setId((long) i);
    }
}
