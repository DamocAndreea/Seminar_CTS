package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.GrupaTest;
import teste.GrupaTestSetUp;
import teste.GrupaWithFakeTest;
import teste.StudentDummyTest;
import teste.TestCaseGetPromovabilitate;

@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class, GrupaTestSetUp.class, GrupaWithFakeTest.class,
	TestCaseGetPromovabilitate.class, StudentDummyTest.class})
public class SuitaCompleta {
	
}
