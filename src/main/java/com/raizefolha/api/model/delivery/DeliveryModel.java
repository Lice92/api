package com.raizefolha.api.model.delivery;

import com.raizefolha.api.model.address.AddressModel;
import com.raizefolha.api.model.meal.MealModel;
import com.raizefolha.api.model.user.UserModel;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "pedidos")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class DeliveryModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private UserModel user;

    @Embedded
    private MealModel meal;

    @Embedded
    private AddressModel address;

    private String comentary;

    public DeliveryModel (RegisterDeliveryData data){

        this.user = new UserModel(data.user());
        this.meal = new MealModel(data.meal());
        this.address = new AddressModel(data.address());
        this.comentary = data.comentary();

    }

    public void updateDelivery(UpdateDeliveryData data) {
        
        if (data.address() != null) {
            this.address.updateAddress(data.address());
        }
        
        if (data.comentary() != null) {
            this.comentary = data.comentary();
        }

    }

    

}
