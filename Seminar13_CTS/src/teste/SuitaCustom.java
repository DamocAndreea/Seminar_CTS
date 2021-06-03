package teste;

import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import suite.categorii.TesteGetPromovabilitate;
import suite.categorii.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({ GrupaTest.class, GrupaTestSetUp.class, GrupaWithFakeTest.class, StudentDummyTest.class,
		TestCaseGetPromovabilitate.class })
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {
	
}
