/**
 	Program nacte koeficienty a, b, c z rovnice ax2 + bx + c = 0
 	a hranicni body x1, x2. 
 	
 	Program vypise, kolik reseni ma dana rovnice v intervalu (x1, x2),
 	v pripade nasobneho korene se pocita pouze jedno reseni.
 	
 	Vystup musi byt jeden z nasledujicich:
 	reseni: neexistuje 
 	reseni: existuje jedno
 	reseni: existuji dve
 	
    @author lukmar | Lukas Martinek
    @version 2021-10-24
*/

/**
	Program mame ulozeny v balicku ppa1.
*/

package ppa1;

/**
	Importujeme knihovnu java.util.*, protoze budeme potrebovat Scanner, ktery se v teto knihovne nachazi.
*/

import java.util.*;

public class Ppa1u03a {
	
	/**
		Metoda main je vstupni bod programu.
	*/

	public static void main(String[] args) {
				
		// VYTVORENI SCANNERU A NASTAVENI LOKALNIHO JAZYKU
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		// VSTUPNI PARAMETRY
		System.out.print("Zadej koeficient a: ");				// 3
		double a = s.nextDouble();
		
		System.out.print("Zadej koeficient b: ");				// -4
		double b = s.nextDouble();
		
		System.out.print("Zadej koeficient c: ");				// -2
		double c = s.nextDouble();
		
		System.out.print("Zadej pocatek intervalu x1: ");		// 0
		double pocatekX1 = s.nextDouble();
		
		System.out.print("Zadej konec intervalu x2: ");			// 2
		double konecX2 = s.nextDouble();
		
		// VYPOCTY KVADRATICKE ROVNICE
		double diskriminant = (b*b) - (4 * a * c);
		double x1 = (- b + Math.sqrt(diskriminant)) / (2 * a);
		double x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
		
		int reseni;
		
		// PODMINKY
		if (x1 >= pocatekX1 && x1 <= konecX2 && x2 >= pocatekX1 && x2 <= konecX2) {
			reseni = 2;
		}
			else if (x1 >= pocatekX1 && x1 <= konecX2 || x2 >= pocatekX1 && x2 <= konecX2) {
				reseni = 1;
			}
				else reseni = 0;
		
		// VYSLEDKY
			if (reseni == 0) {
				System.out.println("reseni: neexistuje");
			}
				else if (reseni == 1) {
					System.out.println("reseni: existuje jedno");
				}
					else if (reseni == 2) {
						System.out.println("reseni: existuji dve");
					}
	}
}