package com.foodorder.restaurant.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
public class RestaurantDTO {

    @NotBlank(message = "name cannot be blank")
    String name;

    @NotBlank(message = "contact number cannot be blank")
    String contactNumber;

    @NotBlank(message = "description cannot be blank")
    String description;

    @NotBlank(message = "restaurant email cannot be blank")
    String email;

    @NotBlank(message = "cuisine type cannot be blank")
    List<String> cuisineType;

    @NotBlank(message = "restaurant address cannot be blank")
    List<RestaurantAddressDTO> restaurantAddressList;

    Double ratings;

    @NotBlank(message = "opening time cannot be blank")
    LocalTime openingTime;

    @NotBlank(message = "closing time cannot be blank")
    LocalTime closingTime;


}
