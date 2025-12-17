package org.archethy.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Persona {


    // Getters e Setters
    // Proprietà
    private String nome;
    private String cognome;
    private int eta;

    // Costruttore vuoto necessario per deserializzare
    public Persona() {}


    public Persona(String nome, String cognome, int eta) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // Equals & Hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return getEta() == persona.getEta() && Objects.equals(getNome(), persona.getNome()) && Objects.equals(getCognome(), persona.getCognome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCognome(), getEta());
    }

    // To String
    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                '}';
    }
}