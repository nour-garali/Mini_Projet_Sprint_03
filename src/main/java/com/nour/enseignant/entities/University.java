package com.nour.enseignant.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class University {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idUniversity;
private String nomUiversity;
private String villeUniversity;
private int nbEnseigant;



@OneToMany(mappedBy = "university")
@JsonIgnore
private List<Enseignant> enseignants;




}






