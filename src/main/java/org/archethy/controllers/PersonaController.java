package org.archethy.controllers;

import org.archethy.models.Persona;
import org.springframework.web.bind.annotation.*;

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

    /* GET MAPPING - METODO NON CORRETTO PER INVIARE INFORMAZIONI AL SERVER */
    /* NON C'E' UN PAYLOAD, SOLO PARAMETRI O VARIABILI */

    // Se non vengono inseriti tutti i parametri, oppure se i parametri non corrispondono al tipo indicato il server risponde 400: BadRequest
    @GetMapping("/nuova")
    public Persona nuovaPersona(
                @RequestParam(name="nom") String varNome,
                @RequestParam(name="cog") String varCognome,
                @RequestParam(name="eta") int varEta
            )
    {
        // Crea un oggetto di tipo Persona
        Persona persona = new Persona(varNome, varCognome, varEta);

        // Restituisci l'oggetto quando fai la chiamata
        return persona;
    }

    /* POST MAPPING - METODO GIUSTO PER PER INVIARE INFORMAZIONI AL SERVER | SI PUO' TESTARE SOLO CON POSTMAN SE NON C'E' GUI */
    /* RICHIESTE REQUESTBODY PER INVIARE PAYLOAD E SERIALIZZARE UN OGGETTO TRASFORMANDOLO IN JSON */

    @PostMapping("/inserisci")
    public Persona inserisciPersona(@RequestBody Persona persona) {
        return persona;
    }




}
