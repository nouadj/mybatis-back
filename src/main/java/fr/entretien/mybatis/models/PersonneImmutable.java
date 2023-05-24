package fr.entretien.mybatis.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

public record PersonneImmutable (@JsonIgnore Integer id, String nom, String prenom, String adresse) {




}
