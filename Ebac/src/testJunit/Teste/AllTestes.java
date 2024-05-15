package testJunit.Teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testJunit.ExemploJunit1;
import testJunit.ExemploJunit1Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExemploJunit1.class, ExemploJunit1Test.class})
public class AllTestes {

}
