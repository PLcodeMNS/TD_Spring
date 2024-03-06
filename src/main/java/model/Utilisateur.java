package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String login;

    private String motDePasse;

}
