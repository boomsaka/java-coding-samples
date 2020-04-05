//Mandi Li; Aashaka Desai; Peiyu Wang
import junit.framework.TestCase;

public class Lab1Test extends TestCase{

	public static void test_multiply() {
		assertEquals(6,Lab1.multiply(2, 3),0.001);}
	
	public static void test_multiply2() {
		assertEquals(5,Lab1.multiply(2, 3),0.001);
	}

	public static void test_concatenation() {
		assertEquals("23",Lab1.concatenation("2", "3"));

	}
	public static void test_concatenation2() {
		assertEquals("2 3",Lab1.concatenation("2", "3"));
	}
}
