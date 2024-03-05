package edu.pladam.cda.td_spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RoleController {

    @GetMapping("/role/liste")
    public String listeRole() {
        return "Afficher liste des rôles";
    }

    @GetMapping("/role/{id}")
    public String role(@PathVariable String id) {
        return "Votre rôle est : " + id;
    }

    @PostMapping("/role")
    public String ajouterRole() {
        return "Ajoute un rôle";
    }
}
