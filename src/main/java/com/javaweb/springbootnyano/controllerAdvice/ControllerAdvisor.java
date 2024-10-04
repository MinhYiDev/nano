package com.javaweb.springbootnyano.controllerAdvice;


import com.javaweb.springbootnyano.dto.response.error.CustomDataErrorDTO;
import com.javaweb.springbootnyano.dto.response.error.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ErrorResponseDTO> handleArithmeticException(ArithmeticException ex, WebRequest ws) {
        ErrorResponseDTO result = new ErrorResponseDTO();
        result.setStatus(false);
        CustomDataErrorDTO data = new CustomDataErrorDTO();
        List<CustomDataErrorDTO> items = new ArrayList<CustomDataErrorDTO>();


        data.setMsg("ERROR");

        CustomDataErrorDTO data1 = new CustomDataErrorDTO();

        data1.setMsg(ex.getMessage().trim().toUpperCase());


        items.add(data);
        items.add(data1);


        result.setData(items);

        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }
}
