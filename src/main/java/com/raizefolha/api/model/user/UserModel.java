package com.raizefolha.api.model.user;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "usuarios")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class UserModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String telephone;

    public UserModel (RegisterUserData data) {

        this.name = data.name();
        this.email = data.email();
        this.password = data.password();
        this.telephone = data.telephone();

    }    
    
    public void updateData(UpdateUserData data){

        if (data.email() != null){
            this.email = data.email();
        }

        if (data.password() != null) {
            this.password = data.password();
        }

        if (data.telephone() != null){
            this.telephone = data.telephone();
        }

    }

}
