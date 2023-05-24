package fr.entretien.mybatis.services;

import fr.entretien.mybatis.models.PersonneImmutable;
import fr.entretien.mybatis.models.PersonneMutable;

import java.util.List;

public interface PersonneService {
    List<PersonneImmutable> findAll();
    void add(PersonneMutable personne);
}
