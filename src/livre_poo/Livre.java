package livre_poo;

import java.util.Scanner;


public class Livre {
	//Attribut
	public static int ID;
	public String titre;
	public String auteur;
	public int prix;
	
	public Livre(String titre, String auteur, int prix) {
		ID++;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre =0;
		System.out.println("Combien de livre voulez vous ? ");
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextInt();
		sc.nextLine();
		Livre[] livres= new Livre[nombre];
		for (int i=0; i<livres.length; i++) {
			System.out.println("Donner le titre du livre "+(i+1));
			String titreLivre = sc.nextLine();
			System.out.println("Donner l'auteur du livre "+(i+1));
			String auteurLivre = sc.nextLine();
			System.out.println("Donner le prix du livre "+(i+1));
			int prixEuros = sc.nextInt();
			sc.nextLine();
			livres[i] = new Livre(titreLivre,auteurLivre,prixEuros);
		}
		
		for (int i =0; i<livres.length; i++) {
			System.out.println(livres[i].toString());
		}
		
		sc.close();

	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String toString() {
		return "Le prix du livre "+titre+" de l'auteur "+auteur+" est à : "+prix+" euros \r\nLa référence du livre est "+ID; 
	}

}
