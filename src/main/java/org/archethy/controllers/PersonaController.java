package org.archethy.controllers;

import org.archethy.models.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController

@RequestMapping("/persona")
public class PersonaController {

    @GetMapping("/dettaglio")
    public Persona retrievePersona() {
        Persona person;
        person = new Persona("Romy", "Trazzi", 37);
        return person;
    }

    @GetMapping("/elenco")
    public List<Persona> elencoPersone() {
        List<Persona> elenco = new ArrayList<>();
        elenco.add(new Persona("Giovanni", "Pace", 36));
        elenco.add(new Persona("Valeria", "Verdi", 35));
        elenco.add(new Persona("Marika", "Marico", 24));
        return elenco;
    }

}
