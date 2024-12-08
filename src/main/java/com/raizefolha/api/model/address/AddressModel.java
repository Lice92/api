package com.raizefolha.api.model.address;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressModel {
    
    private String street;
    private String neighborhood;
    private String cep;
    private String number;
    private String complement;


    public AddressModel (AddressData data){

        this.street = data.street();
        this.neighborhood = data.neighborhood();
        this.cep = data.cep();
        this.number = data.number();
        this.complement = data.complement();

    }

    public void updateAddress(AddressData data) {

        if (data.street() != null){
            this.street = data.street();
        }

        if (data.neighborhood() != null){
            this.neighborhood = data.neighborhood();
        }

        if (data.cep() != null) {
            this.cep = data.cep();
        }

        if (data.number() != null) {
            this.number = data.number();
        }

        if (data.complement() != null) {
            this.complement = data.complement();
        }

    }

}
