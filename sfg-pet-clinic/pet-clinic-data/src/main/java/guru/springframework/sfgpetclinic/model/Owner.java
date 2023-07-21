package guru.springframework.sfgpetclinic.model;

import lombok.Data;

@Data
public class Owner extends BaseEntity {

    private String firstName;

    private String lastName;


    public Owner(int i, String john, String doe) {
        super();
    }
}
