package fr.entretien.mybatis.mappers;


import fr.entretien.mybatis.models.PersonneImmutable;
import fr.entretien.mybatis.models.PersonneMutable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonneMapper {

 @Select("SELECT * FROM personne")
 List<PersonneImmutable> getAllPersonnes();

 @Select("SELECT * FROM personne WHERE id = #{id}")
 PersonneImmutable getPersonneById(Long id);

 @Insert("INSERT INTO personne (id, nom, prenom, adresse) VALUES (#{id} ,#{nom}, #{prenom}, #{adresse})")
 @Options(useGeneratedKeys = true, keyProperty = "id")
 void insertPersonne(PersonneMutable personne);

 @Update("UPDATE personne SET nom = #{nom}, prenom = #{prenom}, adresse = #{adresse} WHERE id = #{id}")
 void updatePersonne(PersonneMutable personne);

 @Delete("DELETE FROM personne WHERE id = #{id}")
 void deletePersonne(Long id);

}