package com.nour.enseignant.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Enseignant {

	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
    private long idEnseignant;
   
   
    @NotNull
    @Size (min = 4,max = 15)
	private String nomEnseignant;
    
    @NotNull
    @Size (min = 4,max = 15)
    private String villeEnseignant; 

    @Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent
    private Date dateNaissance;
    
    @DecimalMax("10000.0") @DecimalMin("10.0") 
    private double salaire;
    
    @ManyToOne
    private University university;


    
	public Enseignant() {
		super();
	}



	public Enseignant( String nomEnseignant, String villeEnseignant, Date dateNaissance,
			double salaire, University university) {
		super();
		
		this.nomEnseignant = nomEnseignant;
		this.villeEnseignant = villeEnseignant;
		this.dateNaissance = dateNaissance;
		this.salaire = salaire;
		this.university = university;
	}



	public long getIdEnseignant() {
		return idEnseignant;
	}



	public void setIdEnseignant(long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}



	public String getNomEnseignant() {
		return nomEnseignant;
	}



	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}



	public String getVilleEnseignant() {
		return villeEnseignant;
	}



	public void setVilleEnseignant(String villeEnseignant) {
		this.villeEnseignant = villeEnseignant;
	}



	public Date getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}



	public University getUniversity() {
		return university;
	}



	public void setUniversity(University university) {
		this.university = university;
	}



	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nomEnseignant=" + nomEnseignant + ", villeEnseignant="
				+ villeEnseignant + ", dateNaissance=" + dateNaissance + ", salaire=" + salaire + ", university="
				+ university + "]";
	}

}