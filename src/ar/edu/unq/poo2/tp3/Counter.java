package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.Collection;

public class Counter {
	
	private Collection<Integer> arregloDeEnteros = new ArrayList<Integer>() ;
	
	public void addNumber(int number) {
		this.arregloDeEnteros.add(number);
	}
	
	public int getEvenOcurrences() {
		int evenOcurrences=0;
		
		for(int num: this.arregloDeEnteros ) {
			if (num % 2 == 0) {
				evenOcurrences +=1;
			}
			
			
		}
		return evenOcurrences;
	}
	
	public int getOddOcurrences() {
		int oddOcurrences=0;
		
		for(int num: this.arregloDeEnteros) {
			if(num % 2 != 0) {
				oddOcurrences++;
			}
		}
		return oddOcurrences;
	}
	
	public int getMultiplesOf(int num){
		
		int multiples = 0;
		
		for (int i=1; i <= num; i++) {
			if (num % i == 0) {
				multiples++;
			}
		}
	return multiples;
	}
	
	public int getMoreOddDigits(ArrayList<Integer> lista) {
		
		int moreOdds;
		for (int entero:lista) {
			
		}
		
		
		return moreOdds
	}
	
	
}	
	
	


