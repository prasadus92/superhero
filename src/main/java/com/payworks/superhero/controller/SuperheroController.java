package com.payworks.superhero.controller;

import com.payworks.superhero.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author prasa on 05-02-2018
 * @project superhero
 */
public class SuperheroController {
    @Autowired
    private SuperheroService superheroService;

    @RequestMapping(value = "/api/v1/superhero/list", method = RequestMethod.GET)
    public ResponseEntity listAllSuperheros() {
        return new ResponseEntity(null, HttpStatus.OK);
    }
}
