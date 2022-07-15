package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Pages;
import runner.Executa;

public class Testes {

	Executa executa = new Executa();
	Pages pages = new Pages();

	// CT01
	@Given("que eu esteja na tela de cadastro para adicionar produtos")
	public void queEuEstejaNaTelaDeCadastroParaAdicionarProdutos() {

		executa.iniciarTeste("file:///C:/Users/felli/OneDrive/%C3%81rea%20de%20Trabalho/teste-1.html");

	}

	@Given("preencher todos os campos corretamente")
	public void preencherTodosOsCamposCorretamente() {

		pages.preencherCampos("Uva Verde", "R$ 3,00", "30/10/2021");

	}

	@When("adicionar")
	public void adicionar() {

		pages.adicionar();
	}

	@Then("produto tela01 adicionado com sucesso")
	public void produtoTela01AdicionadoComSucesso() {

		pages.produtoAdicionadoTela01();
	}

	// CT02

	@Given("preencher todos os campos incorretamente")
	public void preencherTodosOsCamposIncorretamente() {

		pages.preencherCamposIncorretamente("Nome Incorreto" , "-1000000", "3000000000000");
	}

	@Then("produto com todos os dados incorreto adicionado com sucesso")
	public void produtoComTodosOsDadosIncorretoAdicionadoComSucesso() {

		pages.produtoIncorretoTela01();

	}

	// CT03

	@Given("que eu esteja na tela02 de cadastro para adicionar produtos")
	public void queEuEstejaNaTela02DeCadastroParaAdicionarProdutos() {

		executa.iniciarTeste("file:///C:/Users/felli/OneDrive/%C3%81rea%20de%20Trabalho/teste-2.html");
	}

	@Then("produto tela02 adicionado com sucesso")
	public void produtoTela02AdicionadoComSucesso() {

		pages.produtoAdicionadoTela02();
	}

	// CT04

	@Given("preencher campo nome incorreto")
	public void preencherCampoNomeIncorreto() {

		pages.preencherCampoNomeIncorreto("SDSD1S2D12SD2112500");

	}

	@Given("preencher campo preco incorreto")
	public void preencherCampoPrecoIncorreto() {

		pages.preencherCampoPreco("Rzz 15000");
	}

	@Given("preencher validade")
	public void preencherValidade() {

		pages.preencherValidade("15/06/2021");
	}

	@Then("produto com nome e preco incorreto adicionados com sucesso")
	public void produtoComNomeEPrecoIncorretoAdicionadosComSucesso() {

		pages.produtoIncorretoTela02();
	}

	// CT05

	@Given("que eu esteja na tela03 de cadastro para adicionar produtos")
	public void queEuEstejaNaTela03DeCadastroParaAdicionarProdutos() {

		executa.iniciarTeste("file:///C:/Users/felli/OneDrive/%C3%81rea%20de%20Trabalho/teste-3.html");

	}

	@Then("produto tela03 adicionado com sucesso")
	public void produtoTela03AdicionadoComSucesso() {

		pages.produtoAdicionadoTela03();
	}

	// CT06

	@Given("preco correto")
	public void precoCorreto() {

		pages.preencherCampoPreco("5");
	}

	@Given("validade correta")
	public void validadeCorreta() {

		pages.preencherValidade("15/01/2021");
	}

	@Then("produto com nome incorreto adicionado com sucesso")
	public void produtoComNomeIncorretoAdicionadoComSucesso() {

		pages.produtoIncorretoTela03();
	}
	
	// CT07
	

	@Then("campos em branco cadastrado")
	public void camposEmBrancoCadastrado() {
	    
		pages.telaEmBranco();
	}

	// CT08
	

	@Then("obrigatorio preencher campos tela02 para adicionar")
	public void obrigatorioPreencherCamposTela02ParaAdicionar() {
	 
		pages.telaEmBranco02();
	}


	// CT09
	
	@Then("obrigatorio preencher campos tela03 para adicionar")
	public void obrigatorioPreencherCamposTela03ParaAdicionar() {
	    
		pages.telaEmBranco03();
	}








}
