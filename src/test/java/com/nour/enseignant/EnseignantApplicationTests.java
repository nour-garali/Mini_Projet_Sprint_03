package com.nour.enseignant;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.nour.enseignant.entities.Enseignant;
import com.nour.enseignant.entities.University;
import com.nour.enseignant.repos.EnseignantRepository;



@SpringBootTest
class EnseignantApplicationTests {
	
	@Autowired
	private EnseignantRepository enseignantRepository;


	
	@Test
	public void testFindByNomEnseignant()
	{
	List<Enseignant> enseignants = enseignantRepository.findByNomEnseignantContains("alia");
	for (Enseignant p : enseignants)
	{
	System.out.println(p);
	}
	}
	

    


	@Test
	public void testFindByNomEnseignantContains ()
	{
	List<Enseignant> enseignants=enseignantRepository.findByNomEnseignantContains("a");
	for (Enseignant p : enseignants)
	{
	System.out.println(p);
	} }
	
	
	
	@Test
	public void testFindByNomSalaire()
	{
	List<Enseignant> Enseignants = enseignantRepository.findByNomSalaire("rania", 1000.0);
	for (Enseignant p : Enseignants)
	{
	System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByUniversity()
	{
		University Unv = new University();
	Unv.setIdUniversity(3L);
	List<Enseignant> Enseignants = enseignantRepository.findByUniversity(Unv);
	for (Enseignant e : Enseignants)
	{
	System.out.println(e);
	}
	}
	
	
	
	@Test public void testFindByIdUniversity() 
	{ 
		List<Enseignant> Enseignants =enseignantRepository.findByUniversityIdUniversity(1L); 
		for (Enseignant e : Enseignants)
			  { System.out.println(e); } }
			 
	
	@Test public void testFindByOrderByNomEnseignant() { List<Enseignant>
	  Enseignants = enseignantRepository.findByOrderByNomEnseignant(); for
	  (Enseignant e : Enseignants) { System.out.println(e); } }
	 
	
	
	@Test public void testTrierEnseignantNomSalaire() { List<Enseignant> Enseignants =
			  enseignantRepository.trierEnseignantsNomEnseignantSalaire(); for (Enseignant e  : Enseignants)
			  { System.out.println(e); } }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Test public void testFindByNomEnseignantContains () { List<Enseignant>
	 * enseignants=enseignantRepository.findByNomEnseignantContains("a"); for
	 * (Enseignant p : enseignants) { System.out.println(p); } }
	 * 
	 * @Test public void testFindByNomSalaire() { List<Enseignant> Enseignants =
	 * enseignantRepository.findByNomSalaire("rania", 1000.0); for (Enseignant p :
	 * Enseignants) { System.out.println(p); } }
	 * 
	 * 
	 * @Test public void testfindByUniversity() { University u = new University();
	 * u.setIdUniversity(1L); List<Enseignant> Enseignants =
	 * enseignantRepository.findByUniversity(u); for (Enseignant e : Enseignants) {
	 * System.out.println(e); } }
	 * 
	 * @Test public void testFindByIdUniversity() { List<Enseignant> Enseignants =
	 * enseignantRepository.findByIdUniversity(1L); for (Enseignant e : Enseignants)
	 * { System.out.println(e); } }
	 * 
	 * 
	 * 
	 * @Test public void testFindByOrderBynomEnseignantAsc() { List<Enseignant>
	 * Enseignants = enseignantRepository.findByOrderBynomEnseignantAsc(); for
	 * (Enseignant e : Enseignants) { System.out.println(e); } }
	 * 
	 * 
	 * 
	 * 
	 * @Test public void testTrierEnseignantnomEsalaire() { List<Enseignant> prods =
	 * enseignantRepository.trierEnseignantnomEsalaire(); for (Enseignant p : prods)
	 * { System.out.println(p); } }
	 * 
	 * 
	 * 
	 * 
	 */

}
