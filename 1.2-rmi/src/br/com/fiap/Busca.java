package br.com.fiap;

import java.rmi.Naming;

public class Busca {

	public static void main(String[] args) throws Exception {
		Carrinho pequisa = (Carrinho) Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		Item item = new Item();
		item.setNome("Batlefield 1");
		item.setPreco(200.00);
		pequisa.cadastrarItem(item);
	}

}
