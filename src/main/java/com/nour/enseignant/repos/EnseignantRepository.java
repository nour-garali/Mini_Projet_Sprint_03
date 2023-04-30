package com.nour.enseignant.repos;
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.entities.University;


@RepositoryRestResource(path = "rest")
public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	
	List<Enseignant> findByNomEnseignant(String nom);
	
	List<Enseignant> findByNomEnseignantContains(String nom);
	
	@Query("select e from Enseignant e where e.nomEnseignant like %:nom and e.salaire > :salaire")
	List<Enseignant> findByNomSalaire (@Param("nom") String nom,@Param("salaire") Double salaire);
	
	
	
	@Query("select e from Enseignant e where e.university = ?1")
	List<Enseignant> findByUniversity (University university);
	
	List<Enseignant> findByUniversityIdUniversity(Long idUniversity);
	
	List<Enseignant> findByOrderByNomEnseignant();
	
	

	@Query("select e from Enseignant e order by e.nomEnseignant ASC, e.salaire DESC")
	List<Enseignant> trierEnseignantsNomEnseignantSalaire ();
	
	

	
	
	
}







