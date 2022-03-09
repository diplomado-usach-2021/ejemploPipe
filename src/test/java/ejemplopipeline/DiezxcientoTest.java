package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {
	Diezxciento diezxciento = new Diezxciento(23000000,900000);


	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(2300000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		assertEquals(0.0, diezxciento.impuesto(diezxciento.sueldo), 0.001);

	}

	@Test
	public void testSaldoAhorro() throws Exception {
		assertEquals(20700000, diezxciento.saldoAhorro());
	}
	



}
