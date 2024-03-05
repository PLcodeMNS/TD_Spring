package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public class Utilisateur {

    private int id;

    private String login;

    private String motDePasse;

}
