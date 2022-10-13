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
@Exercice(nom = "InteractifSommeArithmetique")
public class Ex15_InteractifSommeArithmetique {

	/**
	 * Ne pas modifier les informations portées par l'annotation.
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {

		Scanner scanner = new Scanner(System.in);

		// TODO Demandez un nombre à l'utilisateur puis LOGUEZ ce nombre
		// avec Resultat.log

		// Affichage d'un message
		System.out.println("Veuillez saisir un nombre : ");
		// Attente d'une saisie par l'utilisateur et affichage du nombre
		int nb = scanner.nextInt();
		System.out.println("Le nombre saisi est : ");
		Resultat.log(nb);

		// TODO LOGUEZ avec Resultat.log la somme de 1 à ce nombre inclus
		System.out.println("Le résultat est : ");
		int res = 0;
		for (int i = 1; i <= nb; i++ ) {
			res += i;
		}
		Resultat.log(res);

		scanner.close();
	}

}
