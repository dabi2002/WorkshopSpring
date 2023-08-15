package com.example.Validator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("api/v1/validador")
public class RestController {

    @PostMapping()
    public boolean validar(@RequestBody String valor){
        return valor.equals("Hola");
    }
}
