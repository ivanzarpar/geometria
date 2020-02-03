

import static org.junit.Assert.*;

import org.junit.Test;

public class Circulotest {

	@Test
	public void testArea01() {
		Circulo_IZP c=new Circulo_IZP(7,"Circulo");
		assertEquals((7*7*3.1416),c.area(),0.01);
	}
	@Test
	public void testArea02() {
		Circulo_IZP c=new Circulo_IZP(7,"Circulo");
		assertEquals((0*0*3.1416),c.area(),0.01);
	}
	@Test
	public void testArea03() {
		Circulo_IZP c=new Circulo_IZP(7,"Circulo");
		assertEquals((-3*-3*3.1416),c.area(),0.01);
	}
	@Test
	public void testPerimetro01() {
		Circulo_IZP c=new Circulo_IZP(7,"Circulo");
		assertEquals((7*7*3.1416),c.perimetro(),0.01);;
	}
	@Test
	public void testPerimetro02() {
		Circulo_IZP c=new Circulo_IZP(7,"Circulo");
		assertEquals((0*0*3.1416),c.perimetro(),0.01);;
	}
	@Test
	public void testPerimetro03() {
		Circulo_IZP c=new Circulo_IZP(7,"Circulo");
		assertEquals((-3*-3*3.1416),c.perimetro(),0.01);;
	}

	

}
