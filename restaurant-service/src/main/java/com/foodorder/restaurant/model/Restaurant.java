package com.foodorder.restaurant.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Document
public class Restaurant {

    @Id
    String id;
    String name;
    String contactNumber;
    String description;
    String image;
    String cuisineType;
    List<RestaurantAddress> restaurantAddressList;
    Double ratings;

}
