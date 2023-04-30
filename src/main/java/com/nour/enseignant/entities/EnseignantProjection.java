package com.nour.enseignant.entities;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "nomEns", types = { Enseignant.class })
public interface EnseignantProjection {
	public String getNomEnseignant();

}
