package escadaseserpentes;

import java.util.Arrays;

import escadaseserpentes.Space.Type;

public class Board implements Printable {

	
	private Space[] spaces;
	private Space spaceHome;
	private Space spaceStartHere;
	
	public Board(int numSpaces) {
		spaces = new Space[numSpaces + 2];
		
		
		
		for (int i = 0; i < spaces.length; i++) {
			
			if (i == 0) {
				spaces[i] = new Space(0, Type.START_HERE);
				spaceStartHere = spaces[i];
			} else if(i == spaces.length - 1) {
				spaces[i] = new Space(i, Type.HOME);
				spaceHome = spaces[i];				
			} else {
				spaces[i] = new Space(i, Type.REGULAR);
			}
			
		}
		
	}

	@Override
	public String toString() {
		return "Board [spaces=" + Arrays.toString(spaces) + "]"; 
	}

	@Override
	public void print() {
		
		System.out.println("TABULEIRO:");
		for (Space space : spaces) {
			System.out.print(space + " ");
		}
		System.out.println();
	}

	public void setupCounters(Counter[] counters) {
		for (Counter counter : counters) {
			counter.goTo(spaceStartHere);
		}
		
	}

	
	
	
	
	

}
