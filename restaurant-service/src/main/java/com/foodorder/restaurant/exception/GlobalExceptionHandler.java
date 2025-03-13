package com.foodorder.restaurant.exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RestaurantAlreadyExistsException.class)
    public ResponseEntity<Object> handleRestaurantAlreadyExistsException(final RestaurantAlreadyExistsException exception, final HttpServletRequest request) {

        var guid = UUID.randomUUID().toString();
        log.error("Error guid ={}; Error message : {}", guid, exception.getMessage());

        var response = new ExceptionResponse(
                guid,
                exception.getErrorCode(),
                exception.getMessage(),
                exception.getHttpStatus().value(),
                exception.getHttpStatus().name(),
                request.getRequestURI(),
                request.getMethod(),
                LocalDateTime.now()
        );

        return new ResponseEntity<>(response, exception.getHttpStatus());

    }

    @ExceptionHandler(RestaurantNotFoundException.class)
    public ResponseEntity<Object> handleRestaurantNotFoundException(final RestaurantNotFoundException exception, final HttpServletRequest request) {

        var guid = UUID.randomUUID().toString();
        log.error("Error guid ={}; Error message : {}", guid, exception.getMessage());

        var response = new ExceptionResponse(
                guid,
                exception.getErrorCode(),
                exception.getMessage(),
                exception.getHttpStatus().value(),
                exception.getHttpStatus().name(),
                request.getRequestURI(),
                request.getMethod(),
                LocalDateTime.now()
        );

        return new ResponseEntity<>(response, exception.getHttpStatus());

    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Object> handleUserNotFoundException(final UserNotFoundException exception, final HttpServletRequest request) {

        var guid = UUID.randomUUID().toString();
        log.error("Error guid ={}; Error message : {}", guid, exception.getMessage());

        var response = new ExceptionResponse(
                guid,
                exception.getErrorCode(),
                exception.getMessage(),
                exception.getHttpStatus().value(),
                exception.getHttpStatus().name(),
                request.getRequestURI(),
                request.getMethod(),
                LocalDateTime.now()
        );

        return new ResponseEntity<>(response, exception.getHttpStatus());

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleUnknownException(final Exception exception, final HttpServletRequest request) {

        var guid = UUID.randomUUID().toString();
        log.error("Error guid ={}; Error message : {}", guid, exception.getMessage());

        var response = new ExceptionResponse(
                guid,
                "500",
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.name(),
                request.getRequestURI(),
                request.getMethod(),
                LocalDateTime.now()
        );

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
