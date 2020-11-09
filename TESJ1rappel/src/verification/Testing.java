package verification;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Testing {
Verifnumber vn;
@Before
public void beforetesting()
{
 vn=new Verifnumber();	

}
@Test
public void deuxentier()
{
Assert.assertEquals(false, vn.nonnull(4, 0));

}
@Test
public void testepositif()
{
Assert.assertEquals(true, vn.positive(2, 1));	

}

@Test
public void testeA()
{
Assert.assertEquals(false, vn.verifa(0));	
}
@Test
public void testdivise()
{
	
Assert.assertEquals(true, vn.divise(7));
}
@Test
public void pgcdteste()
{
	
Assert.assertEquals(true, vn.pgcd(4, 18));
}
}
