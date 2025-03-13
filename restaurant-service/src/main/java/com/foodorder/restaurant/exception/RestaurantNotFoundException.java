package com.foodorder.restaurant.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class RestaurantNotFoundException extends RuntimeException {

    private final String errorCode;
    private final String message;
    private final HttpStatus httpStatus;

}
