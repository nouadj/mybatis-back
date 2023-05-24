package fr.entretien.mybatis.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonneMutable {
    private Integer id;
    private String nom;
    private String prenom;
    private String adresse;
}
