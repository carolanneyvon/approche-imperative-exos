package fr.algorithmie;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		System.out.println("Veuillez saisir 10 nombres entiers : ");
		
		int[] nb = new int[10];
		
		for (int i = 0; i < nb.length; i++) {
			 nb[i] = scanner.nextInt();
		}
		
		// TODO Affichez chaque nombre saisi avec Resultat.log
		System.out.println("Les nombres saisis sont : ");
		for (int i = 0; i < nb.length; i++) {
			Resultat.log(nb[i]);
		}
		
		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
		System.out.println("Le nombre maximum est : ");
		int max = nb[0];

		for (int i : nb) {
			if (i > max)
				max = i;
		}
		Resultat.log(max);
		
		scanner.close();
	}

}
