package fr.zak.designpattern.strategy;

public class Produit {
	private int id;
	private String name;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "IdProduct --> " + getId() + " NameProduct --> " + getName();
	}
}
