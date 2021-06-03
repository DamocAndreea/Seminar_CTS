package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.FakeStudent;
import clase.Grupa;
import clase.IStudent;
import suite.categorii.TesteGetPromovabilitate;
import suite.categorii.TesteNormale;
import suite.categorii.TesteUrgente;

public class GrupaWithFakeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category({TesteNormale.class,TesteGetPromovabilitate.class})
	@Test
	public void promovabilitateFaraRestanteTest() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestanta(false);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);

		assertEquals(1, grupa.getPromovabilitate(), 0.01f);
	}
	
	@Category({TesteUrgente.class,TesteGetPromovabilitate.class})
	@Test
	public void promovabilitateCuRestanteTest() {
		FakeStudent studentFake = new FakeStudent();
		studentFake.setAreRestanta(true);
		Grupa grupa = new Grupa(1079);
		grupa.adaugaStudent(studentFake);

		assertEquals(0, grupa.getPromovabilitate(), 0.01f);

	}

}
