

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.Counter;


public class CounterTestCase {
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	@Test
	public void testOddNumbers() {
		// Getting the odd occurrences
		int amount = counter.getOddOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	
	@Test
	public void testMultiples1() {
		// Getting the odd occurrences
		int amount = counter.getMultiplesOf(1);
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	@Test
	public void testMultiples5() {
		// Getting the odd occurrences
		int amount = counter.getMultiplesOf(5);
		// I check the amount is the expected one
		assertEquals(amount, 2);
	}
	
	@Test
	public void testMultiples9() {
		// Getting the odd occurrences
		int amount = counter.getMultiplesOf(9);
		// I check the amount is the expected one
		assertEquals(amount, 3);
	}
}
