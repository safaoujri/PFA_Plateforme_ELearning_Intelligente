package pfa.utilisateurserver.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pfa.utilisateurserver.entity.Utilisateur;
import pfa.utilisateurserver.repository.UtilisateurRepository;

import java.util.List;
@AllArgsConstructor
@RestController
public class UtilisateurController {
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @GetMapping("/user")
    public List findAll() {
        return utilisateurRepository.findAll();
    }
    @GetMapping("/user/{id}")
    public Utilisateur findById(@PathVariable int id) throws Exception{
        return this.utilisateurRepository.findById((long) id).orElseThrow(()->new
                Exception("User inexistant"));
    }
}

