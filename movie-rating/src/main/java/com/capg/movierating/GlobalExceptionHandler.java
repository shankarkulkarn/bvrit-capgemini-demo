package com.capg.movierating;
import java.time.LocalDateTime;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capg.movierating.exception.ErrorInfo;
import com.capg.movierating.exception.MovieException;





@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MovieException.class)
	public @ResponseBody ResponseEntity<ErrorInfo> handleException(MovieException ex,HttpServletRequest req)
	{
		
		 String message=ex.getMessage();
		 String uri= req.getRequestURI();
		 
		 ErrorInfo  obj = new ErrorInfo(LocalDateTime.now(),message,uri);
		 ResponseEntity<ErrorInfo>  re = new ResponseEntity<ErrorInfo>(obj,HttpStatus.NOT_FOUND);
		 return re ;
	}
}
	