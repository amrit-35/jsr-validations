package com.example.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public final ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex,
                                                                  WebRequest request) {
//        List<ApiFieldError> apiFieldErrors = new ArrayList<>();
//        for(ConstraintViolation violation : ex.getConstraintViolations()) {
//
//            ApiFieldError error = new ApiFieldError(
//                    String.format("%s value '%s' %s", violation.getPropertyPath()),
//                    violation.getInvalidValue() != null ? violation.getInvalidValue().toString() : "",
//                    violation.getMessage());
//            apiFieldErrors.add(error);
//        }
//
//        RestApiResponse<RestApiStatus, ApiErrorsView> apiResponse = prepareErrorView(apiFieldErrors, prepareApiStatus(request, ApiStatus.INVALID_PAYLOAD, HttpStatus.BAD_REQUEST, ex));
//
//        logger.debug("end handleConstraintViolation");
//
//        return new ResponseEntity<>(apiResponse,  HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }

}
