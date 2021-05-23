package tn.esprit.spring.services;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EntrepriseServiceImplTest {

	EntrepriseServiceImpl entrepriseServiceImpl = new EntrepriseServiceImpl();

	@Test
	public void testCalculNombreDepartement() {
		assertNotEquals(-1, entrepriseServiceImpl.calculNombreDepartementByEntreprise(null));
	}

}
