package com.foodorder.restaurant.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
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
    LocalTime openingTime;
    LocalTime closingTime;
    @CreationTimestamp
    LocalDate createdOn;
    @UpdateTimestamp
    LocalDate updatedOn;

}
