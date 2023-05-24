package fr.entretien.mybatis.controllers;

import fr.entretien.mybatis.models.PersonneImmutable;
import fr.entretien.mybatis.models.PersonneMutable;
import fr.entretien.mybatis.services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonneController {
    @Autowired
    PersonneService personneService;

    @GetMapping("/personnes")
    List<PersonneImmutable> findAll(){
        return personneService.findAll();
    }

    @PostMapping("/personnes")
    public ResponseEntity<PersonneMutable> add(@RequestBody PersonneMutable personne) {
        // Ajouter la personne dans la base de données
        this.personneService.add(personne);
        // Renvoyer une réponse HTTP 201 (Created) avec la personne ajouté dans le corps de la réponse
        return ResponseEntity.status(HttpStatus.CREATED).body(personne);
    }

}
