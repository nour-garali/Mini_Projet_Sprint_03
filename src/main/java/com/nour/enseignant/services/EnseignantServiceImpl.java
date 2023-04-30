package com.nour.enseignant.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.entities.University;
import com.nour.enseignant.repos.EnseignantRepository;
import com.nour.enseignant.repos.UniversityRepository;

@Service
public class EnseignantServiceImpl implements EnseignantService {
    @Autowired
    EnseignantRepository enseignantRepository;
    @Autowired
    UniversityRepository universityRepository;

    @Override
    public Enseignant saveEnseignant(Enseignant e) {
        return enseignantRepository.save(e);
    }

    @Override
    public Enseignant updateEnseignant(Enseignant e) {
        return enseignantRepository.save(e);
    }

    @Override
    public void deleteEnseignant(Enseignant e) {
        enseignantRepository.delete(e);
    }

    @Override
    public void deleteEnseignantById(Long id) {
        enseignantRepository.deleteById(id);
    }

    @Override
    public Enseignant getEnseignant(Long id) {
        return enseignantRepository.findById(id).get();
    }

    @Override
    public List<Enseignant> getAllEnseignant() {
        return enseignantRepository.findAll();
    }

    @Override
    public Page<Enseignant> getAllEnseignantParPage(int page, int size) {
        return enseignantRepository.findAll(PageRequest.of(page, size));
    }
    
    
    
    
    
    @Override
    public List<Enseignant> findByNomEnseignant(String nom){
    	return enseignantRepository.findByNomEnseignant(nom);
    }
    @Override
    public  List<Enseignant>findByNomEnseignantContains(String nom){
    	return enseignantRepository.findByNomEnseignantContains(nom);
    
    }
    @Override
    public  List<Enseignant> findByNomSalaire(@Param("nom") String nom,@Param("salaire") Double salaire){
    	return enseignantRepository.findByNomSalaire(nom,salaire);
        
    }
    @Override
    public List<Enseignant>findByUniversity (University university){
    	return enseignantRepository.findByUniversity(university);
        
    }
    @Override
    public List<Enseignant>findByUniversityIdUniversity(Long id){
    	return enseignantRepository.findByUniversityIdUniversity(id);
        
    }
    
    @Override
    public List<Enseignant>findByOrderByNomEnseignant(){
    	return enseignantRepository.findByOrderByNomEnseignant();
        
    }
    @Override
    public  List<Enseignant> trierEnseignantNomSalaire(){
    	return enseignantRepository.trierEnseignantsNomEnseignantSalaire();
        
    }
    
    

	@Override
	public List<University> getAllUniversities() {
		
		return universityRepository.findAll() ;
	}
	 
    
    
    
    
    
}