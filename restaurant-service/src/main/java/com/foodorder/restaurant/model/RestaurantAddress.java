package com.foodorder.restaurant.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Document
public class RestaurantAddress {

    @Id
    String id;
    String addressLine1;
    String addressLine2;
    String addressLine3;
    String nearestLandmark;
    String city;
    String state;
    String pinCode;
    Boolean isOpen;
    Double latitude;
    Double longitude;

}
