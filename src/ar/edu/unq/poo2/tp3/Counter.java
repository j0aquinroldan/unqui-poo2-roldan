package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.Collection;

public class Counter {

	private Collection<Integer> arregloDeEnteros = new ArrayList<Integer>();

	public void addNumber(int number) {
		this.arregloDeEnteros.add(number);
	}

	public int getEvenOcurrences() {
		int evenOcurrences = 0;

		for (int num : this.arregloDeEnteros) {
			evenOcurrences += OneIfEven_(num);
		}
		return evenOcurrences;
	}

	public int OneIfEven_(int number) {
		int i = 0;

		if (number % 2 == 0) {
			i = 1;
		}
		return i;
	}

	public int getOddOcurrences() {
		int oddOcurrences = 0;

		for (int num : this.arregloDeEnteros) {
			oddOcurrences += OneIfOdd_(num);
		}
		return oddOcurrences;
	}

	public int OneIfOdd_(int number) {
		int i = 0;

		if (number % 2 != 0) {
			i = 1;
		}
		return i;
	}

	public int getMultiplesOf(int num) {

		int multiples = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				multiples++;
			}
		}
		return multiples;
	}

	public int getMoreOddDigits(ArrayList<Integer> lista) {
		// debe haber al menos un numero de la lista con un digito par

		int moreOdds = lista.get(1);
		for (int entero : lista) {
			if (moreOddsThan(entero, moreOdds)) {
				moreOdds = entero;
			}
		}
		return moreOdds;
	}

	public boolean moreOddsThan(int num1, int num2) {

		return (oddsIn_(num1) > oddsIn_(num2));
	}

	public void clearArregloDeEnteros() {
		arregloDeEnteros.clear();
	}

	public int oddsIn_(int number) {

		int numero = number;
		int digit;
		clearArregloDeEnteros();

		while (numero != 0) {
			digit = numero % 10;
			this.addNumber(digit);
			numero /= 10;
		}
		return (this.getEvenOcurrences());
	}

	public int maxMultiple(int x, int y) {
		int multiplo = x * y;
		int result = multiplo;
		int producto = 2;

		if (multiplo > 1000 || multiplo < 0) {
			result = -1;
		} else {

			while (result <= (1000 - multiplo) && result >= 0) {
				result = multiplo * producto;
				producto++;
			}
		}
		return result;
	}
}
