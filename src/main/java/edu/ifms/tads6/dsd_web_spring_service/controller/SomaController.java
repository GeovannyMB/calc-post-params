package edu.ifms.tads6.dsd_web_spring_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifms.tads6.dsd_web_spring_service.model.Soma;

@RestController
@RequestMapping(value = "/soma")
public class SomaController {

    @GetMapping("/{numberOne}/{numberTwo}")
    public Integer add(@PathVariable("numberOne") int n1, @PathVariable("numberOne") int n2) {
        return new Soma(n1, n2).getResult();
    }

    @PostMapping
    public Integer addByPost(@RequestBody Soma soma) {
        return soma.getResult();
    }
}
