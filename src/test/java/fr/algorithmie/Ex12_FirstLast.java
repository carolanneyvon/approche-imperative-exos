package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes. Utilisez
 * Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom = "FirstLast")
public class Ex12_FirstLast {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 1, 6 };
	int[] tab4 = { 1, 6, 1 };

	/**
	 * Ne pas modifier les informations portées par l'annotation.
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() throws Exception {

		// TODO Calculez une valeur booléenne qui contrôle le tableau de la sorte :
		// o elle vaut true si le tableau est de longueur supérieure ou égale à 1
		// et que le premier et le dernier élément du tableau ont la même valeur
		// o elle vaut false dans les autres cas
		System.out.println("Valeur obtenue pour chaques tableaux : ");
		
		// boolean value1 = tab1.length>=1 && (tab1[0] == tab1[tab.length - 1])); fois 6 pour chaques tables
		// int [][] tabs = {tab1, tab2, tab3, tab4};

		for (int i = 1; i <= 4; i++) {
			int[] tab = (int[]) this.getClass().getDeclaredField("tab" + i).get(this);

			// TODO LOGUEZ la valeur obtenue pour chacun des tableaux tab1 à tab4
			
			//Resultat.log(value1); fois 6 pour chaques tables
			Resultat.log(tab.length >= 1 && (tab[0] == tab[tab.length - 1]));
		}
	}
}
