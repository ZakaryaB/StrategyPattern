package fr.zak.designpattern.strategy;

public class ClientStrategy {
	
	private IProduit iProduit;

	public void getIProduit(){
		iProduit.getProduit();
	}

	public void setiProduit(IProduit iProduit) {
		this.iProduit = iProduit;
	}

	

}
