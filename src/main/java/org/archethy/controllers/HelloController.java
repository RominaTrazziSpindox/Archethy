package org.archethy.controllers;

import org.springframework.web.bind.annotation.*;

@RestController


@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/saluta")
    public String salutami() {
        return "Ciao dal tuo controller + endpoint";
    }

    @GetMapping("/numero")
    public Float bohNumero() {
        return 17.5f;
    }

    @GetMapping("/saluta/{varNome}")
    public String salutaPersona(@PathVariable String varNome) {
        return "Ciao, " + varNome;
    }

    @GetMapping("/saluta/{varNome}/{varCognome}")
    public String salutaPersonaCompleta(@PathVariable String varNome, @PathVariable String varCognome) {
        return "Ciao, " + varNome + " " + varCognome;
    }

    // http://localhost:8080/hello/parametri?nom=Giovanni&cog=Pace&eta=10
    @GetMapping("/parametri")
    public String salutaParametri(
            @RequestParam(name="nom") String varNome,
            @RequestParam(name="cog") String varCognome,
            @RequestParam(name="eta") int varEta) {

        return "Ciao, " + varNome + " " + varCognome + ". So che hai: " + varEta + " anni.";
    }


    @GetMapping("/salutami")
    public String SalutaGet() {
        return "Ciao sono la GET";
    }


    @PostMapping("/salutami")
    public String SalutaPost() {
        return "Ciao sono la POST";
    }



}



