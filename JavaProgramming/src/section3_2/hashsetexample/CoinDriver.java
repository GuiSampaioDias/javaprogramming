package section3_2.hashsetexample;

import java.util.HashSet;

public class CoinDriver {

	public static void main(String[] args) {
		
		HashSet<Coin> wallet =  new HashSet();
		
		Coin coin1 = new Coin(1);
		Coin coin5 = new Coin(5);
		Coin coin10 = new Coin(10);
		Coin coin25 = new Coin(25);
		Coin coin50 = new Coin(50);
		Coin coin100 = new Coin(100);

		wallet.add(coin1);
		wallet.add(coin5);
		wallet.add(coin10);
		wallet.add(coin25);
		wallet.add(coin25);
		wallet.add(coin50);
		wallet.add(coin100);
		wallet.add(coin100);
		
		displaywallet(wallet);
		
		System.out.println("Carteira tem " + wallet.size() + " moedas.");
		System.out.println("A carteira está vazia? " + wallet.isEmpty());
		System.out.println("A carteira contém moeda de 25: " + wallet.contains(coin25));
		
		
		wallet.clear();
		
		System.out.println("Carteira tem " + wallet.size() + " moedas.");
		System.out.println("A carteira está vazia? " + wallet.isEmpty());
		
		
	}

	public static void displaywallet(HashSet<Coin> wallet) {
		for(Coin arrtem : wallet) {
			System.out.println(arrtem.getDenomination());
		}
	}
}
