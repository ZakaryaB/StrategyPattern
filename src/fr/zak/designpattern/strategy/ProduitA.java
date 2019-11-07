package fr.zak.designpattern.strategy;

public class ProduitA extends Produit implements IProduit {
	
	@Override
	public Produit getProduit() {
		Produit p = new Produit();
		p.setId(1);
		p.setName("produit A");
		System.out.println(p.toString());
		return p;
	}

}
