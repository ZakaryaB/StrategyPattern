package fr.zak.designpattern.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientStrategy clientStrategy = new ClientStrategy();
		System.out.println(" Produit A .......");
		
		clientStrategy.setiProduit(new ProduitA());
		clientStrategy.getIProduit();
		
		System.out.println(" Produit B .......");
		clientStrategy.setiProduit(new ProduitB());
		clientStrategy.getIProduit();
		
	}

}
