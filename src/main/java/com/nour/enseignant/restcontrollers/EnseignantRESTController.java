package com.nour.enseignant.restcontrollers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.services.EnseignantService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class EnseignantRESTController {
	@Autowired
	EnseignantService EnseignantService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Enseignant> getAllEnseignant() {
	return EnseignantService.getAllEnseignant();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Enseignant getEnseignantById(@PathVariable("id") Long id) {
	return EnseignantService.getEnseignant(id);
	 }

	
	@RequestMapping(method = RequestMethod.POST)
	public Enseignant createEnseignant(@RequestBody Enseignant enseignant) {
	return EnseignantService.saveEnseignant(enseignant);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Enseignant updateEnseignant(@RequestBody Enseignant enseignant) {
	return EnseignantService.updateEnseignant(enseignant);
	}

	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEnseignant(@PathVariable("id") Long id)
	{
		EnseignantService.deleteEnseignantById(id);
	}
	
	@RequestMapping(value="/ensuniv/{idUniv}",method = RequestMethod.GET)
	public List<Enseignant> getEnseignantsByUnivId(@PathVariable("idUniv") Long idUniv) {
	return EnseignantService.findByUniversityIdUniversity(idUniv);
	}
	
	
	}

