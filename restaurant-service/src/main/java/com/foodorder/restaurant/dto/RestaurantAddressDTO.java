package com.foodorder.restaurant.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Builder
public class RestaurantAddressDTO {

    @NotBlank(message = "address line 1 cannot be blank")
    String addressLine1;

    @NotBlank(message = "address line 2 cannot be blank")
    String addressLine2;

    String addressLine3;

    String nearestLandmark;

    @NotBlank(message = "city cannot be blank")
    String city;

    @NotBlank(message = "state cannot be blank")
    String state;

    @NotBlank(message = "pin code cannot be blank")
    String pinCode;

    @NotBlank(message = "restaurant is opened cannot be blank")
    Boolean isOpen;

    @NotBlank(message = "latitude be blank")
    Double latitude;

    @NotBlank(message = "longitude cannot be blank")
    Double longitude;

}
