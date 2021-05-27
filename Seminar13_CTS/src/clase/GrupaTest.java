package clase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GrupaTest {
	Grupa grupa;

	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1010);
		for (int i = 1; i < 36; i++) {
			Student student = new Student();
			student.adaugaNota(i % 10 + 1);
			grupa.adaugaStudent(student);
		}
	}

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

	@Test
	public void limitaInferioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for (int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(1);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0f, grupa.getPromovabilitate(), .001f);
	}

	@Test
	public void limitaSuperioaraPromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for (int i = 1; i < 11; i++) {
			Student student = new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1f, grupa.getPromovabilitate(), .001f);
	}

	@Test
	public void bounderyPromovabilitate() {
		Grupa grupa = new Grupa(1010);
		assertEquals(0, grupa.getPromovabilitate(), 0.001f);
	}

	@Test(timeout = 100)
	public void performancePromovabilitateTest() {
		Grupa grupa = new Grupa(1005);
		for (int i = 1; i < 36; i++) {
			Student student = new Student();
			student.adaugaNota(i % 10 + 1);
			grupa.adaugaStudent(student);
		}
		grupa.getPromovabilitate();
	}

	@Test
	public void cardinalityPromovabilitateTest() {
		Grupa grupa = new Grupa(1050);
		Student student = new Student();
		student.adaugaNota(5);
		grupa.adaugaStudent(student);
		assertEquals(1f, grupa.getPromovabilitate(), 0.001f);
	}

}
