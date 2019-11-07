package fr.zak.designpattern.strategy;

public class ProduitB extends Produit implements IProduit {

	@Override
	public Produit getProduit() {
		Produit p = new Produit();
		p.setId(2);
		p.setName("produit B");
		System.out.println(p.toString());
		return p;
		
	}

}
