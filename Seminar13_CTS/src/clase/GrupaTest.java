package clase;

import static org.junit.Assert.*;
import org.junit.Test;

public class GrupaTest {
	@Test
	public void constructorTest() {
		Grupa grupa = new Grupa(1055);
		assertEquals(1055, grupa.getNrGrupa());
	}

	@Test
	public void testareLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void inAfaraLimitelorTest() {
		Grupa grupa = new Grupa(1300);
	}

	@Test(timeout = 1000)
	public void performantaTest() {
		Grupa grupa = new Grupa(1050);
	}

	@Test
	public void corectitudinePromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for (int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(i);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.6f, grupa.getPromovabilitate(), .001f);
	}
}
