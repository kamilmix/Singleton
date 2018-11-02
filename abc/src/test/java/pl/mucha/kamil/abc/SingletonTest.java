package pl.mucha.kamil.abc;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class SingletonTest 
 
{
@Test
    public void testApp()
    {
    	Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		assertSame("Singleton moze miec tylko jedną instancje", s, s2);
    }
}
