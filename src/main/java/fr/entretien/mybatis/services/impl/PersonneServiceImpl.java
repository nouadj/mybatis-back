package fr.entretien.mybatis.services.impl;

import fr.entretien.mybatis.mappers.PersonneMapper;
import fr.entretien.mybatis.models.PersonneImmutable;
import fr.entretien.mybatis.models.PersonneMutable;
import fr.entretien.mybatis.services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonneServiceImpl implements PersonneService {


    private final PersonneMapper personneMapper;
    @Autowired
    public PersonneServiceImpl(PersonneMapper personneMapper) {
        this.personneMapper = personneMapper;
    }

    @Override
    public List<PersonneImmutable> findAll() {
        return personneMapper.getAllPersonnes();
    }

    @Override
    public void add(PersonneMutable personne) {
         personneMapper.insertPersonne(personne);
    }
}
