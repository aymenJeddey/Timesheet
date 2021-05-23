package tn.esprit.spring.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class EmployeServiceImplTest {
	
	EmployeServiceImpl employeServiceImpl = new EmployeServiceImpl();

	@Test
	public void testEmployeWithoutTimesheet() {
	assertEquals(0, employeServiceImpl.getListEmployesWithoutTimesheet().size());
	}

}
