package com.foodorder.restaurant.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class RestaurantAlreadyExistsException extends RuntimeException {

    private final String errorCode;
    private final String message;
    private final HttpStatus httpStatus;

}
