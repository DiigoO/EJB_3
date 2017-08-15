package br.com.fiap.rmi;

import java.rmi.Remote;
import java.util.List;

public interface Carrinho extends Remote{

	void cadastrarItem(Item item);
	
	List<Item> obterItens();
	
	int obterQuantidadeItens();
	
	void adicionarEmail(int matricula, String email);
}
