package com.nour.enseignant.services;
import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.entities.University;

public interface EnseignantService {
    Enseignant saveEnseignant(Enseignant e);
    Enseignant updateEnseignant(Enseignant e);
    void deleteEnseignant(Enseignant e);
    void deleteEnseignantById(Long idEnseignant);
    Enseignant getEnseignant(Long idEnseignant);
    List<Enseignant> getAllEnseignant();
    Page<Enseignant> getAllEnseignantParPage(int page, int size);
    List<University> getAllUniversities();
    
    
	
	 List<Enseignant> findByNomEnseignant(String nom);
	 List<Enseignant>findByNomEnseignantContains(String nom); 
	 List<Enseignant> findByNomSalaire(@Param("nom") String nom,@Param("salaire") Double salaire); 
	 List<Enseignant>findByUniversity (University university); 
	 List<Enseignant>findByUniversityIdUniversity(Long id); 
	 List<Enseignant>findByOrderByNomEnseignant(); 
	 List<Enseignant> trierEnseignantNomSalaire();
	
	 
}