
package com.example.Carservicecompany.exception;

import java.util.HashSet;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalExceptionHandler {

	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Set<String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
       Set<String> resp=new HashSet<>();
       ex.getBindingResult().getAllErrors().forEach((error)->{
            String message=error.getDefaultMessage();
            resp.add(message);
            	});

			return new ResponseEntity<Set<String>>(resp,HttpStatus.BAD_REQUEST);
	 
		}

	@ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String ResourceNotFoundException(ResourceNotFoundException e)
	{
      return e.getMessage();
 }
}