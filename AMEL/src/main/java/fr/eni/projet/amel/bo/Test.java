package fr.eni.projet.amel.bo;

import java.util.List;

public class Test {
	
	private int idTest;
	private String libelle;
	private String description;
	private int duree;
	private int seuil_haut;
	private int seuil_bas;
	

	private List listeSectionTests;
	private List listeEpreuves;
	
	// getter et setter 
	
	public int getIdTest() { return idTest; }
	public void setIdTest(int idTest) { this.idTest = idTest; }
	
	public String getLibelle() {return libelle; }
	public void setLibelle(String libelle) { this.libelle = libelle; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public int getDuree() { return duree; }
	public void setDuree(int duree) { this.duree = duree; }
	
	public int getSeuil_haut() {return seuil_haut; }
	public void setSeuil_haut(int seuil_haut) { this.seuil_haut = seuil_haut; }
	
	public int getSeuil_bas() {return seuil_bas;}
	public void setSeuil_bas(int seuil_bas) {this.seuil_bas = seuil_bas;}
	
	public List getListeSectionTests() {return listeSectionTests;}
	public void setListeSectionTests(List listeSectionTests) {this.listeSectionTests = listeSectionTests;}
	
	public List getListeEpreuves() {return listeEpreuves;}
	public void setListeEpreuves(List listeEpreuves) {this.listeEpreuves = listeEpreuves;}
	
	
	
	//constructeur 
	/**
	 * @param idTest
	 * @param libelle
	 * @param description
	 * @param duree
	 * @param seuil_haut
	 * @param seuil_bas
	 * @param listeSectionTests
	 * @param listeEpreuves
	 */
	public Test() {
		super();
	}
	
	public Test(int idTest, String libelle, String description, int duree, int seuil_haut, int seuil_bas) {
		super();
		setIdTest(idTest);
		setLibelle(libelle);
		setDescription(description);
		setDuree(duree);
		setSeuil_bas(seuil_bas);
		setSeuil_haut(seuil_haut);
	}
	
	public Test(int idTest, String libelle, String description, int duree, int seuil_haut, int seuil_bas,
			List listeSectionTests, List listeEpreuves) {
		super();
		setIdTest(idTest);
		setLibelle(libelle);
		setDescription(description);
		setDuree(duree);
		setSeuil_bas(seuil_bas);
		setSeuil_haut(seuil_haut);
		setListeEpreuves(listeEpreuves);
		setListeSectionTests(listeSectionTests);
	}
	

	
	
	
	
	
	
	
	
	
	
	

}
