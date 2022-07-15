package pages;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;

public class Pages extends Drivers {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void preencherCampos(String produto, String preco, String validade) {

		metodos.preencher(el.produto, produto);
		metodos.preencher(el.preco, preco);
		metodos.preencher(el.validade, validade);

	}

	public void adicionar() {

		metodos.clicar(el.adicionar);
	}

	public void preencherCamposIncorretamente(String nomeIncorreto, String precoIncorreto , String validadeIncorreta) {

		metodos.preencher(el.produto, nomeIncorreto);
		metodos.preencher(el.preco, precoIncorreto);
		metodos.preencher(el.validade, validadeIncorreta);

	}

	public void produtoAdicionadoTela01() {

		metodos.screenShot("Produto tela 01 adicionado com sucesso");
	}

	public void produtoAdicionadoTela02() {

		metodos.screenShot("Produto tela 02 adicionado com sucesso");
	}

	public void produtoAdicionadoTela03() {

		metodos.screenShot("Produto tela 03 adicionado com sucesso");
	}

	public void produtoIncorretoTela01() {

		metodos.screenShot("Produto tela 01 incorreto adicionado");
	}
	
	public void produtoIncorretoTela02() {

		metodos.screenShot("Produto tela 02 nome e preco incorreto adicionado");
	}
	
	public void produtoIncorretoTela03() {

		metodos.screenShot("Produto tela 03 nome incorreto adicionado");
	}
	
	public void preencherCampoNomeIncorreto(String produto) {
		
		metodos.preencher(el.produto, produto);
	}
	
	public void preencherCampoPreco(String preco) {
		
		metodos.preencher(el.preco, preco);
	}
	
	public void preencherValidade(String validade) {
		
		metodos.preencher(el.validade, validade);
	}
	
	public void telaEmBranco() {
		
		metodos.screenShot("Produtos em branco tela 01");
	}

	public void telaEmBranco02() {
		
		metodos.screenShot("Produtos em branco tela 02");
	}
	public void telaEmBranco03() {
		
		metodos.screenShot("Produtos em branco tela 03");
	}
}
